import java.util.Scanner;

public class Test {

  public static void main(String args[]) {

    System.out.println("Entrez un nombre :");

    Scanner scan = new Scanner (System.in);

    int nombre = scan.nextInt();

    if (nombre == 0) {
      System.out.println("Le nombre est zéro");
    }
    else {
      if (nombre < 0)
      {
        System.out.print("Le nombre est négatif ");
      }
      else
      {
        System.out.print("Le nombre est positif ");
      }
    }

    int reste = nombre % 2;
    if (reste == 0) {
      System.out.println("et pair");
    } else {
      System.out.println("et impair");
    }

  }
}
