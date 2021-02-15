
public class GnomeSort{
    
    public void sort(int saved[] ){
        int i = 2;
        while (i<saved.length){
            if(saved[i] >= saved[i-1]){
                i++;
            }else{
                int uno = saved[i-1];
                int dos = saved[i];
                saved[i] = uno;
                saved[i-1] = dos;
                if(i>2){
                    i --;
                }                
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
    
}