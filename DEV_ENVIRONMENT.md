# Entorno de Desarrollo

## Requisitos

- Docker Desktop o Docker Engine
- VS Code
- Extensión Dev Containers

## Inicio rápido (Dev Container)

1. Abre este repositorio en VS Code.
2. Ejecuta Dev Containers: Reopen in Container.
3. Espera a que termine el post-create bootstrap.
4. Inicia el servicio:

```bash
./mvnw spring-boot:run
```

5. Verifica que la API esté disponible en el puerto 8081.

## Variables de entorno sugeridas

No publiques secretos en el repositorio. Usa variables locales del contenedor o del shell.

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

## Nota operativa

El bootstrap elimina una fuente Yarn inválida del contenedor base antes de ejecutar apt-get update para evitar fallos por llaves GPG externas.
