/******************************************************************
Ultima modificacion: 27/01/2022

Clase main grupo 10
@file MainGrupo10.java

******************************************************************/
import java.io.File;
import java.util.Scanner;

public class MainGrupo10 {
    public static void main(String[] args){
        try{
            File file = new File("datos.txt");
            Scanner s = new Scanner(file);
            CalculadoraGrupo10 calculadora = new CalculadoraGrupo10();
            while (s.hasNextLine()){
                String linea = s.nextLine();
                double resultado = calculadora.calculate(linea);
                System.out.println("El resultado de "+ linea+ " es "+resultado);
            }
            s.close();
        } catch (Exception e){
            System.out.println("Error: archivo no encontrado");
        }
        
    }
}
