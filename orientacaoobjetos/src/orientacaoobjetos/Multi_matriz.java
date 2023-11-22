package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Multi_matriz {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz: "));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz: "));

        int matrizA[][] = new int[N][M];
        int matrizB[][] = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos da primeira matriz [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
        }

        int P = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz: "));
        int Q = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz: "));
        
        for (int i = 0; i < P; i++) {
            for (int j = 0; j < Q; j++) {
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos da segunda matriz [" + (i + 1) + "][" + (j + 1) + "]:"));
            }
}
    }
}
