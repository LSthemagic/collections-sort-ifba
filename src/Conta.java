import java.util.Objects;

public class Conta implements Comparable<Conta>{
    private int numero;
    private String titular;
    private Double limiteCredito, saldo;

    public Conta(int numero, String titular, Double limiteCredito, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    @Override
    public int compareTo(Conta o) {
        if(this.numero > o.numero){
            return 1;
        }
        if(this.numero < o.numero){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", saldo=" + saldo +
                '}';
    }
}
