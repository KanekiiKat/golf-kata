/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.estatuas.examendam;

/**
 * Examen de Programación: Sistema de Puntuación de Golf
 * 
 * Desarrollar un sistema que calcule las puntuaciones de un partido de golf
 * siguiendo las modalidades "Stroke Play" y "Stableford".
 * 
 * REQUISITOS:
 * 
 * 1. Implementar las siguientes clases:
 *    - Player: almacena iniciales, handicap, score y puntos Stableford
 *    - ScoreCard: gestiona hasta 4 jugadores (A, B, C, D), lista de hoyos y campo
 *    - Hole: representa un hoyo con su número y par
 *    - StrokePlay: implementa la modalidad de juego stroke play (suma de golpes)
 *    - Stableford: implementa la modalidad de juego Stableford (puntos según diferencia con el par)
 *    - StablefordSystem: enum que representa los diferentes resultados posibles
 * 
 * 2. Implementar el patrón Strategy para las modalidades de juego mediante:
 *    - Interfaz GolfPlay
 *    - Clase ComputeCard que aplica la estrategia seleccionada
 * 
 * 3. Sistema de puntuación Stableford:
 *    - Double Bogey (≥2 sobre par): -3 puntos
 *    - Bogey (1 sobre par): -1 punto
 *    - Par: 0 puntos
 *    - Birdie (1 bajo par): 2 puntos
 *    - Eagle (2 bajo par): 5 puntos
 *    - Albatross (3 bajo par): 8 puntos
 * 
 * 4. Requisitos técnicos:
 *    - Usar Optional para la gestión de jugadores
 *    - Implementar el principio Open/Closed
 *    - Utilizar Streams para el procesamiento de datos
 * 
 * El código siguiente muestra el comportamiento esperado del sistema.
 * La salida por consola debe coincidir con los comentarios indicados.
 */
public class App {

    public static void main(String[] args) {

        /*
         * Crea el torneo reutilizando la clase Course proporcionada.
         */
        Course augusta  = new Course(); 
      
    }
}
        
