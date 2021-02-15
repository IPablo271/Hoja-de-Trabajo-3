//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase de gnome sorting
//Referencia: Zobenica, D. (2015, September 2). Sorting Algorithms in Java. Retrieved from GeeksforGeeks website: https://stackabuse.com/sorting-algorithms-in-java/
public class GnomeSort{
    
    public void sort(int saved[]){
        for(int i =1 ; i<saved.length;){
            if(saved[i-1] <= saved[i]){
                i++;
            }else{
                int temp;
                temp = saved[i-1];
                saved[i-1] = saved[i];
                saved[i]=temp;
                i--;
            }
            if(i ==0){
                i=1;
            }
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