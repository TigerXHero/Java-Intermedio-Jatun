import java.util.HashMap;
import java.util.*;
public class GrafoHM{
    private HashMap<String, LinkedList<Nodo>> grafo;
    private boolean dirigido;

    public GrafoHM(boolean valor){
        grafo = new HashMap<>();
        dirigido = valor;
    }

    public void agregarArista(String origen, String destino, int costo){
        crearArista(origen,destino,costo);
        if(!dirigido){
            crearArista(destino,origen,costo);
        }
    }

    public LinkedList<Nodo> darValor(String clave){
        LinkedList<Nodo> nodito = grafo.get(clave);
        System.out.println(nodito);
        return nodito;
    }

    private void crearArista(String origen, String destino, int costo){
        Nodo nuevo = new Nodo(destino,costo);
        if(!grafo.containsKey(origen)){
            grafo.put(origen, new LinkedList<>());
        }        
        LinkedList<Nodo> vecinos = grafo.get(origen);
        vecinos.add(nuevo);
    }

    public void bfsAmplitud(String raiz){
        Queue<Nodo> cola = new LinkedList<>();
        TreeSet<String> visitados = new TreeSet<>();
        cola.offer(new Nodo(raiz,0));
        while(!cola.isEmpty()){
            Nodo actual = cola.poll();
            String vertice = actual.getVertice();
            if(visitados.add(vertice)){
                System.out.print(vertice+" ");
                LinkedList<Nodo> vecinos = grafo.get(vertice);
                cola.addAll(vecinos);
            }
        }
    }

    public void dfsProfundidad(String raiz){
        Stack<Nodo> pila = new Stack<>();
        TreeSet<String> visitados = new TreeSet<>();
        pila.push(new Nodo(raiz,0));
        while(!pila.isEmpty()){
            Nodo actual = pila.pop();
            String vertice = actual.getVertice();
            if(visitados.add(vertice)){
                System.out.print(vertice+" ");
                LinkedList<Nodo> vecinos = grafo.get(vertice);
                pila.addAll(vecinos);
            }
        }
    }

    public void eliminarVertice(String x){
        if( grafo.containsKey(x) ){
            System.out.println("Existe el vertice: "+x);
            //recuperar el destino (vecinos)
            LinkedList<String> vecinos = new LinkedList<>();
            LinkedList<Nodo> listaNodos = grafo.get(x);
            for(int i=0; i<grafo.size(); i++){
                System.out.println("vecinos: "+i);
            }
            
            grafo.remove(x); //eliminar Vertice
           // eliminarArista(v, x);
        }else{
            System.out.println("no existe el vertice: " +x);
        }     
    }

    public void eliminarArista(String o, String d){
        quitarArista(o, d);
        if(!dirigido){
            quitarArista(d, o);
        }
    }

    private void quitarArista(String o, String d){
        LinkedList<Nodo> lista = grafo.get(o);

    }
}