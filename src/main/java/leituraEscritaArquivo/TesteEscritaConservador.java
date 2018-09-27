package leituraEscritaArquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaConservador {

    public static void main(String[] args) throws IOException {

        OutputStream outputStream = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("teste");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("asdasdasdasdasd");

        bufferedWriter.close();
    }
}
