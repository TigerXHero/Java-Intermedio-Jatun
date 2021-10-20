public class ArbolBinarioDeBusqueda<T extends Comparable<T>>{
    private T raiz;
    private ArbolBinarioDeBusqueda<T> izq;
    private ArbolBinarioDeBusqueda<T> der;
    public ArbolBinarioDeBusqueda(){
        raiz = null;
        izq = null;
        der = null;
    }

    public boolean estaVacio(){
        return raiz == null;
    }

    public void add(T dato){
        if(estaVacio()){
            raiz = dato;
            izq = new ArbolBinarioDeBusqueda<>();
            der = new ArbolBinarioDeBusqueda<>();
        }else{
            if(dato.compareTo(raiz)<0){
                izq.add(dato);
            }else{
                der.add(dato);
            }
        }
    }

    public T remove(T dato){
        T res = null;
        if(!estaVacio()){
            if(dato == raiz){
                res = raiz;
                int caso = estadoArbol();
                switch(caso){
                    case 0: raiz = null; 
                            izq  =  null;
                            der  =  null;
                            break;
                            
                    case 1: raiz = der.raiz;
                            izq  = der.izq;
                            der  = der.der;
                            break;
                            
                    case 2: raiz = izq.raiz;
                            izq  = izq.izq;
                            der  = izq.der; 
                            break;
                            
                    case 3: raiz = izq.desDer();
                            izq.remove(raiz);
                            break;
                }
            }else{
                if(dato.compareTo(raiz)<0){
                    res = izq.remove(dato);
                }else{
                    res = der.remove(dato);
                }
            }
        }
        return res;
    }
    private T desDer(){
        T res;
        if(der.estaVacio()){
            res = this.raiz;
        }else{
            res = der.desDer();
        }
        return res;
    }

    private int estadoArbol(){
        int res;
        if(izq.estaVacio()){
            if(der.estaVacio()){
                res = 0; //es hoja
            }else{
                res = 1;//solo existe rama derecha
            }
        }else{
            if(der.estaVacio()){
                res = 2;//solo existe rama izquierda
            }else{
                res = 3;// el nodo tiene a sus 2 subarboles con datos
            }
        }
        return res;
    }
}