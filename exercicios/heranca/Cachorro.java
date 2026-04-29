package exercicios.heranca;


public class Cachorro extends Animal
{
    public Cachorro(String nome)
    {
        //Chamada do construtor da superclasse
        super(nome);
    }
    
    //Polimorfismo por Sobrescrita (Sobreposição)
    //O método emitirSom foi sobrescrito da superclasse
    @Override
    public void emitirSom()
    {
        System.out.println("O cachorro " + super.nome +  " late!");
    }
}
