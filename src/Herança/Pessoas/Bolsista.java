package Herança.Pessoas;

public class Bolsista extends Aluno {
  private float bolsa;

  public void renovarBolsa() {
    System.out.println("Renovando bolsa de " + this.nome);
  }

  @Override
  public void pagarMensalidade() {
    System.out.println("Mensalidade do aluno " + this.nome + "paga com sucesso");
  }

  public float getBolsa() {
    return bolsa;
  }

  public void setBolsa(float bolsa) {
    this.bolsa = bolsa;
  }

}
