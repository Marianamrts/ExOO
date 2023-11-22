package orientacaoobjetos;

import javax.swing.JOptionPane;
import java.util.Random;

public class Jogo {

    public static void main(String[] args) {
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(10) + 1;
        int tentativa, tentativas = 0;
        
        do {
            String input = JOptionPane.showInputDialog("Adivinhe o número entre 1 e 10:");
            tentativa = Integer.parseInt(input);
            tentativas++;

            if (tentativa == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número em " + tentativas + " tentativa(s)!");
            } else {
                if (tentativa < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Tente um número maior.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tente um número menor.");
                }
            }
        } while (tentativa != numeroAleatorio);
    }
}

