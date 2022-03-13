public class Principal {
    public static void main(String[] args) {
        System.out.println("Practica ED Pilas y Colas de: " + "Francisco Sánchez de la Parra");
        System.out.println("Numero Matricula: " + "69696969");
        Principal pruebas = new Principal();

        Pila asignaturas = pruebas.prepararPila();
        pruebas.pruebasPila(asignaturas);

        Cola grupo = pruebas.prepararCola();
        pruebas.pruebasCola(grupo);
    }

    public Pila prepararPila() {
        Pila asignaturas = new Pila();
        Asignatura ffi = new Asignatura("Fundamentos Fisicos de la informatica", 5.0);
        Asignatura ed = new Asignatura("Estructuras de Datos", 6.35);
        Asignatura aes = new Asignatura("Aspectos Éticos y Sociales", 7.70);
        Asignatura fs = new Asignatura("Fundamentos de seguridad", 6.75);
        asignaturas.apilar(ffi);
        asignaturas.apilar(ed);
        asignaturas.apilar(aes);
        asignaturas.apilar(fs);
        return asignaturas;
    }

    public void pruebasPila(Pila asignaturas) {
        AlgoritmosPila algo = new AlgoritmosPila ();
        asignaturas.mostrar();
        System.out.println("\n");
        algo.asignaturaNotaMáxima(asignaturas).mostrar();
        System.out.println("\n");
        asignaturas.mostrar(); 
        System.out.println("////////////////////////////////");
        System.out.println(algo.notaMínima(asignaturas));
        System.out.println("////////////////////////////////");
        algo.mostrarAprobadas(asignaturas);
        System.out.println("////////////////////////////////");
        asignaturas.mostrar(); 
    }

    public Cola prepararCola() {
        Cola grupo = new Cola();
        Alumno a1 = new Alumno("Felipe Arias Gonzalez", "aa1253");
        Alumno a2 = new Alumno("Manuel Garcia Sacedón", "ax0074");
        Alumno a3 = new Alumno("Margarita Lopez Medina", "mj7726");
        Alumno a4 = new Alumno("Estela Sanchez Arellano", "bc2658");
        Asignatura ffi = new Asignatura("Fundamentos Físicos de la Informática", 3.50);
        Asignatura ed = new Asignatura("Estructuras de Datos", 6.35);
        Asignatura aes = new Asignatura("Aspectos Éticos y Sociales", 7.70);
        Asignatura fs = new Asignatura("Fundamentos de seguridad", 6.75);
        
        a1.anadirAsignatura(ed);
        ed = new Asignatura("Estructuras de Datos", 4.35);
        a2.anadirAsignatura(ed);
        ed = new Asignatura("Estructuras de Datos", 7.5);
        a3.anadirAsignatura(ed);
        ed = new Asignatura("Estructuras de Datos", 2.5);
        Asignatura algebra = new Asignatura("Álgebra", 5);
        a4.anadirAsignatura(algebra);
        a4.anadirAsignatura(fs);
        grupo.encolar(a1);
        grupo.encolar(a2);
        grupo.encolar(a3);
        grupo.encolar(a4);

        return grupo;
    }
    
    public void pruebasCola(Cola grupo){
        AlgoritmosCola algo = new AlgoritmosCola();
        System.out.println("                                ");
        System.out.println("////////////////////////////////");
        System.out.println("       MOSTRAR GRUPO       ");
        System.out.println("////////////////////////////////");
        System.out.println("                                ");
        algo.mostrarGrupo(grupo);
        System.out.println("ESTA ES LA CALIFICACION MEDIA DEL GRUPO: " + algo.calificaciónMedia(grupo));
        System.out.println("                                ");
        System.out.println("////////////////////////////////");
        System.out.println("       ALUMNOS APROBADOS       ");
        System.out.println("////////////////////////////////");
        System.out.println("                                ");
        algo.alumnosAprobados(grupo).mostrar();
        System.out.println("ESTA ES LA CALIFICACION MEDIA DE LOS APROBADOS: " + algo.calificaciónMedia(algo.alumnosAprobados(grupo)));
	}
}
