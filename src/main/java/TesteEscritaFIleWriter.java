import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFIleWriter {

    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();

//        OutputStream ots = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(ots);
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        bufferedWriter.write("teste");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("asdasdasdasdasd");

        bufferedWriter.close();

        System.out.println(System.currentTimeMillis() - ini);
    }
}
