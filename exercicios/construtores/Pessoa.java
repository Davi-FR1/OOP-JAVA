
package exercicios.construtores;


public class Pessoa 
{

    private String nome;
    private int idade;
    
     public Pessoa()
    {
        this("", 0);
    }
      public Pessoa(String nome)
    {
        this(nome, 0);
    }
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome)
    {
        
        this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
     
        if (idade < 0)
        {
            this.idade = idade;
        }
        
    }
    
    
    
    @Override
    public String toString()
    {
        return String.format("Nome: %s\nIdade: %d\n", 
                                nome, idade);
    }
    
}
