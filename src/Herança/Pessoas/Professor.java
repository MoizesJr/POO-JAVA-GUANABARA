package Herança.Pessoas;

public class Professor extends Pessoa {
  private String especialidade;
  private Float salario;

  public Professor() {
    this.salario = 2000f;
  }

  public void receberAumento(float aumento) {
    this.setSalario(getSalario() + aumento);
    System.out.println("novo salario " + this.salario);
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public Float getSalario() {
    return salario;
  }

  public void setSalario(Float salario) {
    this.salario = salario;
  }

}
