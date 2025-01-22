#ifndef SHARED_MEMORY_UTILS_HPP
#define SHARED_MEMORY_UTILS_HPP

#include <boost/interprocess/interprocess_fwd.hpp>
#include <boost/interprocess/managed_shared_memory.hpp>
#include <boost/interprocess/sync/interprocess_mutex.hpp>
#include <boost/interprocess/sync/interprocess_condition.hpp>
#include <cstddef>
#include <cstring>
#include <string>

using namespace boost::interprocess;

struct SharedMemoryLayout {
    size_t action_offset; // Always 0
    size_t action_size; // to be set on initialization
    size_t header_offset; // Always action_size
    size_t header_size; // Always sizeof(SharedDataHeader)
    size_t initial_environment_offset; // Always action_size + sizeof(SharedDataHeader)
    size_t initial_environment_size; // to be set on initialization
};


struct SharedDataHeader {
    interprocess_mutex mutex;
    interprocess_condition condition;
    size_t size;
    bool ready;
};

// Message follows the header

int create_shared_memory_impl(
    int port,
    const char *initial_data,
    size_t data_size,
    size_t action_size,
    bool find_free_port
);

void write_to_shared_memory_impl(
    const std::string &memory_name,
    const char *data,
    const size_t data_size
);

const char *read_from_shared_memory_impl(
    const std::string &memory_name,
    const std::string &management_memory_name,
    size_t &data_size
);

// remove shared memory
void destroy_shared_memory_impl(const std::string &memory_name);

#endif // SHARED_MEMORY_UTILS_HPP
