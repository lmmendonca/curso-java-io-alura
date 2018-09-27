import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("lorem2.txt");

        pw.println("tstestesetestesete");
        pw.println();
        pw.println("sdfsdfsdfsdfsd");

        pw.close();
    }
}
