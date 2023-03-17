import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Test1{
public static void main(String[] args) {
    EnkelArrayListe listen = new EnkelArrayListe(50);
    try{
        File fil = new File("navn.txt");
        try {
            fil.canRead();
        } catch (Exception e) {
            System.out.println("fikk ikke åpnet tilen");
        }
        Scanner sc = new Scanner(fil);
        while (sc.hasNextLine()){
            String data = sc.nextLine();
            listen.settInn(data);
        }
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
    }
    System.out.println(listen);
}
}