package Polimorfismo.Animais;

public class AppAnimal {
  public static void main(String[] args) {

    Canguru canguru = new Canguru();
    Cachorro cachorro = new Cachorro();
    Cobra cobra = new Cobra();

    canguru.locomover();
    cachorro.locomover();
    cachorro.emitirSom();
  }
}
