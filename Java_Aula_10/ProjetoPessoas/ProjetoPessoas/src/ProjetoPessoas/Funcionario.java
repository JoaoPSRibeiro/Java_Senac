package ProjetoPessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private Boolean trabalhando;

    public Funcionario(){

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
