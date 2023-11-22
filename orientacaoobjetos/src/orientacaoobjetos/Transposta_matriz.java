package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Transposta_matriz {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas: "));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas: "));

        int matrizA[][] = new int[N][M];
        int t[][] = new int[M][N]; 

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos da matriz [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                t[i][j] = matrizA[j][i];
            }
        }

        String output = "A matriz transposta é: \n";
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                output += t[i][j] + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
