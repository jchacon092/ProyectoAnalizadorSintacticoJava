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
public class SintactWhile {
     public static void generarLexer4(String path4){

        File file4 = new File(path4);
        jflex.Main.generate(file4);
        
    }
      public static void main(String[] args) {
          String path4 = "C:\\Users\\HP\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\analizadorsintactico\\Lexer5";
          generarLexer4(path4);
      }
}
