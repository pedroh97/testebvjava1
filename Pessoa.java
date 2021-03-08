public class Pessoa {

    private String idade;
    private String nome;
    private int sexo;

    public String getIdade(){
        return idade;
    }

    public void setIdade(String idade) {
		this.idade = idade;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
		this.nome = nome;

    }
        
    public static int getSexo(){
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    
    }

    public Pessoa(int sexo, String nome,String idade){

        
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;

        
    } 

    

    @Override
    public String toString() { 
        return String.format("Sexo :    "+sexo +"\nNome:    "+ nome +"\nIdade:     "+  idade);
    } 


}


