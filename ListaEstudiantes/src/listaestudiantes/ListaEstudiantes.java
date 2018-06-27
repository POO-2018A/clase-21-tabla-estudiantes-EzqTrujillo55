
package listaestudiantes;


public class ListaEstudiantes {

    private String nombre;
    private String apellido;
    private double notaUno;
    private double notaDos;
    private double notaTres;
    private double promedio;

    public ListaEstudiantes(String nombre, String apellido, Double notaUno, Double notaDos, Double notaTres, Double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
        this.promedio= promedio; 
    }

  
  public static void main(String[] args) {
        // TODO code application logic here
         Ventana Titulo = new Ventana ();
        Titulo.setVisible(true);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(double notaUno) {
        this.notaUno = notaUno;
    }

    public double getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(double notaDos) {
        this.notaDos = notaDos;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return nombre + "             " + apellido + "               " + notaUno +  "                 " + notaDos + "                 " + notaTres  + "                  " + promedio + "\n";
    }
    
    
    
}
