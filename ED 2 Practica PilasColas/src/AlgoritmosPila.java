public class AlgoritmosPila {

    public Asignatura asignaturaNotaMáxima(Pila asignaturas) {
        Asignatura resultado = null;

        if (!asignaturas.vacia()){
            Asignatura b = asignaturas.desapilar();
            resultado = asignaturaNotaMáxima(asignaturas);          
            if (resultado == null || b.getCalificacion() > resultado.getCalificacion()){
                resultado = b; 
            }
            asignaturas.apilar(b);
        }

        return resultado;
    }

   

    public double notaMínima(Pila asignaturas) {
        double resultado = 0;
        if (!asignaturas.vacia()){
            Asignatura aux = asignaturas.desapilar();
            resultado = notaMínima(asignaturas);
            if ( resultado == 0 || aux.getCalificacion() < resultado){
                resultado = aux.getCalificacion();
            }
            asignaturas.apilar(aux);
        }
        return resultado;
    }


    public void mostrarAprobadas(Pila asignaturas) { 

        if (!asignaturas.vacia()){
            Asignatura aux = asignaturas.desapilar();
            mostrarAprobadas(asignaturas);
            if (aux.getCalificacion() >= 5){
                aux.mostrar();
            }
            asignaturas.apilar(aux);
        }
    }
    


}
