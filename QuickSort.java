//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase de quick sorting
//Referencia: Zobenica, D. (2015, September 2). Sorting Algorithms in Java. Retrieved from GeeksforGeeks website: https://stackabuse.com/sorting-algorithms-in-java/
public class QuickSort{
    public static void sort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
       
        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
           while(A[j] > pivote) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux= A[i];                      // los intercambia
               A[i]=A[j];
               A[j]=aux;
           }
         }
         
         A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         
         if(izq < j-1)
            sort(A,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            sort(A,j+1,der);          // ordenamos subarray derecho
         
      }
    
    public void printArray(int saved[]){ 
        int n = saved.length; 
        for (int i=0; i<n; ++i){ 
            System.out.print(saved[i]+" "); 
            System.out.println(); 
        }
    }

    public int[] showArray(int saved[]){
        return saved;
    }
    
}