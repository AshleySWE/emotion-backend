# Emotion Backend - Clean Architecture

This project follows the principles of Clean Architecture to ensure separation of concerns, maintainability, and testability. The project is modularized into the following layers:

## Modules

### 1. Domain (`:domain`)
*   **Responsibility**: This is the core of the application. It contains the enterprise business rules and entities.
*   **Contents**:
    *   **Entities**: Domain objects that encapsulate critical business data and behavior.
    *   **Value Objects**: Immutable objects defined by their attributes.
    *   **Repository Interfaces (Ports)**: Interfaces defining how to access data, implemented by the Infrastructure layer.
    *   **Domain Services**: Logic that doesn't naturally fit within an entity.
*   **Dependencies**: This module has **no dependencies** on other modules or frameworks (pure Java).

### 2. Application (`:application`)
*   **Responsibility**: Orchestrates the flow of data to and from the domain entities. It implements the use cases of the application.
*   **Contents**:
    *   **Use Cases / Interactors**: Specific business rules for the application.
    *   **DTOs (Data Transfer Objects)**: Objects used to transfer data between layers.
    *   **Interfaces**: Input and output ports for the application.
*   **Dependencies**: Depends on the **Domain** module.

### 3. Infrastructure (`:infrastructure`)
*   **Responsibility**: Provides implementations for the interfaces defined in the Domain and Application layers. It deals with external details like databases, external APIs, and frameworks.
*   **Contents**:
    *   **Repository Implementations**: Implementation of domain repository interfaces (e.g., using Spring Data JPA).
    *   **External Services**: Clients for third-party APIs.
    *   **Configuration**: Framework-specific configurations (e.g., database config).
*   **Dependencies**: Depends on **Domain** and **Application** modules.

### 4. API (`:api`)
*   **Responsibility**: The entry point of the application. It handles incoming requests and presents data to the client.
*   **Contents**:
    *   **Controllers**: REST endpoints that handle HTTP requests.
    *   **Main Application**: The Spring Boot application entry point.
    *   **Exception Handling**: Global exception handlers.
*   **Dependencies**: Depends on **Application**, **Domain**, and **Infrastructure** modules (to wire dependencies at runtime).

## Architecture Flow

`API (Controller)` -> `Application (Use Case)` -> `Domain (Entity/Service)` -> `Infrastructure (Repository Implementation)`

The dependency rule is strictly followed: source code dependencies only point inwards. The outer circles (Infrastructure, API) depend on inner circles (Application, Domain).
