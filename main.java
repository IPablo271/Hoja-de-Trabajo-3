//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase principal
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;
import java.util.*;

public class main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(System.in); //Variable asignada para el Scanner.
    //Se importan los programas de sorting
    SelectionSort s=new SelectionSort();
    GnomeSort g = new GnomeSort();
    QuickSort q = new QuickSort();
    MergeSort m = new MergeSort();
    Radix r = new Radix();
    //MergeSort m = new MergeSort();
    ArrayList<String> miarray = new ArrayList<String>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    int[] saved  = new int[3000];
    
    //se prueba crear el documento y se escriben los números generados aleatoriamente
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      for(int i=0;i<3000;i++){
        int valordado= (int) Math.floor(Math.random() * 3000+ 1);
        String a=String.valueOf(valordado);
        myWriter.write(a);
        myWriter.write(" ");
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    archivos arch=new archivos();
    String ab=arch.leer("filename.txt");
    String [] dividido=ab.split(" ");
    for (String a : dividido)
            miarray.add(a);
    for(int i=0;i<3000;i++){
        String a=miarray.get(i);
        int numero=Integer.parseInt(a);
        array2.add(numero);
        int numero2=array2.get(i);
        saved[i]=numero2;
        
        
        
    }
    //se despliega el menu para el usuario
    int op = 0;
    while (op != 6){
      System.out.println("Ingrese el número del tipo de sorting que desea utilizar");
      System.out.println("1. Selection Sort ");
      System.out.println("2. Gnome Sort ");
      System.out.println("3. Merge Sort ");
      System.out.println("4. Radix Sort ");
      System.out.println("5. Quick Sort ");
      System.out.println("6. Salir ");

      op = scan.nextInt();
      if(op == 1){ //selection sort
        s.sort(saved);
        s.printArray(saved);
      }else if(op == 2){ //gnome sort
        g.sort(saved);
        g.printArray(saved);
      }else if(op == 3){ //merge sort
        m.mergeSort(saved,0,2999);
        m.printArray(saved);
      }else if(op == 4){ //radix sort
        r.radixsort(saved,2999);
        r.print(saved, 2999);
      }else if(op == 5){ //quick sort
        q.sort(saved,0,2999);
        q.printArray(saved);
      }

      
    }
    


    


    
    
  }
}