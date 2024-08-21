package ExercicioPOO;

public class App {
  public static void main(String[] args) {

    Videos v[] = new Videos[2];

    v[0] = new Videos("Log de program");
    v[1] = new Videos("Aula POO java");

    Gafanhoto g[] = new Gafanhoto[2];

    g[0] = new Gafanhoto("Moizes", 33, "M", "Moizes.jr");
    g[1] = new Gafanhoto("Alanna", 33, "F", "Lanna.lemos");
    g[1].ganharExp();
    g[1].viuMaisUm();

    // System.out.println(v[0].toString());
    // System.out.println(g[0].toString());

    Visualizacao vis[] = new Visualizacao[3];

    vis[0] = new Visualizacao(g[0], v[1]);
    vis[1] = new Visualizacao(g[1], v[0]);
    vis[1] = new Visualizacao(g[1], v[1]);
    vis[1].avaliar();
    vis[0].avaliar(10);
    vis[0].stopVideos();
    // vis[0].playVideo();
    System.out.println(vis[0].toString());
    System.out.println(vis[1].toString());
  }
}
