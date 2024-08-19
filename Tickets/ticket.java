

package Tickets;

/**
 *
 * @author Student
 */
public class ticket {
 
    private String numero;
    private TipoTickete tipo;

    public String getNumero() {
        return numero;
    }

    public TipoTickete getTipo() {
        return tipo;
    }

    public ticket(String numero, TipoTickete tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        return "ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
   
}
