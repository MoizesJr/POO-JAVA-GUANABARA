package Polimorfismo.Animais;

public class Cachorro extends Lobo {

  // metodo reagir c/ sobrecarga (assinaturas diferentes)
  public void reagir(String frase) {
    if (frase.equals("toma comida") || frase.equals("Olá")) {
      System.out.println("Abanar e latir");
    } else {
      System.out.println("Rosnar");
    }
  }

  public void reagir(int hora, int min) {
    if (hora < 12) {
      System.out.println("Abanar");
    } else if (hora >= 18) {
      System.out.println("Ignorar");
    } else {
      System.out.println("Abanar e latir");
    }
  }

  public void reagir(boolean dono) {
    if (dono) {
      System.out.println("Abanar");
    } else {
      System.out.println("Rosnar e latir");
    }
  }

  public void reagir(int idade, float peso) {
    if (idade < 5) {
      if (peso < 10) {
        System.out.println("Abanar");
      } else {
        emitirSom();
      }
    } else {
      if (peso < 10) {
        System.out.println("Rosnar");
      } else {
        System.out.println("Ignorar");
      }
    }
  }

  @Override
  public void locomover() {
    System.out.println("Correndo");
  }

  @Override
  public void emitirSom() {
    System.out.println("Au au au!!");
  }

  public void balancarRabo(boolean carinho) {
    if (carinho) {
      System.out.println("Balançando rabo!");
    } else {
      System.out.println("Você não fez carinho");
    }
  }

}
