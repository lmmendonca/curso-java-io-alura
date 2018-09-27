package Serealizacao;

import Serealizacao.Cliente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerealizacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        Serealizacao.Cliente cliente = new Serealizacao.Cliente();
//
//        cliente.setCpf("123456");
//        cliente.setNome("LEonardo");
//        cliente.setProfissao("Pedreiro");
//
//
//        ObjectOutputStream objectOutputStream =
//                new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//
//        Object nome = "Leonardo";
//        objectOutputStream.writeObject(cliente);
//        objectOutputStream.close();


        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("objeto.bin"));

        Cliente cliente1 = (Cliente) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(cliente1.getCpf());
    }
}
