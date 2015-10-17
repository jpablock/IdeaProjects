package jurados;

/**
 * Created by jPablo on 16/10/2015.
 */
public class ListaDobleN_J {

    private NodoJ p;

    public ListaDobleN_J() {
        // TODO Auto-generated constructor stub
        p = null;
    }

    public NodoJ getP() {
        return p;
    }

    public void setP(NodoJ p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null)
            return true;
        return false;
    }

    public int NroNodos() {
        int c = 0;
        NodoJ r = getP();
        while (r != null) {
            c = c + 1;
            r = r.getSig();
        }
        return c;
    }

    public void adiprincipio(Jurado j) {
        NodoJ w = new NodoJ();
        w.setJ(j);
        if (esvacia())
            setP(w);
        else {
            w.setSig(p);
            p.setAnt(w);
            p = w;
        }
    }

    public void adifinal(Jurado j) {
        NodoJ w = new NodoJ();
        NodoJ r;
        w.setJ(j);
        if (esvacia())
            setP(w);
        else {
            r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(w);
            w.setAnt(r);
        }
    }

    public void leer1(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            Jurado j = new Jurado();
            adiprincipio(j);
        }
    }

    public void leer2(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            Jurado j = new Jurado();
            adifinal(j);
        }
    }

    public void mostrar() {
        NodoJ r;
        r = getP();
        System.out.println("\n Lista Doble");
        while (r != null) {
            r.mostrar();
            r = r.getSig();
        }
    }

    public NodoJ eliprimero() {
        NodoJ x;
        x = p;
        p = p.getSig();
        if (p != null)
            p.setAnt(null);
        x.setSig(null);
        x.setAnt(null);
        return x;
    }

    public NodoJ eliultimo() {
        NodoJ x;
        NodoJ r;
        r = getP();
        while (r.getSig() != null)
            r = r.getSig();
        r.getAnt().setSig(null);
        r.setAnt(null);
        x = r;
        return (x);
    }

    public void adinodo(NodoJ x) {
        if (p == null) {
            p = x;
            x.setAnt(null);
            x.setSig(null);
        } else {
            NodoJ r;
            r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(x);
            x.setAnt(r);
            x.setSig(null);
        }

    }

    //métodos sol's



}
