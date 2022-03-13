public class Alumno {
    String nombre;
    String matricula; 
    double calificacionMedia;
    int numAsignaturas = 0;
    private double suma = 0;
    Pila asignaturas = new Pila();

    public Alumno(){
        nombre = " ";
        matricula = " ";
        calificacionMedia = 0;
        asignaturas = null;
    }

    public Alumno(String n, String m){
        nombre = n; 
        matricula = m;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacionMedia() {
        return this.calificacionMedia;
    }

    public int getNumAsignaturas() {
        return this.numAsignaturas;
    }

    void anadirAsignatura(Asignatura asignatura){
        asignaturas.apilar(asignatura);
        numAsignaturas = numAsignaturas +1;
        suma = suma + asignatura.getCalificacion();
        calificacionMedia = suma/getNumAsignaturas();
    }
    
    void mostrarAlumno(){
        System.out.println(getNombre() + ". " + "Matr: " + matricula + " (" + calificacionMedia + ")");
        System.out.println ("Asignaturas: ");
        if (!asignaturas.vacia()){
            asignaturas.mostrar();
        }else{
            System.out.println("NO ESTA MATRICULADO EN NINGUNA ASIGNATURA");
        }
    }
    
}
