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
public class SintactIf {
    
    public static void generarLexer3(String path3){

        File file3 = new File(path3);
        jflex.Main.generate(file3);
        
    }
      public static void main(String[] args) {
          String path3 = "C:\\Users\\HP\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\analizadorsintactico\\Lexico";
          generarLexer3(path3);
      }
    
    

    
}
