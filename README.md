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



1. Diagrama de contexto
![Captura de pantalla 2025-09-18 164915.png](docs/imagenes/Captura%20de%20pantalla%202025-09-18%20164915.png)

2. Establezca las funcionalidades presentes en el caso de estudio y desarrolle
   un diagrama de casos de uso.

# Solución punto 2

- Funcionalidades:
1. Que se cree un objeto método de pago
2. Que avise a los modulos dentro del sistema (factura, inventario, notificación)

- Diagrama de casos de uso.
![Captura de pantalla 2025-09-18 142639.png](docs/imagenes/Captura%20de%20pantalla%202025-09-18%20142639.png)

# Solución del parcial


3. Realice un diagrama de clases que permita entender su solución, adicional
   mencione que principios SOLID está aplicando, en que componentes y
   como.

# Solución punto 3:

- Principio SOLID: el principio SOLID utilizado en este caso es S (Single Responsibility), ya que se pide que la lógica de la clase principal no se modifique si se llega a implementar nuevos métodos de pago o nuevos módulos.

![Captura de pantalla 2025-09-18 144500.png](docs/imagenes/Captura%20de%20pantalla%202025-09-18%20144500.png)




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


5. Desarrolle a nivel de código su solución, realizando la ejecución de los datos
   de entrada del enunciado y presentando las respectivas evidencias de sus
   datos de salida (screenshot). 
