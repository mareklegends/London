
package london;

/**
 *
 * @author alumno
 */
public class Contacto {
    private String dni;

    public Contacto(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        String datos="";
        datos+=dni;
        return datos;
    }
    
    
}
