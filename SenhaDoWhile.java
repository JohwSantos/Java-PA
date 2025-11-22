/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Johw Santos
 */
import java.util.Scanner;

public class SenhaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENHA_CORRETA = 2971;
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();
        } while (senhaDigitada != SENHA_CORRETA);

        System.out.println("Acesso permitido!");
    }
}

