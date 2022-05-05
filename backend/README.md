# SeminarioII - Final 05/05/2022
Proyecto backend de gedufy cuyo objetivo es proveer servicios REST con las funcionalidades requeridas.

### Tecnologias utilizadas:
- JDK11
- Spring Boot 2.5.3

### Generacion del proyecto base:
-  https://start.spring.io/

### Generacion artefacto:
-  mvn clean install

### Ver doc apis - ejemplo:
-  http://localhost:8080/swagger-ui/index.html

### Ver doc apis - proyecto:
-  http://localhost:8080/swagger-ui.html

### Funcionalidades provistas:
- Cursos, Categorías, Favoritos

### Funcionalidades a desarrollar:
- Formulario de Contacto. Para lo cual se requiere: 
1) Tab y pantalla (formulario con 3 campos Nombre, Correo y Mensaje. Ademas, boton Enviar).
2) Crear un nuevo servicio (POST) que reciba el objeto contacto por parámetro, guarde los datos del mismo en la BD (tabla contacto). Y devuelva la respuesta al frontend.
3) Crear la nueva tabla en BD: CONTACTO, para guardar la información que recibe el dicho servicio.

### Arquitectura base disponible para iniciar el desarrollo:
- BD: dump de BD MySQL
- Backend: aplicación base (Maven/java) 
- Frontend: aplicación base (ionic)

### Nota:
Es responsabilidad del alumno la estabilidad del ambiente de desarrollo que utiliza. Es parte del examen y como tal influye en la nota la capacidad de hacer funcionar la aplicación base: BD, backend (instalar dependencias en el caso que haga falta mvn clean install) y frontend (npm install).