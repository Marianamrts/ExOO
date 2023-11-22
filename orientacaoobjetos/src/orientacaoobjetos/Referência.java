package orientacaoobjetos;

class Conta {
    private double saldo;

    public Conta(double Isaldo) {
        saldo = Isaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        saldo += valor;
    }
}

public class Referência {
    public static void main(String[] args) {
        Conta total = new Conta(0);

        System.out.println("Saldo inicial: " + total.getSaldo());

        deposita(total, 100.00);

        System.out.println("Saldo após depósito: " + total.getSaldo());
    }

 
    public static void deposita(Conta total, double valor) {
        total.deposita(valor);
    }
}
