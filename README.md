# Docker-kata for GDG Toledo

## Specs

We have three microservices in three different stacks (NodeJS, Golang and Java)

The kata will consist in create the applications, and dockerized them.

For tests, each service will spin up its dependent store at the beginning of the test suite, and will kill it at the end of the test suite.

If we are talking about runtime, we'll start all services plus all its storages in a `docker-compose` style.

## Requirements

1. Bring your computer, that's super important :nerd_face:
2. Have the stack you want to work on somehow decided: `Golang`, `Java (we are open to any framework: SpringBoot, Play!, Micronaut, Servlets...)` or `NodeJS`.

## Ultimate goals

At the end of the day these are the ultimate goals of the kata:

0. all the code for the kata must be on Github, in a fork of the kata or contributed to the central repository as a pull request.
1. each service must be written in its language
2. each service must have unit tests verifying internal logic
3. each service must have integration tests, verifying dependencies (with other services, with its datastore...)
4. each service must be published as a Docker image on Docker Hub, under gdgtoledo's account.