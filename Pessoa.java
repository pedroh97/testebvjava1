public class Pessoa {

    private int idade;
    private static String nome;
    private static char sexo;

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

    public Pessoa(int idade,String nome,char sexo){
        
    } 


    public void idade() {
        idade = 3;
    }

    public void nome() {
        nome = "Pedro";
    }
    
    public void sexo() {
        sexo = 'M';
    }


}
