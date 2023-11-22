package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Calcula_cache {

    public static void main(String[] args) {
        float valor;
        float porcentagem;
        float obtido = 0;
        float total = 0;

        String inputValor = JOptionPane.showInputDialog(null, "Digite o valor total da conta:");
        valor = Float.parseFloat(inputValor);

        String inputPorcentagem = JOptionPane.showInputDialog(null, "Digite a porcentagem de gorjeta que deseja deixar:");
        porcentagem = Float.parseFloat(inputPorcentagem);

        obtido = (valor * porcentagem) / 100;

        JOptionPane.showMessageDialog(null, "Valor da gorjeta: $" + obtido);

        total = valor + obtido;

        JOptionPane.showMessageDialog(null, "Total a ser pago: $" + total);
    }
}


