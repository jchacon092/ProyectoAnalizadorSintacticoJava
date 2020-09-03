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
public class Sintact {
     public static void generarLexer1(String path1){

        File file1 = new File(path1);
        jflex.Main.generate(file1);
        
    }
      public static void main(String[] args) {
          String path1 = "C:\\Users\\HP\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\analizadorsintactico\\Lexer2.Jflex";
          generarLexer1(path1);
      }
}
