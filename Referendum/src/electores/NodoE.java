package electores;

/**
 * Created by jPablo on 16/10/2015.
 */
public class NodoE {

    private Elector e;
    private NodoE sig;

    public NodoE() {
        // TODO Auto-generated constructor stub
        sig=null;
    }

    public Elector getE() {
        return e;
    }

    public void setE(Elector e) {
        this.e = e;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }

    // metodos

    public void mostrarN(){
        e.mostrar();
    }

}
