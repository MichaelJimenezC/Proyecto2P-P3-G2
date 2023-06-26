/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herramientas;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class TxtFileProcessor {
    public ArrayList<String[]> processFile(String nombreArchivo, String separador) {
        ArrayList<String> variableGenerado;
        ManejoArchivos manejo= new ManejoArchivos();
        variableGenerado = manejo.LeeFichero(nombreArchivo);
        ArrayList<String[]> arregloFinal = new ArrayList();
        for (int a = 1; a < variableGenerado.size(); a++) {
            String[] linea = variableGenerado.get(a).split(separador);
            arregloFinal.add(linea);
        }
        return arregloFinal;
    }
}
