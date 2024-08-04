package UecEmoji;

public class Luta {

  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta(Lutador l1, Lutador l2) {
    if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
      this.setAprovada(true);
      this.setDesafiado(l1);
      this.setDesafiante(l2);
    } else {
      this.setAprovada(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
    }
  }

  public void lutar() {
    if (this.getAprovada()) {
      this.desafiado.apresentar();
      this.desafiante.apresentar();
      int vencedor = (int) Math.random() * 3;
      switch (vencedor) {
        case 0: // EMPATE
          System.out.println("Empatou!");
          desafiado.empatarLuta();
          desafiante.empatarLuta();
          break;
        case 1:// VITORIA DESAFIADO
          System.out.println("O vencedor foi: " + desafiado.getNome());
          desafiado.ganharLuta();
          desafiante.perderLuta();
          break;
        case 2:// VITORIA DESAFIANTE
          System.out.println("O vencedor foi: " + desafiante.getNome());
          desafiado.perderLuta();
          desafiante.ganharLuta();
          break;
      }

    }
  }

  public Lutador getDesafiado() {
    return desafiado;
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean getAprovada() {
    return aprovada;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }
}
