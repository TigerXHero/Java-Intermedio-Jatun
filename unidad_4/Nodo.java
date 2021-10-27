public class Nodo{
    private String vertice;
    private int costo;
    public Nodo(String vertice, int costo){
        this.vertice = vertice;
        this.costo = costo;
    }
    public String getVertice(){
        return vertice;
    }
    public int getCosto(){
        return costo;
    }
}