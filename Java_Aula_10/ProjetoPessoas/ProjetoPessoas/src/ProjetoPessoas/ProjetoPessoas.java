package ProjetoPessoas;

public class ProjetoPessoas {
    public static void main(String[] args){
        //Programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");;
        p3.setNome("João");;
        p4.setNome("Julia");

        // Configurações adicionais para demonstração

        p2.setCurso("Informática");;
        p3.setEspecialidade("Matemática");
        p3.setSalario(2500.75);
        p4.setSetor("Administração");
        p4.setTrabalhando(true);

        // Exemplo de Saída

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Aluno: " + p2.getNome() + ", Curso: " + p2.getCurso());
        System.out.println("Professor: " + p3.getNome() + ", Especialidade: " + p3.getEspecialidade() + ", Salário: R$ " + p3.getSalario());
        System.out.println("Funcionário: " + p4.getNome() + ", Setor: " + p4.getSetor() + ", Trabalhando: " + p4.getTrabalhando());
    }
}
