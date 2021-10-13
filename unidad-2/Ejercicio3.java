
/**
 * De 1 lista enlazada de numeros entero verificar si el 
 * adyacente a la derecha es mas pequeño.
 * Si es actualizar el actual con el valor siguiente,
 * sino actualizar con valor a -1.
 * 
 * @author Isaias 
 * @version 1.0
 */
import java.util.*;

public class Ejercicio3
{
    LinkedList<Integer> lista;
    LinkedList<Integer> listaNueva;

    public Ejercicio3(){
        lista = new LinkedList();
        listaNueva = new LinkedList();
    }

    public void agregarLista(int dato){
        lista.add(dato);
    }

    public void listaAdyacentesMenores(){
        System.out.println("lista: "+lista);
        int i;
        for(i=0; i<lista.size()-1; i++){            
            if(lista.get(i) > lista.get(i+1)){
                listaNueva.add(i, lista.get(i+1));
            }else{
                listaNueva.add(i, -1);
            }
        }
        listaNueva.add(i, lista.get(i));
        System.out.println("lista Nueva: "+listaNueva);        
    }
}
