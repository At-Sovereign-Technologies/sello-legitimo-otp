# Development Environment

## Prerequisites

- Docker Desktop or Docker Engine + Docker Compose
- VS Code
- Dev Containers extension

## Quick Start (Dev Container)

1. Open this repository in VS Code.
2. Run: Dev Containers: Reopen in Container.
3. Wait for post-create bootstrap to finish.
4. Start the service:

```bash
./mvnw spring-boot:run
```

5. Confirm the API port is reachable on 8081.

## Environment Variables

Do not commit secrets. Configure local variables using shell exports or your local container environment.

```env
SPRING_PROFILES_ACTIVE=dev
OTP_PROVIDER=change_me
OTP_TTL_SECONDS=300
```

## Validation

```bash
./mvnw -q -DskipTests dependency:go-offline
./mvnw test
```
