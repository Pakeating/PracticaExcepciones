

package com.prog.tratoexcepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *Autor: Francisco linares Santamaria
 */
public class TratoExcepciones {

    public static void main(String[] args) {
        try{
            tiraExcepcionAritmética(7);
        }catch(ArithmeticException e){
            System.out.println("Error aritmético: "+e.getMessage());
        }
        
        String [] miArray={"uno","dos","tres","cuatro","cinco","seis"};
        try{
            tiraExcepcionArrays(miArray);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error buscando elemento en array: "+e.getMessage());
        }
        
        try{
            tiraExcepcionFichero();
        }catch(FileNotFoundException e){
            System.out.println("Error fichero no encontrado: "+e.getMessage());
        }catch(IOException e){
            System.out.println("Error de lectura: "+e.getMessage());
        }
    }
    
    
    
    
    
    public static int tiraExcepcionAritmética(int numero) throws ArithmeticException{
        return numero/0;
    }
    public static String tiraExcepcionArrays(String [] miArray)throws ArrayIndexOutOfBoundsException{
        return miArray[9];
    }
    public static String tiraExcepcionFichero() throws FileNotFoundException, IOException{
        InputStream lectura=new FileInputStream("ficheroInexistente.t");
        
        return ""+lectura.read();
    }
}
