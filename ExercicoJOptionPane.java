import javax.swing.JOptionPane;

 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Johw Santos
 */
public class ExercicoJOptionPane {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");

        int idade = Integer.parseInt(idadeStr);
        int idadeFutura = idade + 10;

        JOptionPane.showMessageDialog(null,
                nome + ", daqui a 10 anos você terá " + idadeFutura + " anos.");
    }
}
