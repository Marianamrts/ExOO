package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Tabuada {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação:");
        int numero = Integer.parseInt(input);

        StringBuilder tabela = new StringBuilder();
        tabela.append("Tabela de multiplicação para o número ").append(numero).append(":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabela.append(i).append(" x ").append(numero).append(" = ").append(resultado).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabela.toString());
    }
}
