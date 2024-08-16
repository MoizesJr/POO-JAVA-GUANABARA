package Polimorfismo.Animais;

public class Tartaruga extends Reptil {

  @Override
  public void locomover() {
    System.out.println("Andando lentamente");
  }

  @Override
  public void alimentar() {
    System.out.println("Comendo folhas");
  }
}
