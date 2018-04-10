import java.io.PrintWriter;

public class printWriter_Hello_World {

    //using PrintWriter to output Hello, World
    public static void main(String [] args) {
        PrintWriter header = new PrintWriter(System.out,true);
        intro(header,"Hello","World","04/10/2018");
    }

    public static void intro (PrintWriter input, String first, String last, String date){
        input.println(first + ", " + last + '\n' + date);
    }

}
