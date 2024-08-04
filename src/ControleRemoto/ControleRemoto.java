package ControleRemoto;

public class ControleRemoto implements Controlador {

  private int volume;
  private boolean ligado;
  private boolean tocando;

  public ControleRemoto() {
    this.ligado = false;
    this.tocando = false;
    this.volume = 50;
  }

  @Override
  public void abrirMenu() {
    if (getLigado()) {
      System.out.println("Tv está ligada? " + this.getLigado());
      System.out.println("Tv está tocando? " + this.getTocando());
      System.out.println("Volume: " + this.getVolume());
      for (int i = 0; i < this.getVolume(); i += 10) {
        System.out.print("|");
      }
    } else {
      System.out.println("Impossivel abrir menu, TV desligada!");
    }
  }

  @Override
  public void desligar() {
    this.ligado = false;
  }

  @Override
  public void desligarMudo() {
    if (this.getLigado() && this.getVolume() == 0) {
      setVolume(50);
    }
  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando menu...");
  }

  @Override
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }

  @Override
  public void maisVolume() {
    if (this.getLigado()) {
      this.setVolume(getVolume() + 5);
    } else {
      System.out.println("não é possivel aumentar o volume, Tv desligada!");
    }
  }

  @Override
  public void menosVolume() {
    if (this.getLigado()) {
      this.setVolume(getVolume() - 5);
    } else {
      System.out.println("não é possivel aumentar o volume, Tv desligada!");
    }
  }

  @Override
  public void pause() {
    if (this.getLigado() && this.getTocando()) {
      this.setTocando(false);
    } else {
      System.out.println("Tv não está tocando!!");
    }
  }

  @Override
  public void play() {
    if (this.getLigado() && (!this.getTocando())) {
      this.setTocando(true);
    } else {
      System.out.println("Tv desligada!");
      this.setTocando(false);
    }
  }

  private int getVolume() {
    return volume;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean getLigado() {
    return ligado;
  }

  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  private boolean getTocando() {
    return tocando;
  }

  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override
  public String toString() {
    return "\nControleRemoto [volume=" + volume +
        ", \nligado=" + ligado +
        ", \ntocando=" + tocando + "]";
  }

}
