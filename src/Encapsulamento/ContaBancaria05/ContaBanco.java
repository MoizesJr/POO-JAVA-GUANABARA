package Encapsulamento.ContaBancaria05;

public class ContaBanco {

  private int numConta;
  protected String tipo;
  public String dono;
  public float saldo;
  public boolean status;

  public ContaBanco() {
    this.setSaldo(0);
    this.setStatus(false);
  }

  public void abrirConta(String tipo) {
    this.setTipo(tipo);
    this.setStatus(true);
    if (tipo.equals("cp")) {
      this.setSaldo(150);
      System.out.println("Conta poupança aberta com sucesso");
    } else if (tipo.equals("cc")) {
      this.setSaldo(50);
      System.out.println("Conta corrente aberta com sucesso");
    } else {
      System.out.println("erro! Escolha uma conta CC ou CP");
      this.setStatus(false);
    }
  }

  public void fecharConta() {
    if (this.getSaldo() == 0) {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso");
    } else {
      System.out.println("Impossivel fechar a conta com saldo ou debito");
    }
  }

  public void depositar(Float saldo) {
    if (this.getStatus()) {
      this.setSaldo(getSaldo() + saldo);
      System.out.println("Deposito feito com sucesso!");
    } else {
      System.out.println("Você não tem conta para fazer deposito");
    }
  }

  public void sacar(Float saldo) {
    if (this.getStatus()) {
      if (this.getSaldo() > saldo) {
        this.setSaldo(getSaldo() - saldo);
        System.out.println("Saque realizado com sucesso");
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("Conta inexistente para saque!");
    }
  }

  public void pagarMensalidade() {
    if (this.getStatus() || this.getTipo() == "cc") {
      this.setSaldo(getSaldo() - 12);
    } else if (status == true || tipo == "cp") {
      this.setSaldo(getSaldo() - 20);
    }
    System.out.println("Mesanlidade paga com sucesso!");
  }

  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDono() {
    return dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "\nContaBanco [numConta=" + numConta +
        ", \ntipo=" + tipo +
        ", \ndono=" + dono +
        ", \nsaldo=" + saldo +
        ", \nstatus=" + status + "]";
  }

}
