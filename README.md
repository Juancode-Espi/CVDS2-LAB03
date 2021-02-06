# CVDS2-LAB03
## Integrantes:

+ Ricardo Amaya
+ Juan Pablo Espinosa

##  Compilar y Ejecutar
El comando para ejecutar las pruebas unitarias de un proyecto en Maven es `mvn test`.
### Ejecutar las pruebas:
Al ejecutar las pruebas por segunda vez la diferencia fue que en la primera se ejecutó solo la clase de prueba AppTest y en la consola nos salía lo siguiente: `Tests run: 1, Failures: 0, Errors: 0, Skipped: 0`.
Pero al ejecutar las pruebas por segunda vez, después de añadir la clase RegistryTest el resultado que nos dio fue el siguiente: `Tests run: 2, Failures: 0, Errors: 0, Skipped: 0`.

## Finalizar el ejercicio
*Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5:*
-  El que una persona esté viva o muerta tiene precedencia a cualquier valor que su edad pueda tomar o a su previa existencia en la lista de registrados.
     | *Nombre| **Clase de equivalencia* |
	| :---       |     ---     |
	| *DEAD*|  Cuando la persona registrada está muerta|
	| *UNDERAGE*| Cuando la persona está viva y su edad está entre 0 y 17 años|
	| *INVALID_AGE*| Cuando la edad de la persona es un número negativo o un número mayor a 130 años|
	| *VALID*| Cuando la persona registrada esté viva y esté en un rango de edad entre 18 y 130 años|
	| *DUPLICATED*| Cuando una persona se intenta registrar más de una vez|
	