package Herança.Pessoas;

public class Funcionario extends Pessoa {
  private String setor;
  private boolean trabalhando;

  public void MudarTrabalho(String novoTb) {
    if (this.getTrabalhando()) {
      this.setSetor(novoTb);
      System.out.println("Parabens, sua nova função é: " + novoTb);
    } else {
      System.out.println("Você não estar trabalhando");
    }
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public boolean getTrabalhando() {
    return trabalhando;
  }

  public void setTrabalhando(boolean trabalhando) {
    this.trabalhando = trabalhando;
  }

}
