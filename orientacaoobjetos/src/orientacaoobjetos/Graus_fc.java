package orientacaoobjetos;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Graus_fc {
    public static void main(String[] args) {
        float valor;
        float celsius;
        float Fahrenheit;
        float obtido = 0;

        String escolha = JOptionPane.showInputDialog(null, 
                "Escolha o tipo de conversão:\n" +
                "1. Celsius para Fahrenheit\n" +
                "2. Fahrenheit para Celsius\n" +
                "Opção: ");

        valor = Float.parseFloat(escolha);

        DecimalFormat df = new DecimalFormat("#.##");

        if (valor == 1) {
            String inputCelsius = JOptionPane.showInputDialog(null, "Digite a temperatura em graus Celsius:");
            celsius = Float.parseFloat(inputCelsius);
            
            obtido = (celsius * 1.8f) + 32;
            
            JOptionPane.showMessageDialog(null, "Resultado em graus Fahrenheit: " + df.format(obtido));
            
        } else if (valor == 2) {
            String inputFahrenheit = JOptionPane.showInputDialog(null, "Digite a temperatura em graus Fahrenheit:");
            Fahrenheit = Float.parseFloat(inputFahrenheit);
            
            obtido = (Fahrenheit - 32) / 1.8f;
            
            JOptionPane.showMessageDialog(null, "Resultado em graus Celsius: " + df.format(obtido));
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    } 
}

