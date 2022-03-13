public class AlgoritmosCola {

    public void mostrarGrupo (Cola grupo) {
       Alumno elemento = new Alumno();
       int i;
        System.out.println("El grupo contiene "+ grupo.getNumElementos() + " alumnos");

       for (i = 1; i < grupo.getNumElementos()+1; i++){
           elemento = grupo.desencolar();
            System.out.println(i + ".  " + elemento.getNombre());
            grupo.encolar(elemento);
       }
    }


    public Cola alumnosAprobados (Cola grupo) {
        Cola nueva = new Cola();
        Alumno elemento = new Alumno();
        int i; 
        System.out.println("Alumnos aprobados: ");
        for (i = 0; i < grupo.getNumElementos(); i++){
            elemento = grupo.desencolar();
            
            if (elemento.calificacionMedia >= 5){
                nueva.encolar(elemento);
            }
            grupo.encolar(elemento);
        }
        return nueva;
    }

    public double calificaciónMedia (Cola aprobados) {
        double resultado = 0;
        double suma = 0;
        Alumno alumno = new Alumno();
        for (int i = 0; i < aprobados.getNumElementos(); i++){
            alumno = aprobados.desencolar();
            suma = suma + alumno.getCalificacionMedia();
            aprobados.encolar(alumno);
        }
        resultado = suma/aprobados.getNumElementos();
        return resultado;
    }
    
}
