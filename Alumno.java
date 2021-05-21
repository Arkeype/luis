package alumno;

public class Alumno {
  public String nombre;
  public double notaMedia = 0.0;
  
  public void AsignarNota(String nombreAlumno, double notaAsignada) {
      nombre = nombreAlumno;
      notaMedia = notaAsignada;
  }
}
