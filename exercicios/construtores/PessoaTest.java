package exercicios.construtores;

public class PessoaTest 

{
    
    public static void main(String[] args) 
    {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa ("João da Silva", 23);
        Pessoa p3 = new Pessoa ("José Antonio");
        
        System.out.println(p1);
        
        p1.setNome("Ana Maria");
        p1.setIdade(21);

        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
                
        
    }
    
}
