# Entorno

## Requisitos
- Docker Desktop o Docker Engine
- VS Code
- Extensión Dev Containers

## Variables sugeridas
```env
SPRING_PROFILES_ACTIVE=dev
OTP_PROVIDER=change_me
OTP_TTL_SECONDS=300
```

## Validación
```bash
./mvnw -q -DskipTests dependency:go-offline
./mvnw test
```
