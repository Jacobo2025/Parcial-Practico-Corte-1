# Parcial-Practico-Corte-1

Autor: Jacobo Diaz Alvarado

Grupo: 3
## Evidencias

Prueba JUnit 5: mvn test
![Captura de pantalla 2025-09-16 184555.png](docs/imagenes/Captura%20de%20pantalla%202025-09-16%20184555.png)
Prueba Jacoco: mvn clean verify
![Captura de pantalla 2025-09-16 195717.png](docs/imagenes/Captura%20de%20pantalla%202025-09-16%20195717.png)
Prueba SonarQube: mvn clean verify sonar:sonar
![Captura de pantalla 2025-09-16 195210.png](docs/imagenes/Captura%20de%20pantalla%202025-09-16%20195210.png)

4. Identifique los 2 patrones de diseño que se están solicitando a implementar
   en el caso de estudio, especificando por cada uno:
   a. Nombre del Patrón
   b. Tipo de Patrón (Creacional, Estructural o de Comportamiento).
   c. Argumentación del porque se utiliza y como se ve reflejado en el
   diagrama de clases anterior. 

## respuesta 4:
Los patrones de diseño que piden implemetar son
- Abstrac factory: es un patrón creacional, se utiliza aqui porque hay que implementar una "familia" de métodos de pago.
- Command: es un patrón de comortamiento, se utiliza aqui porque hay modulos a quienes se les transmite una información. 