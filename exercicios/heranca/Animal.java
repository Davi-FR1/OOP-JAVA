package exercicios.heranca;


public class Animal 
{
    
    protected String nome;
    
    //Polimorfismo por sobrecarga
    //Dois construtores com o mesmo nome, mas com parâmetros diferentes
    public Animal()
    {
        this("");
    }
    
    public Animal(String nome)
    {
        this.nome = nome;
    }
    
    public void emitirSom()
    {
        System.out.println("O animal faz um som!");
    }
    
    
}
