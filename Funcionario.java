package abstrato;

public abstract class Funcionario 
{
    
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) 
    {
        this.nome = nome;
        this.salario = salario;
    }
    
    //Método abstrato = sem implementação
    public abstract double calcularSalario();
    
    //Método concreto = com implementação
    public void exibirDados()
    {
        System.out.println("Nome: " + nome);
        System.out.println(String.format("Salário: R$ %.2f", calcularSalario()));
        
    }
    
}
