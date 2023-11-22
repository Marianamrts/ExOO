package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Converte_idade {

    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        int horas;
        int minutos;

        String inputIdade = JOptionPane.showInputDialog(null, "Insira sua idade em anos:");
        anos = Integer.parseInt(inputIdade);

        meses = anos * 12;
        dias = anos * 365;
        horas = dias * 24;
        minutos = horas * 60;

        String resultado = "Idade em meses: " + meses + "\nIdade em dias: " + dias +
                "\nIdade em horas: " + horas + "\nIdade em minutos: " + minutos;

        JOptionPane.showMessageDialog(null, resultado);
    }
}