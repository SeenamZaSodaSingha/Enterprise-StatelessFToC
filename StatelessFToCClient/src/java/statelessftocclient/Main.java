/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelessftocclient;
import java.util.Scanner;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class Main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        float f = sc.nextFloat();
        new FToC(f);
    }
    
}
