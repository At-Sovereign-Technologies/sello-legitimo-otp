# OTP Service

Servicio encargado de:
- Generar códigos OTP
- Validar códigos OTP

## Requisitos
- Java 17+
- Maven

## Ejecutar
mvn clean install
mvn spring-boot:run

## Endpoints

POST /api/v1/otp/generate
{
  "cedula": "123456"
}

POST /api/v1/otp/validate
{
  "cedula": "123456",
  "otp": "000000"
}
