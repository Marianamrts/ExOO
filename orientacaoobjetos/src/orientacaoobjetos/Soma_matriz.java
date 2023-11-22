package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Soma_matriz {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas: "));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas: "));

        int matrizA[][] = new int[N][M];
        int matrizB[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da matriz A na posição [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da matriz B na posição [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }

        int[][] somaMatrizes = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                somaMatrizes[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        StringBuilder output = new StringBuilder("A soma das matrizes é:\n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                output.append(somaMatrizes[i][j]).append(" ");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}
