# Backend Service with Spring Boot

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
```

### Paso 3: Crear el archivo `DatosApiTrak.java`

Define la entidad `DatosApiTrak` con anotaciones de JPA.

### Paso 4: Crear el archivo `CrudApiTraksRepository.java`

Define la interfaz del repositorio extendiendo `JpaRepository`.

### Paso 5: Crear el archivo `ApiTrakService.java`

Define la interfaz del servicio con los métodos CRUD.

### Paso 6: Crear el archivo `ApiTrakServiceImplement.java`

Implementa los métodos definidos en la interfaz del servicio.

### Paso 7: Crear el controlador `ApiTraks.java`

Define el controlador REST para manejar las solicitudes HTTP.

### Paso 8: Uso de Postman para Probar la API

Configura y prueba los endpoints utilizando Postman.

### Paso 9: Verificar cambios en la Base de Datos

Asegúrate de que los datos se actualizan correctamente en la base de datos.

### Paso 10: Configurar Spring Boot para habilitar CORS

Configura CORS en tu aplicación para permitir solicitudes desde diferentes orígenes.

### Paso 11: Configuración del controlador en Spring Boot

Verifica que el controlador está correctamente mapeado a las rutas adecuadas.

## Uso

- **GET /api/traks**: Obtener todas las canciones.
- **GET /api/traks/{id}**: Obtener una canción por ID.
- **POST /api/traks**: Crear una nueva canción.
- **PUT /api/traks/{id}**: Actualizar una canción existente.
- **DELETE /api/traks/{id}**: Eliminar una canción.

## Contribución

Para contribuir a este proyecto, por favor sigue los pasos a continuación:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza los cambios necesarios y haz commit (`git commit -m 'Añadir nueva característica'`).
4. Empuja tus cambios al repositorio remoto (`git push origin feature/nueva-caracteristica`).
5. Crea un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
