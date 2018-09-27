import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("login", "alura"); //chave, valor
        properties.setProperty("senha", "alurapass");
        properties.setProperty("endereco", "www.alura.com.br");

        properties.store(new FileWriter("conf.properties"), "algum comentário");


        System.out.println("--------------------");
        String login = properties.getProperty("login");
        System.out.println(login);
    }
}
