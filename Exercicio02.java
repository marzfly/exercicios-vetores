import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];
        int contadorPos = 0, contadorNeg = 0;
        int[] vetor1 = new int[8];
        int[] vetor2 = new int[8];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] >= 0){
                vetor1[contadorPos] = vetor[i];
                contadorPos++;
            } else if (vetor[i] < 0) {
                vetor2[contadorNeg] = vetor[i];
                contadorNeg++;
            }
        }
        System.out.println("Números positivos ou nulos: ");
        
        for(int i = 0; i < contadorPos; i++){
            System.out.println(vetor1[i]);
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i < contadorNeg; i++){
            System.out.println(vetor2[i]);
        }

        sc.close();
    }
}
