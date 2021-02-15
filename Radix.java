//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase para ordenar datos con la metodologia Radix.
//Referencia: Agrawal, D. (2013, September 2). Radix Sort. Retrieved from GeeksforGeeks website: https://www.geeksforgeeks.org/radix-sort/
import java.io.*; 
import java.util.*; 
  
class Radix { 
  
    // Funcion para agarra el maximo valor del array.
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 

    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // array de salida de tamaño n
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
        //Almace la cantidad de ocuurencias en la array de count
        for (i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
            //Cambia count[i] para que count[i] contenga la posicion del digito en el array output[]
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        //Construye el array output.
        for (i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
        //Copia el oytput array al array arr[], para que ese array contenga los numeros ordenados de acuerdo con el actual digito.
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    //Funcion proncipal para hacer un sort radix de un array de tamaño n.
    static void radixsort(int arr[], int n) 
    { 
        // Find the maximum number to know number of digits 
        int m = getMax(arr, n); 
  
        // Ordenar cada digito contando.
        // en lugar de pasar el numero de digitos se pasa exp.
        // exp es 10^i donde i es el digito actual.

        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
  
    static void print(int arr[], int n)//Metodo para imprimir el array de 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
} 