
public class Principal {
    public Alumno alu (int numeroMatricula, String nombre, String apellido, String rut) {
        Alumno alumnoNuevo = new Alumno(numeroMatricula, nombre, apellido, rut);
        Curso curso = new Curso();
        curso.agregarAlumno(numeroMatricula,nombre,apellido,rut);
        curso.modificarCaracteristicasAlumno(nombre,apellido);
        curso.eliminarAlumno(alumnoNuevo);
        curso.moverAlumno(nombre,apellido);
        ValidarRut validarRut = new ValidarRut();
        return alumnoNuevo;
    }
    public static void main(String[] args) {
        new Principal();
        private ValidarRut
}
