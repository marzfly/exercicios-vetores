import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        System.out.println("Exercício 4: ");
        System.out.println("\n");
        exercicio04();

        System.out.println("Exercício 5: ");
        System.out.println("\n");
        exercicio05();
    }

    public static void exercicio04(){
        Scanner sc = new Scanner(System.in);
        
        int[] vetorPrincip = new int[10];
        int[] vetorPrimos = new int[10];
        int[] vetorPosicoes = new int[10];
        int contadorPrimos = 0;
        int divisorPrimos = 2;
        boolean primo = true;

        for(int i = 0; i < vetorPrincip.length; i++){
            System.out.println("Digite um número: ");
            vetorPrincip[i] = sc.nextInt();

            primo = true;
            divisorPrimos = 2;

            if(vetorPrincip[i] < 2){
                primo = false;
            }

            while(divisorPrimos < vetorPrincip[i]){
                if(vetorPrincip[i] % divisorPrimos == 0){
                    primo = false;
                    break;
                }
                divisorPrimos++;
            }
            if(primo){
                vetorPrimos[contadorPrimos] = vetorPrincip[i];
                vetorPosicoes[contadorPrimos] = i;
                contadorPrimos++;
                //System.out.println("Número " + vetorPrincip[i] + " na posição " + i + " é primo.");
            }
        }

        System.out.println("=== Números primos ===");
        for(int i = 0; i < contadorPrimos; i++){
            System.out.println("Número " + vetorPrimos[i] + " na posição " + vetorPosicoes[i]);
        }
        System.out.print("\n");
    }

    public static void exercicio05(){
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[6];
        int[] numerosPares = new int[6];
        int[] numerosImpares = new int[6];
        int soma = 0;
        int contadorPar = 0;
        int contadorImpar = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                soma = soma + numeros[i];
                numerosPares[contadorPar] = numeros[i];
                contadorPar++;
            } else {
                numerosImpares[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }

        System.out.println("Números pares: ");
        for(int i = 0; i < contadorPar; i++){
            System.out.println(numerosPares[i]);
        }

        System.out.print("Soma dos números pares: " + soma);
        System.out.print("\n");

        System.out.println("Números ímpares: ");
        for(int i = 0; i < contadorImpar; i++){
            System.out.println(numerosImpares[i]);
        }

        sc.close();
    }
}
