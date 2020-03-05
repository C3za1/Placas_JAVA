/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placa;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cesar
 */
public class Placa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String placa;
       
       
        System.out.println("Ingrese la placa del veiculo");
       placa = sc.nextLine();
       Pattern jefe = Pattern.compile("^([A-Z]{3}-\\d{3,4})$");
       Matcher comparar = jefe.matcher(placa);
       if(comparar.find()){
          System.out.println("placa Válido");
       }
       else
       {
          System.out.println("placa No Válido");
       }
    }
    
}

//IMPRIMIR ADQ-123