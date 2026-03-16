package aula05;

public class Main {
    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco();

        c1.setNumConta(62145123);
        c1.setDono("Claustro Pigmeu");
        c1.abriConta("CC");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(23554623);
        c2.setDono("Alice Maravilha");
        c2.abriConta("CP");

        c1.depositaConta(1000);
        c2.depositaConta(1000);

        c1.sacaConta(100);
        c2.sacaConta(2000);

        c1.estadoAtual();
        c2.estadoAtual();

    }
}


