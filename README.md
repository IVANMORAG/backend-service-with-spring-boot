# Song Management API

## Backend Service with Spring Boot

Este proyecto es una API creada con Spring Boot para gestionar canciones. Proporciona funcionalidades para registrar, editar y eliminar canciones.

## Contenido

- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Descripción

Esta API permite a los usuarios gestionar canciones mediante operaciones CRUD (Crear, Leer, Actualizar, Eliminar). Está construida utilizando Spring Boot y se conecta a una base de datos relacional.

## Requisitos

- Java 11 o superior
- Spring Boot 2.5.4 o superior
- Base de datos MySQL

## Instalación

Sigue estos pasos para instalar y ejecutar el proyecto en tu máquina local.

### Paso 1: Crear un nuevo proyecto en Spring Boot

1. Ve a [Spring Initializr](https://start.spring.io/).
2. Configura tu nuevo proyecto con las siguientes dependencias:
    - Spring Web
    - Spring Data JPA
    - MySQL Driver
3. Descarga el proyecto y descomprímelo.

### Paso 2: Configurar la Base de Datos en `application.properties`

Configura tu conexión a la base de datos en el archivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update

