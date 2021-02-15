
public class GnomeSort{
    
    public void gnomesort(int[] saved){
        int i = 2;
        while (i<n){
            if(saved[i] >= saved[i-1]){
                i++;
            }else{
                swap(saved[i], saved[i-1]);
                if(i>2){
                    i --;
                }                
            }
        }
    }

    public void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i){ 
            System.out.print(saved[i]+" "); 
            System.out.println(); 
        }
    }
    
}