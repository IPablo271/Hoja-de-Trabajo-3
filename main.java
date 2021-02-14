import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileNotFoundException;

public class main {
  public static void main(String[] args) throws FileNotFoundException {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      for(int i=0;i<3000;i++){
        int valordado= (int) Math.floor(Math.random() * 3000+ 1);
        String a=String.valueOf(valordado);
        myWriter.write(a);
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    archivos arch=new archivos();
    String a=arch.leer("filename.txt");
    System.out.println(a);
    
  }
}