# Bootstrap Notes

## Source

This repository adopts the organization-wide devcontainer migration baseline from the Sello Legitimo workspace.

## Applied Migration Steps

1. Added `.devcontainer/devcontainer.json` with Java 21 + Git feature.
2. Added `.devcontainer/post-create.sh` to install CLI dependencies and preload Maven artifacts.
3. Added `DEV_ENVIRONMENT.md` for reproducible setup and env placeholders.
4. Added changelog entry documenting migration.

## Dependency Decisions

- Runtime: Java 21 (devcontainer image)
- Build tooling: Maven wrapper + offline cache warmup
- System tooling: `postgresql-client`, `redis-tools`

## Idempotency

- Bootstrap checks installed tools before apt installs.
- Maven warmup can run repeatedly without side effects.
- Secrets are represented only as placeholders.
