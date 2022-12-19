package loops;

import java.util.Scanner;

public class Nota {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int nota;

      System.out.print("Escolha uma nota entre 0 e 10: ");
      nota = scanner.nextInt();

      while(nota < 0 || nota > 10){
      System.out.print("Número inválido, tente nocamente ");
      nota = scanner.nextInt();
      }
   }
}
