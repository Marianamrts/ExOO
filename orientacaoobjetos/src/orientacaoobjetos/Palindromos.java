package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Palindromos {

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Insira uma palavra:");

        int tamanho = palavra.length();
        boolean Palindromo = true;

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                Palindromo = false;
                break;
            }
        }

        if (Palindromo) {
            JOptionPane.showMessageDialog(null, "A palavra inserida é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra inserida não é um palíndromo.");
        }
    }
}

