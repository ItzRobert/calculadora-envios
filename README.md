# Calculadora de Tarifas de Envío

## Descripción
Aplicación web desarrollada en Spring Boot que permite calcular el costo de envío de un paquete según su peso y el país de destino.

## Tecnologías
- Java
- Spring Boot
- Thymeleaf
- SQL Server
- Maven

## Funcionalidades
- Ingreso del peso del paquete
- Selección del país (India, US, UK)
- Validación de datos
- Cálculo automático del costo
- Consulta de tarifas desde base de datos

## Reglas de negocio
- India: 5 USD/kg
- US: 8 USD/kg
- UK: 10 USD/kg

## Ejecución
1. Configurar el archivo application.properties
2. Ejecutar la aplicación
3. Abrir en el navegador:
   http://localhost:8081/envio

