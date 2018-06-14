# Addresses Service

Service to manage CRUD operations for Adresses, using `NodeJS`, persisting data in MongoDB

Fields:
- userId
- fullAddress

Operations:
- retrieve all addresses of a user, identified by userId
- retrieve all addresses that match a pattern (i.e. `All addresses that contains "Street", or all addresses that contains "Toledo"`)
- retrieve all addresses

Constraints:
- An address is unique
- A user can have as many adresses as desired