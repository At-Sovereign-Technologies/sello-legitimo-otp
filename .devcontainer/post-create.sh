#!/usr/bin/env bash
set -euo pipefail

echo "[bootstrap] Starting Java service environment bootstrap"

if command -v apt-get >/dev/null 2>&1; then
  pkgs=()
  if ! command -v pg_isready >/dev/null 2>&1; then
    pkgs+=(postgresql-client)
  fi
  if ! command -v redis-cli >/dev/null 2>&1; then
    pkgs+=(redis-tools)
  fi
  if [ ${#pkgs[@]} -gt 0 ]; then
    sudo apt-get update
    sudo DEBIAN_FRONTEND=noninteractive apt-get install -y "${pkgs[@]}"
  fi
fi

if find . -name pom.xml -print -quit | grep -q .; then
  mvn -q -DskipTests dependency:go-offline || true
fi

echo "[bootstrap] Java service environment ready"
