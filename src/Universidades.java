public class Universidades {
    //Atributos
    String nombre_U;
    int carreras;
    int docentes;
    int estudiantes;

    public Universidades(){
        nombre_U = "EPN";
        carreras = 50;
        docentes = 500;
        estudiantes = 2500;
    }

    /* Métodos y Eventos*/
    public void educar(){}

    public String getNombre_U() {
        return nombre_U;
    }

    public void setNombre_U(String nombre_U) {
        this.nombre_U = nombre_U;
    }

    public int getCarreras() {
        return carreras;
    }

    public void setCarreras(int carreras) {
        this.carreras = carreras;
    }

    public int getDocentes() {
        return docentes;
    }

    public void setDocentes(int docentes) {
        this.docentes = docentes;
    }

    public int getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(int estudiantes) {
        this.estudiantes = estudiantes;
    }
}