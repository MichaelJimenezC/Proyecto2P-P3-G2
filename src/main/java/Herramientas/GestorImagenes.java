/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herramientas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.scene.image.Image;

/**
 *
 * @author Michael
 */
public class GestorImagenes {
    public static Image abrirImagen(String nombreImagen){
       Image img=null;
       try(FileInputStream f=new FileInputStream(nombreImagen)){
           img=new Image(f);
       }catch(FileNotFoundException f){
           System.out.println("No se encontró el archivo solicitado");
       }catch(IOException i){
           System.out.println("Hubo un error, inténtalo más tarde");
       }
       return img;
   }
}
