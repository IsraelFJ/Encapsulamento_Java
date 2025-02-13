package poo;
import java.util.Scanner;

import poo.models.Pessoa;

// CTRL + ; pode ser utilizado para comentar linhas 

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            int idade;
            String nome;
            String email;

            Pessoa pessoa = new Pessoa("", "", 0);
            
            System.out.println("Nome");
            nome = scanner.nextLine();
            System.out.println("E-mail");
            email = scanner.nextLine();
            System.out.println("Idade");
            idade = scanner.nextInt();
            
            

            pessoa.setIdade(idade);
            pessoa.setEmail(email);
            pessoa.setNome(nome);
            
            System.out.println("Nome: "+ pessoa.getNome());
            System.out.println("E-mail: "+ pessoa.getEmail());
            System.out.println("Idade: "+ pessoa.getIdade());
   
   
   
    }
}