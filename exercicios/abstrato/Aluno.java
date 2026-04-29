package exercicios.abstrato;

public class Aluno extends Usuario
{

    public Aluno(String nome, String email) 
    {
        super(nome, email);
    }

    @Override
    public void acessarConteudo() {
       System.out.println("Acesso: Visualização e publicação de materiais");
    }
    
}
