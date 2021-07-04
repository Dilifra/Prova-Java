import java.util.*;

public class Conta{
    String titular;
    double saldo;
    int registro;
    int agencia;
    String dataAbertura;
    double retirada;
    double deposito;
    double rendimento;

    Scanner quantia = new Scanner(System.in);

    public Conta(String titular,int registro,int agencia,String dataAbertura,double saldo) {
        this.titular = titular;
        this.registro = registro;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void Inicio() {
        System.out.print("Bem vindo ao Banco Star " + titular);
    }

    public double Saldo() {
        return saldo;
    }

    public void Sacar() {
        System.out.print("O seu saldo e R$" + saldo + "\nQuanto voce gostaria de sacar?\n");
        retirada = quantia.nextDouble();
        
        if (retirada > 0 && retirada < saldo){

            saldo = saldo - retirada;
            System.out.print("\nSaque realizado com sucesso!\nO saldo na sua conta e de: R$" + saldo);
            
        } else if (retirada > saldo){

            System.out.print("\nNao ha saldo suficiente na conta.");

        } else {

            System.out.print("\nSua conta nao foi movimentada.");

        }
    }

    public void Depositar() {
        System.out.print("\nPor favor, informe o valor para deposito: ");
        deposito = quantia.nextDouble(); 

        saldo = saldo + deposito;
        
        System.out.print("\nDepósito realizado com sucesso\nSeu saldo e de R$" + saldo);
    }

    public void Rendimentos() {
        rendimento = (saldo * 0.365)/100;
        System.out.print("O seu dinheiro guardado rendeu R$" + rendimento + " este mes.");
    }

}
