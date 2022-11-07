package OrdenarFilaCantina;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaCantina objeto = new FilaCantina();

        int n; //number of test cases to follow
        int [] vetorAlunos; //number of students


        System.out.println("Digite a quantidade de testes: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Digite a quantidade de alunos: ");
            vetorAlunos = new int[sc.nextInt()];

            for(int j = 0; j < vetorAlunos.length; j++){
                System.out.println("Digite a nota do aluno da posicao: " + (j+1));
                vetorAlunos[j] = sc.nextInt();
            }
            objeto.ordenarFila(vetorAlunos, n);

            System.out.println("Quantidade de alunos que NAO trocaram de posicao: " + objeto.qtdNaoAlterada);
        }
    }
}
