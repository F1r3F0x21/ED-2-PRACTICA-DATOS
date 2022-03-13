public class NodoPila {

    private Asignatura dato;
    private NodoPila siguiente;

    NodoPila(Asignatura d, NodoPila s) {
        dato = d;
        siguiente = s;
    }

    public Asignatura getDato() {
        return this.dato;
    }

    public void setDato(Asignatura dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

   
}

