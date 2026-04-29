package exercicios.heranca;


public class Gato extends Animal
{
    
     public Gato(String nome)
    {
        //Chamada do construtor da superclasse
        super(nome);
    }
     
    //Polimorfismo por Sobrescrita (Sobreposição)
    //O método emitirSom foi sobrescrito da superclasse
    @Override
    public void emitirSom()
    {
        System.out.println("O gato " + super.nome +  " mia!");
    }
}
