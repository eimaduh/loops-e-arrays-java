package arrays;

public class OrdemInversa{
   public static void main(String[] args) {

      int[] vetor = {23, 6, 87, 4, 12, 8}; //array unidimensional
      int count = 0;

      System.out.print("Ordem original do vetor: \n");

      while(count <= (vetor.length-1)) {
         System.out.print(vetor[count] + " ");
         count++;
      }
      System.out.print("\n");

      System.out.print("Ordem inversa do vetor: \n");

      for(int i = (vetor.length -1); i >= 0 ; i--){
         System.out.print(vetor[i] + " ");
      }
      System.out.print("\n");
   }
}