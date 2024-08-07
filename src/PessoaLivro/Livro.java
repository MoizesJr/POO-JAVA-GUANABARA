package PessoaLivro;

public class Livro implements Publicacao {

  private String titulo;
  private String autor;
  private int totpaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String titulo, String autor, int totpaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.totpaginas = totpaginas;
    this.aberto = false;
  }

  public void detalhes(Pessoa p) {
    System.out.println("Titulo do livro: " + this.getTitulo());
    System.out.println("Autor: " + this.getAutor());
    System.out.println("Total de paginas: " + this.getTotpaginas());
    System.out.println("Pagina atual: " + this.getPagAtual());
    System.out.println("Livro está aberto? " + this.getAberto());
    System.out.println("Quem está lendo o livro? " + p.getNome());
  }

  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void avancarPag() {
    if (this.aberto == true && this.getPagAtual() <= this.getTotpaginas()) {
      this.setPagAtual(this.getPagAtual() + 1);
    } else {
      System.out.println("Erro!");
    }
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int pag) {
    if (this.aberto == true && pag <= this.getTotpaginas()) {
      setPagAtual(pag);
    } else {
      System.out.println("Erro!! esse livro contem " + getTotpaginas() + " paginas");
    }
  }

  @Override
  public void voltarpag() {
    if (this.aberto == true && this.getPagAtual() <= this.getTotpaginas()) {
      this.setPagAtual(this.getPagAtual() - 1);
    } else {
      System.out.println("Livro fechado!");
    }
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotpaginas() {
    return totpaginas;
  }

  public void setTotpaginas(int totpaginas) {
    this.totpaginas = totpaginas;
  }

  public int getPagAtual() {
    return pagAtual;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public boolean getAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

}
