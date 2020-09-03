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
public class AnalizadorSintactico {

    /**
     * @param args the command line arguments
     */
    
     public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "C:\\Users\\HP\\Documents\\NetBeansProjects\\AnalizadorSintactico\\src\\analizadorsintactico\\Lexer.Jflex";
        generarLexer(path);
        
    }
    
}
