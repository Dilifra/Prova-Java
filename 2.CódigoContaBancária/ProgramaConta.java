import java.util.*;

public class ProgramaConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta Conta1 = new Conta("Diogo",1040,2,"02/07/2021",2000);

        Conta1.Inicio();

        int x = 1;

        while (x == 1){

            System.out.print("O seu saldo e de R$" + Conta1.Saldo() + "\nQual operacao voce gostaria de efetuar?"
                            + "\n1.Saque"
                            + "\n2.Deposito"
                            + "\n3.Rendimento\n");
            int operacao = sc.nextInt();

            if (operacao == 1) {
                Conta1.Sacar();
            } else if (operacao == 2) {
                Conta1.Depositar();
            } else if (operacao == 3) {
                Conta1.Rendimentos();
            } else {
                System.out.print("Esta opcao nao e valida.");
            }

            System.out.print("\nGostaria de realizar outra operacao\n1.Sim |2.Nao\n");
            x = sc.nextInt();

        }
    }
}