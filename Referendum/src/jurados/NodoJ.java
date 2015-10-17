package jurados;

/**
 * Created by jPablo on 16/10/2015.
 */
public class NodoJ {

    private Jurado J;
    private NodoJ ant;
    private NodoJ sig;

    public NodoJ() {
        // TODO Auto-generated constructor stub
        ant=null;
        sig=null;
        J=new Jurado();
    }

    public Jurado getJ() {
        return J;
    }

    public void setJ(Jurado j) {
        J = j;
    }

    public NodoJ getAnt() {
        return ant;
    }

    public void setAnt(NodoJ ant) {
        this.ant = ant;
    }

    public NodoJ getSig() {
        return sig;
    }

    public void setSig(NodoJ sig) {
        this.sig = sig;
    }

    public void mostrar() {
        J.mostrar();
    }
}
