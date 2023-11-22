package orientacaoobjetos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Media_ponderada {

    public static void main(String[] args) {
        float nota1;
        float pnota1;
        float nota2;
        float pnota2;
        float nota3;
        float pnota3;
        float media;

        String inputNota1 = JOptionPane.showInputDialog(null, "Digite sua primeira nota:");
        nota1 = Float.parseFloat(inputNota1);

        String inputPNota1 = JOptionPane.showInputDialog(null, "Digite o peso da primeira nota:");
        pnota1 = Float.parseFloat(inputPNota1);

        String inputNota2 = JOptionPane.showInputDialog(null, "Digite sua segunda nota:");
        nota2 = Float.parseFloat(inputNota2);

        String inputPNota2 = JOptionPane.showInputDialog(null, "Digite o peso da segunda nota:");
        pnota2 = Float.parseFloat(inputPNota2);

        String inputNota3 = JOptionPane.showInputDialog(null, "Digite sua terceira nota:");
        nota3 = Float.parseFloat(inputNota3);

        String inputPNota3 = JOptionPane.showInputDialog(null, "Digite o peso da terceira nota:");
        pnota3 = Float.parseFloat(inputPNota3);

        DecimalFormat df = new DecimalFormat("#.##");
        
        media = (nota1 * pnota1 + nota2 * pnota2 + nota3 * pnota3) / (pnota1 + pnota2 + pnota3);

        JOptionPane.showMessageDialog(null, "A média ponderada é: " + df.format(media));
    }
}


