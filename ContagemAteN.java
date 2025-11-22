/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Johw Santos
 * */
import java.util.Scanner;

public class ContagemAteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro N: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
