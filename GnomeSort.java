
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