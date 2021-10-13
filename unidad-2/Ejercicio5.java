import java.util.*;

/**
 * Invertir una cadena usando la estructura Pila.
 * 
 * @author Isaias 
 * @version 1.0
 */
public class Ejercicio5
{
    Stack<Character> pilaC;
    
    public Ejercicio5()
    {        
        pilaC = new Stack<Character>();    
    }
    
    public String invertirCadena(String cadena)
    {
        String res = "";                
        for(int i=0; i<cadena.length(); i++){            
            pilaC.push(cadena.charAt(i));             
        }
        for(int j=0; j<cadena.length(); j++){
            res += pilaC.pop();
        }        
        return res;
    }
}
