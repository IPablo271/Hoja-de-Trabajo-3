//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase de merge sorting
//Referencia: Zobenica, D. (2015, September 2). Sorting Algorithms in Java. Retrieved from GeeksforGeeks website: https://stackabuse.com/sorting-algorithms-in-java/
public class MergeSort{

    
      public void sort(int array[], int p, int q, int r ){
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // fill the left and right array
        for (int i = 0; i < n1; i++)
        L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
        M[j] = array[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        // for sorting in descending
        // use if(L[i] >= <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
        array[k] = L[i];
        i++;
        k++;
        }

        while (j < n2) {
        array[k] = M[j];
        j++;
        k++;
        }
    }

    void mergeSort(int array[], int left, int right) {
        if (left < right) {
    
          // m is the point where the array is divided into two sub arrays
          int mid = (left + right) / 2;
    
          // recursive call to each sub arrays
          mergeSort(array, left, mid);
          mergeSort(array, mid + 1, right);
    
          // Merge the sorted sub arrays
          sort(array, left, mid, right);
        }
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