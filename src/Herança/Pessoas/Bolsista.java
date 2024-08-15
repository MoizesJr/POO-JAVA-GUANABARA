package Herança.Pessoas;

public class Bolsista extends Aluno {
  private float bolsa;

  public void renovarBolsa(boolean bolsa) {
    if (bolsa == true) {
      System.out.println("bolsa de " + this.nome + " renavada com sucesso!");
    } else {
      System.out.println(this.nome + " Não teve a bolsa renovada");
    }
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
