package loops;

import java.util.Scanner;

public class ParEImpar {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int quantidadeNumeros;
      int count = 0;
      int numero;
      int pares = 0;
      int impares = 0;
      
      System.out.println("Digite a quantidade de números desejada: ");
      quantidadeNumeros = scanner.nextInt();

      do{
         System.out.println("Digite um Número: ");
         numero = scanner.nextInt();

         if(numero % 2 == 0) pares++;
         else impares++;

         count++;
      }while(count < quantidadeNumeros);

      System.out.println("Quantidade de números Pares: " + pares);
      System.out.println("Quantidade de números Impares: " + impares);
   }
}
      
