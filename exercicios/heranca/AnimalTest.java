package exercicios.heranca; 

import java.util.ArrayList;
import java.util.List;


public class AnimalTest 
{
    
    public static void main(String[] args) 
    {
        //Lista dinâmica de objetos
        List<Animal> lista = new ArrayList<>();
        
        lista.add(new Cachorro("Rex"));
        lista.add(new Gato("Garfield"));
        lista.add(new Cachorro("Totó"));
        lista.add(new Gato("Tom"));
        
        //percorrer a lista
        for (Animal a: lista)
        {
            a.emitirSom();
        }
    }
    
}
