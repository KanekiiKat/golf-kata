package edu.estatuas.examendam;


import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Representa un recorrido de golf y gestiona los golpes realizados por cada jugador.
 * Utiliza una estructura de datos Table para almacenar el número de golpes de cada jugador
 * en cada hoyo, donde:
 * - Clave de fila: iniciales del jugador
 * - Clave de columna: número de hoyo
 * - Valor: golpes realizados
 */
public class Course {

    private final Table<String, Byte, Byte> playersCourse = HashBasedTable.create();

    /**
     * Crea un nuevo recorrido vacío.
     */
    public Course() {};
    
}
