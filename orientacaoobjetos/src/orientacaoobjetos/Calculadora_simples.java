package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Calculadora_simples {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        String mensagemOpcoes = "Escolha a operação: \n" +
                                "1. Adição\n" +
                                "2. Subtração\n" +
                                "3. Multiplicação\n" +
                                "4. Divisão";

        JOptionPane.showMessageDialog(null, mensagemOpcoes);

        String inputOpcao = JOptionPane.showInputDialog("Opção:");
        int opcao = Integer.parseInt(inputOpcao);

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "O resultado da adição é: " + (n1 + n2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + (n1 - n2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (n1 / n2));
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}

