/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Johw Santos
 * */
import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala? ");
        int qtd = sc.nextInt();

        int contador = 0;
        double soma = 0;

        while (contador < qtd) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = sc.nextDouble();

            soma += nota;
            contador++;
        }

        double media = soma / qtd;
        System.out.println("A media da turma e: " + media);
    }
}
