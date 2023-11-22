package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Soma_vetores {

    public static void main(String[] args) {
        int vet = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        int[] v1 = new int[vet];
        int[] v2 = new int[vet];
        int[] result = new int[vet];

        String input;
        for (int i = 0; i < vet; i++) {
            input = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do primeiro vetor:");
            v1[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < vet; i++) {
            input = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do segundo vetor:");
            v2[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < vet; i++) {
            result[i] = v1[i] + v2[i];
        }

        StringBuilder output = new StringBuilder("A soma dos vetores é: ");
        for (int i = 0; i < vet; i++) {
            output.append(result[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}

