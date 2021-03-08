import java.util.Scanner;


public class Aluno extends Pessoa  {

    public static void main(String[] args) {


        Scanner lerNome = new Scanner (System.in);
        Scanner lerSexo = new Scanner (System.in);
        Scanner lerIdade = new Scanner (System.in);
        

        System.out.println("digite o sexo(1 para feminino e 2 para masculino):  ");

        int sexo = lerSexo.nextInt();

        if (sexo == 1){

            System.out.println("digite o nome:  ");

            String nome = lerNome.nextLine();

            System.out.println("digite a idade:  ");

            String idade = lerIdade.nextLine();

            Pessoa nomeF = new Pessoa (sexo,nome,idade);

            System.out.println("\n\nCadastro (sexo feminino) \n\n" +nomeF);
        }

       
           
        else if (sexo == 2){

            String nome = lerNome.nextLine();
            
            String idade = lerIdade.nextLine();

            Pessoa nomeM = new Pessoa (sexo,nome,idade);

            System.out.println("\n\nCadastro (sexo masculino) \n\n" +nomeM);


        
        }
            
        else    {
            System.out.println("ERRO");   
        }  
        

    }
    
}
