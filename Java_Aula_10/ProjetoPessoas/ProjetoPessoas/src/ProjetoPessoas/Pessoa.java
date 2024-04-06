package ProjetoPessoas;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    // Aqui podemos adicionar mais atributos padrões como CPF, RG, etc..

    public Pessoa() {
            //construtor padrão
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
