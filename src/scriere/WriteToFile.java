package scriere;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[]args){
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Ala bala portocala cine mi-a furat banana");
            myWriter.close();
            System.out.println("Scris in fisier ;D");
        } catch (IOException e){
            System.out.println("Eroare!!");
            e.printStackTrace();
        }
    }
}
