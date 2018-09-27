import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

    public static void main(String[] args) throws IOException {

        //Serve para ler linha por linha
        Scanner scanner = new Scanner(new File("contas.csv"));


        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

//            Parse com Scanner
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            Integer agencia = linhaScanner.nextInt();
            Integer numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();

            // Impressao Formatada
            //%s = abreviacao de String
            //https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
            System.out.format(new Locale("pt", "BR"),"%s, %04d-%010d, %20s, %05.2f", tipoConta,
                    agencia, numero, titular, saldo);


            linhaScanner.close();

//            Pardrao parse em String:
//            String[] valores = linha.split(",");
//
//            System.out.println(Arrays.toString(valores));
//
//            System.out.println(valores[1]);
        }


        scanner.close();


    }
}
