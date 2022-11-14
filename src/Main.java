public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Universidades EPN = new Universidades();
        System.out.println("Nombre: " + EPN.getNombre_U());
        System.out.println("Carreras: " + EPN.getCarreras());
        System.out.println("Docentes: " + EPN.getDocentes());
        System.out.println("Estudiantes: " + EPN.getEstudiantes());
    }
}