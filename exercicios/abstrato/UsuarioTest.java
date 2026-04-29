package exercicios.abstrato;

import java.util.ArrayList;
import java.util.List;

public class UsuarioTest 
{
 
    public static void main(String[] args) 
    {
        
        List<Usuario> lista = new ArrayList<>();
        
        lista.add(new Aluno("João da Silva", "joao.silva@email.com"));
        lista.add(new Aluno("Ana Maria", "ana.maria@email.com"));
        lista.add(new Professor("Hernando Ferreira", "Hernando.ferreira@email.com"));

    }
    
    
}
