package abstrato;

public class FuncionarioTest 
{
    
    public static void main(String[] args)
    {
        
        Funcionario f1 = new FuncionarioCLT("Ana Maria", 5000);
        Funcionario f2 = new FuncionarioCLT("Joao da Silva", 3000);
        Funcionario f3 = new FuncionarioPJ("Robertinho", 4500);
        Funcionario f4 = new FuncionarioPJ("Kimberly", 6000);
        
        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
        f4.exibirDados();
        
        
        
    }
    
    
    
    
    
    
}
