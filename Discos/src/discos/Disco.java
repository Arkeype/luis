package discos;

/**
 *
 * @author luis_miguel_vargas_garrido
 */
public class Disco {

    /**
     *
     */
    protected String codigo = "LIBRE"; //Establece el codigo como LIBRE

    /**
     *
     */
    protected String autor;  //determina el autor

    /**
     *
     */
    protected String titulo; //determina el titulo

    /**
     *
     */
    protected String genero; //determina el genero

    /**
     *
     */
    protected int duracion; // duración total en minutos

 //Convierte los atributos a texto leible

    /**
     *
     * @return
     */
  public String toString() {
    String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;  
        cadena += "\nAutor: " + this.autor;    
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";

    return cadena;
  }
}
