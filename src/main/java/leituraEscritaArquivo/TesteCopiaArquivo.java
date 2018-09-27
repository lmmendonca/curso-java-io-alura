package leituraEscritaArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiaArquivo {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

//        InputStream fls = s.getInputStream();
//        InputStream fls = System.in;
        InputStream fls = new FileInputStream("lorem.txt");
        Reader reader = new InputStreamReader(fls);
        BufferedReader bfr = new BufferedReader(reader);

//        OutputStream otp = s.getOutputStream();
//        OutputStream otp = System.out;
        OutputStream otp = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(otp);
        BufferedWriter bfw = new BufferedWriter(writer);

        String linha = bfr.readLine();

        while (linha != null && !linha.isEmpty()) {
            bfw.write(linha);
            bfw.newLine();
            bfw.flush();
            linha = bfr.readLine();
        }

        bfr.close();
        bfw.close();

    }
}
