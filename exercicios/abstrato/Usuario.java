package exercicios.abstrato;

public abstract class Usuario 
{
    protected String nome;
    protected String email;
    
    

    public Usuario(String nome, String email) 
    {
        this.nome = nome;
        this.email = email;
    }


    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
    
    public abstract void acessarConteudo();
    
    
}
