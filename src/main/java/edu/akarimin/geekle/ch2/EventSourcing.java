package edu.akarimin.geekle.ch2;

/**
 * Complete log of every state change.
 * debugging
 * performance
 * scalability
 * microservice pattern integration pattern for Async calls.
 * ES and CQRS.
 * Change Capture Date (CDC) - Understand Kafka concepts. Event Bus instead of DB ?
 * Command sourcing, Event Collaboration. Study.
 * Avoid frameworks which merge persistence with business logic like JPA, Axon Framework, JSON... as Uncle Bob says
 * "persistence should be only a plugin to your code and nothing more."
 * */
public class EventSourcing {
    /**
     * Commands, Events, State
     * 2 methods on state:
     * - Process(command: Command): List[Event]
     * - apply(event: Event): state
     * Snapshotting, fail-over, recover, debugging, sharding, serialization & schema validation, concurrency access
     * Do not Use already developed ES frameworks. (ideal)
     * In domain package: events,commands,models
     * In application package: domains
     * Use Akka Persistence vs. Lagom
     * Akka Persistence Typed ?
     * Cassandra (distributed), leaderless (no single point of failure), optimized for writes
     * 100,000 tps
     * Store binary. (Google proto-buffer) -> schema evolution is fully covered.
     * Facebook Thrift not as good as Protobuff.
     * Avro Hadoop is also a good deserialzer.
     * Do not implement it everywhere, it is costly.
     * Healing command ?
     * Handling duplicates in distributed system is nightmare.
     * Projectors are consumers and should persist idempotently to read model DB.
     * compensating actions: - pessimistic - optimistic
     * SAGA patter ?
     * Split brain clustering ?
     * */
}
