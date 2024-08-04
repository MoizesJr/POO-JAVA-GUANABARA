package ContaBancaria05;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco c1 = new ContaBanco();

        c1.setDono("Moizés");
        c1.setNumConta(2356);
        c1.abrirConta("cc");
        c1.depositar(150f);
        c1.sacar(20f);
        c1.pagarMensalidade();

        System.out.println(c1.toString());
    }
}
