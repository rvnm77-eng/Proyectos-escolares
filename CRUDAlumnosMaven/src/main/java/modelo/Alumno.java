package modelo;

/*
  Clase modelo que representa a un alumno
  Contiene los atributos que corresponden a los campos de la tabla alumnos
 */
public class Alumno {
    // Atributos privados (encapsulación)
    private int id;
    private String nombre;
    private int edad;
    
    /*
      Constructor vacío
      Permite crear un objeto Alumno sin datos iniciales
     */
    public Alumno() {
    }
    
    /*
      Constructor con parámetros
      Permite crear un objeto Alumno con todos sus datos
     */
    public Alumno(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters y Setters - permiten acceder y modificar los atributos privados
    
    /*
      Obtiene el ID del alumno
      @return id del alumno
     */
    public int getId() {
        return id;
    }
    
    /*
      Establece el ID del alumno
      @param id nuevo id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /*
      Obtiene el nombre del alumno
      @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /*
      Establece el nombre del alumno
      @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*
      Obtiene la edad del alumno
      @return edad del alumno
     */
    public int getEdad() {
        return edad;
    }
    
    /*
      Establece la edad del alumno
      @param edad nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
