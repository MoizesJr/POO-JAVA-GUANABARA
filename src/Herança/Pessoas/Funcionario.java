package Herança.Pessoas;

public class Funcionario extends Pessoa {
  private String setor;
  private boolean trabalhando;

  public void MudarTrabalho() {
    System.out.println("Trabalho alterado!");
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
