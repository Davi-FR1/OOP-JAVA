package abstrato;
 
public class FuncionarioPJ extends Funcionario
{

    public FuncionarioPJ(String nome, double salario)
    {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
       return super.salario;
    }
    
}
