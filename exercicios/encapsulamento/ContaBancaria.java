package exercicios.encapsulamento;


//Conta bancária 

public class ContaBancaria 
{


    public String cliente;
    private double saldo;
    
    
    public void depositar(double valor)
    {
        if (valor > 0)
        {
        saldo = saldo + valor;
        }
    }
    
    public boolean sacar(double valor)
    {
        if (valor > 0 && valor <= saldo)
        {
            saldo = saldo - valor;
            return true;
        } else
        {
            return false;
        }
    }
    
    @Override  
    public String toString()
    {
        return String.format("Cliente: %s\nSaldo: R$%.2f\n",
                                cliente,saldo);
    }



    
}
