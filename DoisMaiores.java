/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Johw Santos
 */
import java.util.Scanner;

public class DoisMaiores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int maior1 = Integer.MIN_VALUE; // maior
        int maior2 = Integer.MIN_VALUE; // segundo maior

        while (contador < 10) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();

            if (num > maior1) {
                maior2 = maior1; // o antigo maior vai para segundo
                maior1 = num;    // novo maior
            } else if (num > maior2) {
                maior2 = num;
            }

            contador++;
        }

        System.out.println("O maior numero é: " + maior1);
        System.out.println("O segundo maior numero é: " + maior2);
    }
}

