import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String agregarAlumno;
    private String eliminarAlumno;
    private String moverAlumno;
    public Alumno alu (int numeroMatricula, String nombre, String apellido, String rut){
        Alumno alumnoNuevo = new Alumno(numeroMatricula, nombre, apellido, rut);
        return null;
    }
    private List<Alumno>alumnos;
    public Curso(){
        this.alumnos = new ArrayList<Alumno>();
    }
    public Alumno agregarAlumno(int numeroMatricula, String nombre, String apellido, String rut){
        Alumno alumno = new Alumno(numeroMatricula, nombre, apellido, rut);
        this.alumnos.add(alumno);
        return alumno;
    }

    public void modificarCaracteristicasAlumno(String nombre, String apellido) {
        for (Alumno alum : this.alumnos) {
            if (alum.getNombre().equals(nombre) && alum.getApellido() == apellido);
            break;
        }
    }
    public void eliminarAlumno (Alumno alumno){
        this.alumnos.remove(alumno);
    }
    public boolean moverAlumno(String nombre, String apellido){
        for (Alumno alum : this.alumnos){
            if (alum.getNombre().equals(nombre) && alum.getApellido()== apellido){
                this.alumnos.remove(alum);
                return true;
            }
        }
        return false;
    }
    public Curso (String agregarAlumno, String modificarCaracteristicasAlumno, String eliminarAlumno, String moverAlumno) {
        this.agregarAlumno = agregarAlumno;
        this.eliminarAlumno = eliminarAlumno;
        this.moverAlumno = moverAlumno;
    }
}
