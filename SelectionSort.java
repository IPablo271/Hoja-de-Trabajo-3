//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase para ordenar datos con la metodologia de Selectionsort
//Referencia: Mishra, R. (2014, January 31). Selection Sort - GeeksforGeeks. Retrieved from GeeksforGeeks website: https://www.geeksforgeeks.org/selection-sort/
class SelectionSort 
{ 
    void selecsort(int arr[]) 
    { 
        int n = arr.length; //Tamaño del array
        for (int i = 0; i < n-1; i++) 
        { // Encuentra el valor minimo del elemento en un array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Cambia el elemento menor con el primer elemento 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }  
    // Imprime el array ingresada
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

} 