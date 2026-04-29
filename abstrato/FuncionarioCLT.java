package abstrato;

public class FuncionarioCLT extends Funcionario
{

    public FuncionarioCLT(String nome, double salario)
    {
        super(nome, salario);
    }
    
    
    //O metodo abstrato da superclasse deve ser OBRIGATORIAMENTE
    //implementado na subclasse
    @Override
    public double calcularSalario() 
    {
        return super.salario * 1.20;
    }

    
    
}
