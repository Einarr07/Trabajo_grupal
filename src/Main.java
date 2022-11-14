public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Universidades EPN = new Universidades(); //Objeto universidad 1
        System.out.println("Nombre: " + EPN.getNombre_U());
        System.out.println("Carreras: " + EPN.getCarreras());
        System.out.println("Docentes: " + EPN.getDocentes());
        System.out.println("Estudiantes: " + EPN.getEstudiantes());
        Universidades Sale = new Universidades();
        System.out.println(" ");
        Sale.setNombre_U("Salesiana");
        System.out.println("Nombre: " + Sale.getNombre_U());
        Sale.setCarreras(5);
        System.out.println("Carreras: " + Sale.getCarreras());
        Sale.setDocentes(8);
        System.out.println("Docentes: " + Sale.getDocentes());
        Sale.setEstudiantes(50);
        System.out.println("Estudiantes: " + Sale.getEstudiantes());
    }
}