public class Pessoa {

    private int idade;
    private String nome;
    private char sexo;

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
		this.idade = idade;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
		this.nome = nome;

    }
        
    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    
    }

    public Pessoa(int idade, String nome,char sexo){

        
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;

        
    } 

    

    @Override
    public String toString() { 
        return String.format("Nome :    "+nome +"\nIdade:    "+ idade +"\nSexo:     "+  sexo);
    } 


}
