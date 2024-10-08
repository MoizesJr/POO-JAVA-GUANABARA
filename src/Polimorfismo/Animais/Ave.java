package Polimorfismo.Animais;

public class Ave extends Animal {

  private String corPena;

  @Override
  public void alimentar() {
    System.out.println("Comendo frutas");
  }

  @Override
  public void emitirSom() {
    System.out.println("Som de ave");
  }

  @Override
  public void locomover() {
    System.out.println("Voando");
  }

  public void fazerNinho() {
    System.out.println("Construindo ninho");
  }

  public String getCorPena() {
    return corPena;
  }

  public void setCorPena(String corPena) {
    this.corPena = corPena;
  }

}
