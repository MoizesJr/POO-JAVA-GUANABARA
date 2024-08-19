package Polimorfismo.Animais;

public class AppAnimal {
  public static void main(String[] args) {

    Canguru canguru = new Canguru();
    Cachorro cachorro = new Cachorro();
    Cobra cobra = new Cobra();
    Lobo lobo = new Lobo();

    // canguru.locomover();
    cachorro.locomover();
    cachorro.emitirSom();
    cachorro.balancarRabo(true);

    lobo.emitirSom();
    cachorro.reagir("Vai apanhar");
    cachorro.reagir(true);
    cachorro.reagir(6, 30);

    // cobra.locomover();
  }
}
