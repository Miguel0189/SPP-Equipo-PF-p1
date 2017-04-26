/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// integrantes del equipo:
//Alberto Isaac Gómez Jiménez A01410769
// Jorge Daniel Del Angel Bombardier  A01410409
// Angel Avalos Ortega A01410325
//Miguel Mendez Nevarez A01411490
package spp.equipo.pf.p1;
import javax.swing.JOptionPane;
/**
 *
 * @author migue
 */
public class SPPEquipoPFP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = SolicitarEntero("Escribe el número de materias inscritas");
            String[] materias = NombreMaterias(tamaño);
            double [][]arreglo = arreglo(tamaño, materias);
            ImprimirArreglo(arreglo, materias);    
    }
     public static String[] NombreMaterias(int tamano){

         String []materias = new String[tamano];
         for (int i  =0; i < tamano; i++){
            materias[i] = JOptionPane.showInputDialog("Escribe el nombre de la materia "+ (i+1) + ": ");            
        } 
         
        return materias;
        }
     
       public static double[][] arreglo(int tamaño,String materia[]){

        double [][]arreglo = new double [tamaño][3];
      
        for (int i = 0; i < tamaño; i++){
        for (int j = 0; j < 3 ; j++){
        
        arreglo[i][j] = Solicitardouble("Escribe la calificación del parcial: "+(j+1)+": ");
        }
        
        }
        
        return arreglo;
        }
       
         public static void ImprimirArreglo(double [][]a, String materia[]){
        double suma=0,prom=0;
        
              
        for (int i = 0; i < a.length;i++){
        for (int j = 0; j < a[i].length;j++){
            suma= suma+a[i][j];
            prom=suma/3;
        }
        
        System.out.println();
        JOptionPane.showMessageDialog(null, "El promedio de la materia es  " + materia[i] + ":\n" + prom);
        prom = 0;
        suma = 0;
        }
        
        }
         
        public static int SolicitarEntero(String men){
        int num = 0;
        boolean flag;
        do{
                    try{
                String dato = JOptionPane.showInputDialog(men);
                num = Integer.parseInt(dato);
                 flag = false;}
                    catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                flag = true;
                
         
                
            }
                    
        }
        
        while(flag);
        return num;
    }
        
         
          public static double Solicitardouble(String men){
        double num = 0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Double.parseDouble(dato);
                flag =  false;
            }
            
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "Error");
                flag=true;
            }
            
        }
        
        while(flag);
        return num;
       
    }
         }  
    
    