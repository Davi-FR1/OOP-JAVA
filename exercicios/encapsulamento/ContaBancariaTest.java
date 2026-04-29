package exercicios.encapsulamento;


public class ContaBancariaTest 
{
    
    public static void main(String[] args) 
    {
        
         ContaBancaria b1 = new ContaBancaria();
         b1.cliente = "João da Silva";
         b1.depositar(1000);
         
        if (b1.sacar(1200))
        {
            System.out.println("Saque realizado!");
        }else
        {
            System.out.println("Saldo insuficiente.");
        }
         
         System.out.println(b1.toString());
        
    }
    
}
