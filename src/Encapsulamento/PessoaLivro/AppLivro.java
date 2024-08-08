package Encapsulamento.PessoaLivro;

public class AppLivro {
  public static void main(String[] args) {

    Livro l[] = new Livro[4];

    Pessoa p[] = new Pessoa[2];

    p[0] = new Pessoa("Moizes", 33, 'M');
    p[1] = new Pessoa("Karina", 46, 'F');
    p[1].fazerAniversario();
    System.out.println(p[1].toString());

    l[0] = new Livro("Chama na batera", "Moizés jr", 300);
    l[1] = new Livro("Algoritmo", "Alanna", 250);
    l[2] = new Livro("Java Iniciante", "Liz Bela", 150);
    l[3] = new Livro("Java avançado", "Pablo", 530);

    l[0].abrir();
    l[0].folhear(298);
    // l[0].voltarpag();
    // l[0].avancarPag();
    l[0].detalhes(p[1]);
  }
}
