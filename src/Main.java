public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Universidades EPN = new Universidades();
        System.out.println("Nombre: " + EPN.getNombre_U());
        System.out.println("Carreras: " + EPN.getCarreras());
        System.out.println("Docentes: " + EPN.getDocentes());
        System.out.println("Estudiantes: " + EPN.getEstudiantes());

        System.out.println("    Cambios!");
        System.out.println("Nombre: " + EPN.getNombre_U());
        EPN.setCarreras(10);
        System.out.println("Carreras: " + EPN.getCarreras());
        EPN.setDocentes(5);
        System.out.println("Docentes: " + EPN.getDocentes());
        EPN.setEstudiantes(200);
        System.out.println("Estudiantes: " + EPN.getEstudiantes());


    }
}