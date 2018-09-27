import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("tstestesetestesete");
        ps.println();
        ps.println("sdfsdfsdfsdfsd");

        ps.close();
    }
}
