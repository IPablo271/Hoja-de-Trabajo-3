//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase de selection sorting
//Referencia: Zobenica, D. (2015, September 2). Sorting Algorithms in Java. Retrieved from GeeksforGeeks website: https://stackabuse.com/sorting-algorithms-in-java/
class SelectionSort 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Encuentra el valor minimo del elemento en un array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Imprime el array ingresada
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i){ 
            System.out.print(arr[i]+" "); 
            System.out.println(); 
        }
    } 

} 