package orientacaoobjetos;

import javax.swing.JOptionPane;

public class Media_nota {

    public static void main(String[] args) {
        int nota1, nota2, nota3;
        float peso1, peso2, peso3, media;

        String input1 = JOptionPane.showInputDialog("Digite a nota 1:");
        nota1 = Integer.parseInt(input1);

        String inputPeso1 = JOptionPane.showInputDialog("Digite o peso da nota 1:");
        peso1 = Float.parseFloat(inputPeso1);

        String input2 = JOptionPane.showInputDialog("Digite a nota 2:");
        nota2 = Integer.parseInt(input2);

        String inputPeso2 = JOptionPane.showInputDialog("Digite o peso da nota 2:");
        peso2 = Float.parseFloat(inputPeso2);

        String input3 = JOptionPane.showInputDialog("Digite a nota 3:");
        nota3 = Integer.parseInt(input3);

        String inputPeso3 = JOptionPane.showInputDialog("Digite o peso da nota 3:");
        peso3 = Float.parseFloat(inputPeso3);

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        String mensagem = "A média ponderada é: " + media + " que corresponde à classificação ";

        if (media >= 90 && media <= 100) {
            mensagem += "A";
        } else if (media >= 80 && media < 90) {
            mensagem += "B";
        } else if (media >= 70 && media < 80) {
            mensagem += "C";
        } else if (media >= 60 && media < 70) {
            mensagem += "D";
        } else if (media < 60 && media >= 0) {
            mensagem += "F";
        } else {
            mensagem += "Não há classificação para essa nota";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

