/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorsintactico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;


/**
 *
 * @author HP
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
     public void ejecutar()throws Exception{
       String resultado="";
       Reader reader =new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Hola.txt"));
       Lexer lexer = new Lexer(reader);
       while(true){
           Token token = lexer.yylex();
           if(token == null){
               
                jTextArea1.setText(resultado);
                return;
          
           }
               switch(token){
                
                case PALABRA:
                    resultado = resultado + "PALABRA RESERVADA: " + lexer.lexeme + "\n";
                    break;
                case OPERADOR_ARITMETICO:
                    resultado = resultado + "OPERADOR ARITMETICO: "  + lexer.lexeme + "\n";
                    break;
                case OPERADOR_LOGICO:
                    resultado = resultado + "OPERADOR LOGICO: "  + lexer.lexeme + "\n";
                    break;
                case OP_ATRIBUTO:
                    resultado = resultado + "OPERADOR ATRIBUTO: " + lexer.lexeme + "\n";
                    break;
                case OP_RELACIONAL:
                    resultado = resultado + "OPERADOR RELACIONAL: " + lexer.lexeme + "\n";
                    break;
                case OP_BOOLEANO:
                    resultado = resultado + "OPERADOR BOOLEANO: " + lexer.lexeme + "\n";
                    break;
                case SEPARADOR:
                    resultado = resultado + "SEPARADOR: " + lexer.lexeme + "\n";
                    break;
                case ESPECIAL:
                    resultado = resultado + "CARACTER ESPECIAL " + lexer.lexeme + "\n";
                    break;
                case COMENTARIO:
                    resultado = resultado + "COMENTARIO: " + lexer.lexeme + "\n";
                    break;
                 case ERROR:
                    resultado = resultado + "ERROR SIMBOLO NO RECONOCIDO \n";
                     break;
                case ID:
                    resultado = resultado + "IDENTIFICADOR: " + lexer.lexeme +"\n";
                    break;
                case NUMERO:
                    resultado = resultado + "NUMERO: " + lexer.lexeme + "\n";
                    break;
                case VAR:
                    resultado = resultado + "Tipo de dato:" + lexer.lexeme + "\n";                    
                
                default:
                    resultado = resultado + "<" + lexer.lexeme +">" ;
                   
            
           
           }
       }
     }
     
     public void ejecutar2()throws Exception{
       String resultado="";
       Reader reader =new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Hola.txt"));
       Lexer2 lexer = new Lexer2(reader);
       while(true){
           Token2 token = lexer.yylex();
           if(token == null){
               
                jTextArea2.setText(resultado);
                return;
          
           }
               switch(token){
                
                
                case VARIABLE_INT:
                    resultado = "Linea: " + lexer.contL + ". " +  resultado + "VARIABLE INT: "  + lexer.lexeme + "\n";
                    break;
                    
               case OP_RELACIONAL:
                    resultado =  "Linea: " + lexer.contL + ". " + resultado + "OPERADOR RELACIONAL: " + lexer.lexeme + lexer.contL + "\n";
                    break;
                    
                case VARIABLE_STRING:
                    resultado =  "Linea: " + lexer.contL + ". " + resultado + "VARIABLE STRING: " + lexer.lexeme + lexer.contL + "\n";
                    break;
                    
                case VARIABLE_CHAR:
                    resultado =  "Linea: " + lexer.contL + ". " + resultado + "VARIABLE CHAR: " + lexer.lexeme + lexer.contL + "\n";
                    break;    
                 case ERROR:
                    resultado = resultado +  "Linea: " + lexer.contL + ". " + "ERROR SINTAXIS INCORRECTA \n";
                     break;
                
                
                
                default:
                    resultado = resultado + "<" + lexer.lexeme +">" ;
                   
            
           
           }
       }
     }
     
     
     public void ejecutar3()throws Exception{
       String resultado="";
       Reader reader =new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Hola.txt"));
       Lexico1 lexer = new Lexico1(reader);
       while(true){
           Token3 token = lexer.yylex();
           if(token == null){
               
                jTextArea2.setText(resultado);
                return;
          
           }
               switch(token){
                
                
                case FOR_LINEA1:
                    resultado = resultado + "FOR: "  + lexer.lexeme  + "\n";
                    break;
                    
               case FOR_LINEA2:
                    resultado = resultado + "FOR: "  + lexer.lexeme  + "\n";
                    break;
                    
                case FOR_LINEA3:
                   resultado = resultado + "FOR: "  + lexer.lexeme + "\n";
                    break;
                    
                case FOR_LINEA4:
                    resultado = resultado + "FOR: "  + lexer.lexeme + "\n";
                    break;
                    
                
                 case ERROR:
                    resultado = resultado + "ERROR SINTAXIS INCORRECTA \n";
                     break;
                
                
                
                default:
                    resultado = resultado + "<" + lexer.lexeme +">" ;
                   
            
           
           }
       }
     }
     
          
     public void ejecutar4()throws Exception{
       String resultado="";
       Reader reader =new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Hola.txt"));
       Lexico lexer = new Lexico(reader);
       while(true){
           Token4 token = lexer.yylex();
           if(token == null){
               
                jTextArea2.setText(resultado);
                return;
          
           }
               switch(token){
                
                
                case IF_LINEA1:
                    resultado = resultado + "IF: "  + lexer.lexeme + "\n";
                    break;
                    
               case IF_LINEA2:
                    resultado = resultado + "IF: "  + lexer.lexeme+ "\n";
                    break;
                    
                case IF_LINEA3:
                   resultado = resultado + "IF: "  + lexer.lexeme + "\n";
                    break;
                    
                case IF_LINEA4:
                    resultado = resultado + "IF: "  + lexer.lexeme  + "\n";
                    break;
                    
                
                 case ERROR:
                    resultado = resultado + "ERROR SINTAXIS INCORRECTA \n";
                     break;
                
                
                
                default:
                    resultado = resultado + "<" + lexer.lexeme +">" ;
                   
            
           
           }
       }
     }
     
     
        public void ejecutar5()throws Exception{
       String resultado="";
       Reader reader =new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Hola.txt"));
       Lexer5 lexer = new Lexer5(reader);
       while(true){
           Token5 token = lexer.yylex();
           if(token == null){
               
                jTextArea2.setText(resultado);
                return;
          
           }
               switch(token){
                
                
                case WHILE_LINEA1:
                    resultado = resultado + "WHILE: "  + lexer.lexeme  + "\n";
                    break;
                    
               case WHILE_LINEA2:
                    resultado = resultado + "WHILE: "  + lexer.lexeme  + "\n";
                    break;
                    
                case WHILE_LINEA3:
                   resultado =  resultado + "WHILE: "  + lexer.lexeme  + "\n";
                    break;
                    
                case WHILE_LINEA4:
                    resultado = resultado + "WHILE: "  + lexer.lexeme  + "\n";
                    break;
           
                 case ERROR:
                    resultado = resultado + "ERROR SINTAXIS INCORRECTA \n";
                     break; 
                default:
                    resultado = resultado + "<" + lexer.lexeme +">" ;
                   
            
           
           }
       }
     }
   
   
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Analizador lexico/sintactico.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Archivo: C:\\Users\\HP\\Desktop\\Hola.txt");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Analizar Lexico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar Lexico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setText("Analizar Sintactico Variables");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar Sintactico");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Analisis Sintactico For");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Analisis Sintactico If");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Analisis Sintactico While");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(348, 348, 348))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jButton1)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         jTextArea1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            ejecutar();
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            ejecutar2();
            
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            ejecutar4();
            
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            ejecutar3();
            
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            ejecutar5();
            
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
