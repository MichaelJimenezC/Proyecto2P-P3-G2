/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Herramientas;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author Michael
 */
public interface IManejoArchivos {
    ArrayList<String> LeeFichero(String nombrearchivo);
    void EscribirArchivo(String nombreArchivo, String linea);   
    Image abrirImagen(String nombreImagen);   
}
