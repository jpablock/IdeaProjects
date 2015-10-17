package electores;

/**
 * Created by jPablo on 16/10/2015.
 */
public class ListaSimpleE {

    private NodoE p;

    public ListaSimpleE() {
        // TODO Auto-generated constructor stub
        p = null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null)
            return true;
        return false;
    }

    public int nroNodos() {
        int q = 0;
        NodoE r = getP();
        while (r != null) {
            q++;
            r = r.getSig();
        }
        return q;
    }

    public void adiprimero(Elector ex) {
        NodoE w = new NodoE();
        w.setE(ex);
        w.setSig(getP());
        setP(w);
    }

    public void adiprimero(NodoE n) {
        n.setSig(getP());
        setP(n);
    }

    public void adiultimo(Elector ex) {
        NodoE w = new NodoE();
        NodoE r;
        w.setE(ex);
        if (esvacia())
            setP(w);
        else {
            r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(w);
        }
    }

    public void adiultimo(NodoE n) {
        NodoE r;
        if (esvacia())
            setP(n);
        else {
            r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(n);
        }
    }

    public void leer1(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            Elector e = new Elector();
            e.leer();
            adiprimero(e);
        }
    }

    public void leer2(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            Elector e = new Elector();
            e.leer();
            adiultimo(e);
        }
    }

    public void mostrar() {
        NodoE r;
        r = getP();
        for (int i = 1; i <= nroNodos(); i++) {
            System.out.println();
            r.getE().mostrar();
            r=r.getSig();
        }
    }

    public NodoE eliprimero() {
        NodoE x;
        x = getP();
        setP(getP().getSig());
        x.setSig(null);
        return x;
    }

    public NodoE eliUltimo() {
        NodoE x, r;
        x = r = getP();
        if (r.getSig() == null)
            setP(null);
        else
            while (r.getSig() != null) {
                x = r;
                r = r.getSig();
            }
        x.setSig(null);
        x = r;
        return (x);
    }

    public void llevafinal() {
        NodoE x, r;
        r = getP().getSig();
        x = getP();
        setP(r);
        while (r.getSig() != null)
            r = r.getSig();
        r.setSig(x);
        x.setSig(null);
    }

    // metodos

    public Papeleta getPapeleta(){
        return p.getE().getPapeleta();
    }

    public NodoE copia(int y) {
        NodoE x, r;
        x = r = getP();
        if (y <= nroNodos()) {
            for (int i = 1; i <= y - 1; i++) {
                r = r.getSig();
            }
            x = r;
        }
        return x;
    }

    public NodoE eli_i_esimo(int i) {
        NodoE x, r;
        x = r = getP();

        if (i == 1) {
            return eliprimero();
        } else {
            if (i <= nroNodos()) {
                for (int j = 1; j <= i - 1; j++) {
                    x = r;
                    r = r.getSig();
                }
                x.setSig(r.getSig());
                r.setSig(null);

            } else
                System.out.println("\n FUERA DE RANGO...");
        }
        return r;

    }

}
