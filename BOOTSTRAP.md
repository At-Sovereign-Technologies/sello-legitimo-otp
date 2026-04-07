# Notas de Bootstrap

## Origen

Este repositorio adopta la línea base de migración devcontainer definida para org-migration.

## Cambios aplicados

1. Se agregó .devcontainer/devcontainer.json con Java 21 y Git.
2. Se agregó .devcontainer/post-create.sh para instalar utilidades CLI y precargar dependencias Maven.
3. Se agregó DEV_ENVIRONMENT.md para configuración reproducible.
4. Se ajustó bootstrap para remover la fuente Yarn inválida antes de apt-get update.

## Decisiones de dependencias

- Runtime: Java 21 (imagen de devcontainer)
- Build: Maven Wrapper con warmup offline
- Utilidades del sistema: postgresql-client, redis-tools

## Idempotencia

- El bootstrap valida herramientas instaladas antes de apt install.
- El warmup de Maven se puede ejecutar múltiples veces sin efectos colaterales.
- No se almacenan secretos en archivos versionados.
