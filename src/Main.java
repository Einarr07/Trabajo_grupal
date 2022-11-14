public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Universidades EPN = new Universidades(); //Objeto universidad 1
        System.out.println("El nombre de la universidad es: " + EPN.getNombre_U());
        System.out.println("El numero de las carreras es: " + EPN.getCarreras());
        System.out.println("El numero de docentes es: " + EPN.getDocentes());
        System.out.println("El numero de estudiantes es: " + EPN.getEstudiantes());
        Universidades Sale = new Universidades();
        System.out.println(" ");
        Sale.setNombre_U("Salesiana");
        System.out.println("El nombre de la univerrsidad es: " + Sale.getNombre_U());
        Sale.setCarreras(5);
        System.out.println("El numero de las carreras es: " + Sale.getCarreras());
        Sale.setDocentes(8);
        System.out.println("El numero de docentes es: " + Sale.getDocentes());
        Sale.setEstudiantes(50);
        System.out.println("El numero de estudiantes es: " + Sale.getEstudiantes());
        Universidades Cato = new Universidades();
        System.out.println(" ");
        Cato.setNombre_U("Catolica");
        System.out.println("El nombre de la univerrsidad es: " + Cato.getNombre_U());
        Sale.setCarreras(8);
        System.out.println("El numero de las carreras es: " + Cato.getCarreras());
        Sale.setDocentes(15);
        System.out.println("El numero de docentes es: " + Cato.getDocentes());
        Sale.setEstudiantes(150);
        System.out.println("El numero de estudiantes es: " + Cato.getEstudiantes());
    }
}