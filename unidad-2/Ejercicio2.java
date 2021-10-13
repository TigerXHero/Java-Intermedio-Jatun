/**
 * Eliminar las posiciones impares de una lista.
 * 
 * @author Isaias 
 * @version 1.0
 */
import java.util.*;

public class Ejercicio2
{
    LinkedList<Integer> lista;
    LinkedList<Integer> listaPares;
    int pos = 0;
    
    public Ejercicio2(){
        lista = new LinkedList();
        listaPares = new LinkedList();
    }
        
    public void agregarDato(int dato){
        lista.add(dato);
    }
    
    public LinkedList<Integer> eliminarImpares(){
        for(int i=0; i<lista.size(); i++){
            if(i%2 == 0){
                listaPares.add(lista.get(i));                
            }
        }
        for(int j=0; j<listaPares.size(); j++){
            if(listaPares.get(j).compareTo(lista.get(j)) == 0){
                lista.remove(j);
            }
        }
        
        System.out.println("lista: "+lista);
        System.out.println("lista de elementos eliminada: "+listaPares);
        return lista;
    }
}
