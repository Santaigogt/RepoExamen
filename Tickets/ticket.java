

package Tickets;

/**
 *
 * @author Student
 */
public class ticket {
    
    private int cont = 1;
    private int numero;
    private TipoTickete tipo;

    /*
    public int getNumero() {
        return numero;
    }
     */
    public TipoTickete getTipo() {
        return tipo;
    }

    public ticket(TipoTickete tipo) {
        this.numero = autoincremental();
        this.tipo = tipo;
    }

    public int autoincremental() {
        cont++;
        return cont;
    }

    @Override
    public String toString() {
        return "ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }

}
