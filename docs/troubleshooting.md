# Solución de problemas

## Falla en apt-get update dentro del contenedor
El bootstrap elimina una fuente Yarn inválida del contenedor base antes de ejecutar apt para evitar errores de llave GPG.

## El servicio no responde en 8081
1. Verifica que el proceso Spring Boot esté activo.
2. Revisa la consola por conflictos de puerto.
3. Comprueba que el puerto esté publicado en el contenedor.
