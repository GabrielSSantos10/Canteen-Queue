package OrdenarFilaCantina;

public class FilaCantina {

    int aux;
    int qtdNaoAlterada;
    int vetorOriginal[];


    public void ordenarFila(int[] vetor, int n){

        vetorOriginal = new int[vetor.length]; 
        qtdNaoAlterada = 0;

        for(int i = 0; i < vetor.length; i++){
            vetorOriginal[i] = vetor[i];
        }

        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j]; 
                    vetor[j] = aux; 
                }
            }
        }

        for(int i = 0; i < vetor.length; i++){
            if (vetorOriginal[i] == vetor[i]){
                qtdNaoAlterada++;
            }
        }
    }
}
