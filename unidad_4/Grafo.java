import java.util.*;
public class Grafo{
    private int[][] matrizAdya;
    private LinkedList<String> vertices;
    private int cantVertices;
    private boolean dirigido;
    public Grafo(int cv, boolean dir){
        matrizAdya = new int[cv][cv];
        cantVertices = cv;
        dirigido = dir;
        vertices = new LinkedList<>();
    }
    
    public void agregarVertice(String vertice){
        if(vertices.size()<cantVertices){
            vertices.add(vertice);
        }
    }

    public void agregarArista(String origen, String destino){
        int posOrigen  = vertices.indexOf(origen);
        int posDestino = vertices.indexOf(destino);
        matrizAdya[posOrigen][posDestino]++;
        if(!dirigido){
            matrizAdya[posDestino][posOrigen]++;
        }
    }

    public void imprimirMatriz(){
        for(int fila = 0; fila<cantVertices; fila++){
            for(int columna = 0; columna<cantVertices; columna++){
                System.out.print(matrizAdya[fila][columna]+" ");
            }
            System.out.println();
        }
    }
}
