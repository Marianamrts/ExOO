package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Contagem {

    public static void main(String[] args) {
        int contador = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial:"));
        StringBuilder output = new StringBuilder();

        int x = contador;
        while (x >= 1) {
            output.append(x);
            if (x > 1) {
                output.append("\n");
            }
            x--;
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}

