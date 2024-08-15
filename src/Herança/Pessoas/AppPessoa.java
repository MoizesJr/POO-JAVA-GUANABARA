package Herança.Pessoas;

public class AppPessoa {
  public static void main(String[] args) {
    Aluno a = new Aluno();
    Bolsista b = new Bolsista();
    Funcionario f = new Funcionario();
    Professor p = new Professor();
    Tecnico t[] = new Tecnico[2];
    Visitante v = new Visitante();

    f.setTrabalhando(false);
    f.MudarTrabalho("professor");

    b.setNome("Moizés");
    b.renovarBolsa(true);

    p.receberAumento(300f);
    p.setNome("João");
    p.setIdade(38);
    p.setSexo("M");

    a.escolherCurso("ADS");
    a.getCurso();

    t[0] = new Tecnico(1);
    t[0].setNome("Pablo");
    t[0].setIdade(20);
    t[0].setSexo("M");
    t[0].praticar();
    t[0].getRegistroProfissional();
    t[0].getXpProfissional();
    t[0].statusTecnico();

    System.out.println(t[0].toString());

    t[1] = new Tecnico(2);
    t[1].setNome("mario");
    t[1].setIdade(22);
    t[1].setSexo("M");
    t[1].praticar();
    t[1].getRegistroProfissional();
    t[1].getXpProfissional();
    t[1].statusTecnico();

    System.out.println(t[1].toString());

  }
}
