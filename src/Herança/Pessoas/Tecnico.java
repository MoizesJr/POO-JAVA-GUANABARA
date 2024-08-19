package Herança.Pessoas;

public class Tecnico extends Aluno {

  private int registroProfissional;
  private int xpProfissional;

  public Tecnico() {
    this.xpProfissional = 0;
  }

  public void statusTecnico() {
    System.out.println(this.getXpProfissional() + " Experiencia");
    System.out.println(this.getRegistroProfissional() + " Registro");
  }

  public void praticar() {
    setXpProfissional(getXpProfissional() + 1);
  }

  public int getRegistroProfissional() {
    return registroProfissional;
  }

  public void setRegistroProfissional(int registroProfissional) {
    this.registroProfissional = registroProfissional;
  }

  public int getXpProfissional() {
    return xpProfissional;
  }

  public void setXpProfissional(int xpProfissional) {
    this.xpProfissional = xpProfissional;
  }

}
