# Distributed E-Commerce Platform

> **6+ microservices · Kafka · Saga Pattern · Kubernetes · 10K req/sec-ready architecture**

A production-style backend blueprint for a modern e-commerce system built with **Spring Boot 3** and **Spring Cloud**.

![Stack](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot)
![Kafka](https://img.shields.io/badge/Kafka-Event%20Driven-231F20?logo=apachekafka)
![Redis](https://img.shields.io/badge/Redis-Cache%20%26%20Sessions-DC382D?logo=redis)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Relational%20Data-4169E1?logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-Containerized-2496ED?logo=docker)
![Kubernetes](https://img.shields.io/badge/Kubernetes-Orchestrated-326CE5?logo=kubernetes)
![Resilience4j](https://img.shields.io/badge/Resilience4j-Fault%20Tolerance-orange)
![ELK](https://img.shields.io/badge/ELK-Observability-yellow)

## Why this gets you hired

This project demonstrates practical understanding of:
- **Distributed transactions** with the **Saga pattern**
- **Event-driven architecture** using **Kafka**
- **Circuit breakers and resilience** for service-to-service calls
- **Production observability** with logs, traces, and metrics

If you're preparing for fintech/product interviews, this is exactly the system design they will ask you to explain.

## Architecture

```text
ecommerce-platform/
├── pom.xml                    # parent pom
├── eureka-server/             # Service Discovery :8761
├── api-gateway/               # Spring Cloud Gateway :8080
├── config-server/             # Centralized config :8888
├── user-service/              # Auth + Users :8081
├── product-service/           # Products + Search :8082
├── order-service/             # Orders + Saga :8083
├── payment-service/           # Payments :8084
├── inventory-service/         # Stock :8085
└── notification-service/      # Email/SMS :8086
```

## Services you'll build

### User Service (`:8081`)
- JWT auth + refresh
- Redis sessions
- RBAC

### Product Service (`:8082`)
- Elasticsearch search
- Redis caching
- CRUD + pagination

### Order Service (`:8083`)
- Saga orchestrator
- State machine
- Kafka events

### Payment Service (`:8084`)
- Idempotency
- Webhook handling
- Retry + backoff

### Inventory Service (`:8085`)
- Optimistic locking
- Kafka consumer
- Stock alerts

### Notification Service (`:8086`)
- Email/SMS via Kafka
- Template engine
- Retry queue

## Getting started

### Prerequisites
- Java 17
- Maven 3.9+

### Build all modules

```bash
mvn -q clean compile
```

### Next steps
1. Add domain entities and APIs per service.
2. Add Kafka contracts and saga flow.
3. Add Docker Compose and Kubernetes manifests.
4. Add CI/CD + observability stack.
