package leituraEscritaArquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo entrada com arquivo(Stream = Leitura em Bytes)
        FileInputStream file = new FileInputStream("lorem.txt");

        //Transformando os bits rm bytes de caracter(Reader = Leitura em Caracterres)
        Reader reader = new InputStreamReader(file);

        //Guardar todos os caracteres de uma linha com o buffer
        BufferedReader bufferedReader = new BufferedReader(reader);

        String linha = bufferedReader.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
