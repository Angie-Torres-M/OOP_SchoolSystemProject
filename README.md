# School System Project

Este proyecto implementa un sistema escolar básico en Java con dos clases principales: Student y Course. Permite gestionar estudiantes, cursos, inscripciones y evaluaciones mediante principios de programación orientada a objetos.

## Contenido

### Student

La clase Student representa a un estudiante y contiene:

* Nombre y apellido
* Matrícula
* Calificación
* Año escolar

Incluye métodos para:

* Imprimir el nombre completo
* Verificar si un estudiante está aprobado (calificación >= 60)
* Avanzar de año cuando el estudiante ha aprobado

La clase cuenta con tres constructores que permiten crear objetos con distintos niveles de información.

### Course

La clase Course representa un curso académico e incluye:

* Nombre del curso
* Nombre del profesor
* Año del curso
* Lista de estudiantes inscritos

Métodos implementados:

* Inscribir estudiantes
* Desinscribir estudiantes
* Contar el número de inscritos
* Obtener la mejor calificación
* Sobrecargar el método enroll para aceptar un arreglo de estudiantes

Funciones adicionales:

* Calcular el promedio general del curso
* Generar un ranking de estudiantes ordenado por calificación
* Indicar si cada estudiante está por encima o por debajo del promedio del curso

### Main

La clase Main permite poner a prueba todas las funcionalidades del sistema.
Crea objetos Student y Course, realiza inscripciones y muestra en consola:

* El promedio del curso
* El ranking de estudiantes
* El estado de cada estudiante respecto al promedio (encima o debajo)
* Mensajes de aprobación y avance de año

## Requerimientos

* Java 8 o superior
* Eclipse, IntelliJ IDEA o cualquier entorno compatible

## Ejecución

Compilar y ejecutar la clase Main para visualizar los resultados en consola.

