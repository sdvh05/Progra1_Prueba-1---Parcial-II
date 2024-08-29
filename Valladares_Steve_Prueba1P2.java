
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Valladares_Steve_Prueba1P2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        
         String palabras[ ] = { "radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed" };
            
         //imprimir arreglo inicial
            for (int i = 0; i <palabras.length; i++) {
                System.out.println("["+i+"]: "+palabras[i]);
        }
            
            System.out.println("");
            System.out.println("Ingrese la Cantidad de Palindromos que se guardaran en los Arreglos");
            int tamaño=lea.nextInt();
            
            int ContadorA=0, ContadorB=0;
            
            String ArregloA[ ] = new String[tamaño];
            String ArregloB[ ] = new String[tamaño];

            while(ContadorA<tamaño){
                int posicion=0;
                posicion=random.nextInt(20);
                String Palabra="";
                Palabra=palabras[posicion];
                
                //identificar si es palindroma o no
            boolean esPalindromo=true;
            int derecho=0;
            int revez=Palabra.length()-1;
           

             while(derecho<revez){
                if(Palabra.charAt(derecho)!= Palabra.charAt(revez)){
                    esPalindromo=false;
                    break;
                }
                derecho++;
                revez--;
             }

             //se guarda y aumenta el contador solo si la palabra es palindroma:
             if(esPalindromo==true){
             ArregloA[ContadorA]=Palabra;
             ContadorA++;   
             }
            }
            
            
            while(ContadorB<tamaño){
                int posicion=0;
                posicion=random.nextInt(20);
                String Palabra="";
                Palabra=palabras[posicion];
                
                //identificar si es palindroma o no
            boolean esPalindromo=true;
            int derecho=0;
            int revez=Palabra.length()-1;
           
             while(derecho<revez){
                if(Palabra.charAt(derecho)!= Palabra.charAt(revez)){
                    esPalindromo=false;
                    break;
                }
                derecho++;
                revez--;
             }
             //se guarda y aumenta el contador solo si la palabra es palindroma:
             if(esPalindromo==true){
             ArregloB[ContadorB]=Palabra;
             ContadorB++;   
             }
            }
            
            //imprimir las listas del ArregloA y el ArregloB
            System.out.println("");
            System.out.println("Lista Palabras Palindroma arreglo A:");
                for (int i = 0; i <tamaño; i++) {
                System.out.println("["+i+"]: "+ArregloA[i]);
        }
                System.out.println("");
                System.out.println("Lista Palabras Palindroma arreglo B:");
                for (int i = 0; i <tamaño; i++) {
                System.out.println("["+i+"]: "+ArregloB[i]);
        }
            
          //Palabras del Arreglo A no están en el ArregloB
          System.out.println("");
            System.out.println("Palabras del Arreglo A no estan en el Arreglo B son:");
            int contadorEncontrados=0;
            
           for (int i = 0; i < ArregloA.length; i++) {
            boolean SeEncuentraEnAyB = false;
            for (int j = 0; j < ArregloB.length; j++) {
                if (ArregloA[i].equals(ArregloB[j])) {
                    SeEncuentraEnAyB = true;
                    break; 
                }
            }
            if (SeEncuentraEnAyB==false) {
                System.out.println("["+contadorEncontrados+"]: "+ArregloA[i]);
                contadorEncontrados++;
            }
        }


                
    }
    
    
}
