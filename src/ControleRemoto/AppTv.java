package ControleRemoto;

public class AppTv {
  public static void main(String[] args) {
    ControleRemoto c1 = new ControleRemoto();

    // c1.ligar();
    c1.maisVolume();
    c1.play();
    c1.ligarMudo();
    c1.abrirMenu();

    // System.out.println(c1.toString());
  }
}
