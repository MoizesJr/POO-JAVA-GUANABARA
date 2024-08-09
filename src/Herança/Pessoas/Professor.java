package Herança.Pessoas;

public class Professor extends Pessoa {
  private String especialidade;
  private Float salario;

  public void receberAumento(float aumento) {
    this.setSalario(getSalario() + aumento);
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
