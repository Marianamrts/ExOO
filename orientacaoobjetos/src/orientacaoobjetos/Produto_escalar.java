package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Produto_escalar {

    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        double[] vetor1 = new double[tamanho];
        double[] vetor2 = new double[tamanho];

        String input;
        for (int i = 0; i < tamanho; i++) {
            input = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do primeiro vetor:");
            vetor1[i] = Double.parseDouble(input);
        }

        for (int i = 0; i < tamanho; i++) {
            input = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do segundo vetor:");
            vetor2[i] = Double.parseDouble(input);
        }

        double produtoEscalar = calcularProdutoEscalar(vetor1, vetor2);

        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + produtoEscalar);
    }

    public static double calcularProdutoEscalar(double[] vetor1, double[] vetor2) {
        double p = 0;
        for (int i = 0; i < vetor1.length; i++) {
            p += vetor1[i] * vetor2[i];
        }
        return p;
    }
}

