package Herança.Pessoas;

public class Aluno extends Pessoa {
  private int matricula;
  private String curso;

  public Aluno() {
    this.curso = "dados";
  }

  public void pagarMensalidade() {
    System.out.println("Mensalidade do aluno " + this.nome + "paga com sucesso!");
  }

  public void escolherCurso(String novoCurso) {
    System.out.println("Seu novo curso será: " + novoCurso);
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

}
