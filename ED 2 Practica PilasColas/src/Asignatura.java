public class Asignatura {

    String nombre; 
    double calificacion;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Asignatura(){
        nombre = "";
        calificacion = 0;
    }

    public Asignatura (String n, double cal){
        nombre = n;
        calificacion = cal;

        
    }

    void mostrar(){
        System.out.println(getNombre()+ " ("+getCalificacion()+")");
    }


}
