/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintactico;

import java.io.File;


/**
 *
 * @author HP
 */
public class SintactFor {

     public static void generarLexer2(String path2){

        File file2 = new File(path2);
        jflex.Main.generate(file2);
        
    }
      public static void main(String[] args) {
          String path2 = "C:\\Users\\HP\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\analizadorsintactico\\Lexico1";
          generarLexer2(path2);
      }

    
}
