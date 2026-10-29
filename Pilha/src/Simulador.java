import java.util.Scanner;

public class Simulador {
  static String[] historico = new String[5];
  static int topo = -1;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("\n === NAVEGADOR IF ===");
      System.out.println("1 - Visitar nova página");
      System.out.println("2 - Voltar a página anterior");
      System.out.println("3 - Mostrar página atual");
      System.out.println("4 - Exibir histórico");
      System.out.println("0 - Sair");

      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Digite a URL: ");
          String pagina = scanner.nextLine();
          visitarPagina(pagina);
          break;

        case 2:
          voltarPagina();
          break;

        case 3:
          paginaAtual();
          break;

        case 4:
          exibirHitorico();

        default:
          break;
      }
    } while (opcao != 0);

  }

  public static void visitarPagina(String pagina) {
    if (pilhaCheia()) {
      System.out.println("Histórico cheio");
      return;
    }

    topo++;
    historico[topo] = pagina;
    System.out.println("Você visitou a página " + pagina);
  }

  public static boolean pilhaCheia() {
    return topo == historico.length - 1;
  }

  public static void voltarPagina() {
    if (pilhaVazia()) {
      System.out.println("Nenhuma página aberta");
    }
    historico[topo] = null;
    topo--;
    System.out.println("Voltando para " + historico[topo]);
  }

  public static boolean pilhaVazia() {
    return topo == -1;
  }

  public static void paginaAtual() {
    if (pilhaVazia()) {
      System.out.println("Nenhuma página aberta");
    } else {
      System.out.println("Página atual " + historico[topo]);
    }
  }

  public static void exibirHitorico() {
    if (pilhaVazia()) {
      System.out.println("Historico vazio!");
      return;
    }

    System.out.println("Historico mais recente ao ultimo:");
    for (int i = topo; i >= 0; i--) {
      System.out.println(historico[i]);
    }
  }
}
