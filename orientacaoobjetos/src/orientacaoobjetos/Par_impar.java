package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Par_impar {

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog("Digite um número:");
            if (input != null) {
                int numero = Integer.parseInt(input);
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O número " + numero + " é par");
                } else {
                    JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum número foi inserido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor inserido não é um número inteiro.");
        }
    }
}


		
