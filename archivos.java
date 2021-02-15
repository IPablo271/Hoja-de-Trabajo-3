//Universidad del Valle de Guatemala.
//Nombre: Fernanda Argueta y Pablo Gonzalez.
//Hoja de trabajo 3
//Clase de quick que permite leer el archivo txt
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class archivos{
    public String leer(String camino) throws FileNotFoundException{
        try{
        File file=new File(camino);
        Scanner scan=new Scanner(file);
        
        String a =scan.nextLine();
        return a;

        }catch(Exception fileNotFoException){
            String b="El archivo no se encontro";
            return b;
        }
        
    }
    
}