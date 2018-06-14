# Docker-kata for GDG Toledo

## Specs

We have three microservices in three different stacks (NodeJS, Golang and Java)

The kata will consist in create the applications, and dockerized them.

For tests, each service will spin up its dependent store at the beginning of the test suite, and will kill it at the end of the test suite.

If we are talking about runtime, we'll start all services plus all its storages in a `docker-compose` style.