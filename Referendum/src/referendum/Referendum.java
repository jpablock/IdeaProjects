package referendum;

import electores.Elector;
import electores.ListaSimpleE;
import electores.NodoE;
import electores.Papeleta;
import jurados.Jurado;
import jurados.ListaDobleN_J;

import java.util.Random;

/**
 * Created by jPablo on 16/10/2015.
 */
public class Referendum {

    private Pais p;
    private int n;
    private ListaSimpleE v[] = new ListaSimpleE[33];

    public Referendum() {
        // TODO Auto-generated constructor stub
        n = 0;
        for (int i = 1; i <= 30; i++) {
            v[i] = new ListaSimpleE();
        }
    }

    public int getNroDeptos() {
        return n;
    }

    public void setPais(Pais world) {
        p = world;
    }

    public void setListaS_E(ListaSimpleE lxE) {
        n = n + 1;
        v[n] = lxE;
    }

    public void mostrar() {
        p.mostrar();
        for (int i = 1; i <= n; i++) {
            System.out.println("\n -.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
            v[i].mostrar();
        }
    }

    // sol c

    public int qNodoPos(int pos) {
        return v[pos].nroNodos();
    }

    public void ordenarDepto() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            int qN = v[i].nroNodos();
            for (int j = 1; j <= qN; j++) {
                NodoE del = v[i].eliprimero();
                String dep = del.getE().getCI();
                dep = dep.substring(dep.length() - 3);
                addNodoE_Depto(dep, del);
            }
        }
    }

    public void addNodoE_Depto(String dep, NodoE nue) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= p.nroDeptos(); i++) {
            if (p.getDepto(i).equals(dep))
                v[i].adiultimo(nue);
        }
    }

    public void updatePob() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            int qPob = v[i].nroNodos();
            p.setPobDepto(String.valueOf(qPob), i);
        }
    }

    public int nroNodosPos(int k) {
        return v[k].nroNodos();
    }

    public NodoE getP(int i) {
        // TODO Auto-generated method stub
        return v[i].getP();
    }

    public ListaSimpleE getListaS_E(int pos) {
        return v[pos];
    }

    public void generarJurados(ListaDobleN_J J) {
        // TODO Auto-generated method stub
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
            int qJ = ((3 * v[i].nroNodos()) / 100);
            if (qJ == 0) {
                boolean sw = false;
                while (!sw) {
                    int n1 = random.nextInt(v[i].nroNodos()) + 1;
                    int n2 = random.nextInt(v[i].nroNodos()) + 1;
                    Jurado j = new Jurado();
                    Jurado j2 = new Jurado();
                    j.setElector(v[i].copia(n1).getE());
                    j2.setElector(v[i].copia(n2).getE());
                    if (!j.getElector().getSexo()
                            .equals(j2.getElector().getSexo())) {
                        j.setNroMesa(i);
                        j2.setNroMesa(i);
                        J.adifinal(j);
                        J.adifinal(j2);
                    }
                    if (!j.getElector().getSexo()
                            .equals(j2.getElector().getSexo()))
                        sw = true;
                }
            } else {
                System.out.println("\n error...");
            }
        }
    }

    public void emitirVoto(String id, ListaSimpleE lx) {
        // TODO Auto-generated method stub
        int state=verificaEstadoSufragio(id);
        switch (state) {

            case 1:
                System.out.println("\n "+getNomE(id));
                System.out.println("\n >_ YA SUFRAGO");
                break;

            case 2:
                System.out.println("\n "+getNomE(id));
                System.out.println("\n >_ NO SUFRAGO");
                System.out.println("\n"+getPapeleta().getQuestion());
                System.out.println(" \n INTRO RESPUESTA (si - no - nulo - blanco)");
                String res=Leer.dato();
                setEstadoSufragio(id, res);
                System.out.println("\n "+getNomE(id));
                System.out.println("\n >_ YA SUFRAGO");
                break;

            case 3:
                System.out.println("\n >_ NO ESTA EN LISTAS...");
                Elector nue=new Elector();
                nue.leer();
                String dep=nue.getCI();
                int qp=dep.length();
                dep=dep.substring(qp-3);
                int y=1;
                boolean sw=false;
                while( y<=p.nroDeptos() ){
                    if( dep.equals(p.getDepto(y))){
                        sw=true;
                        y=p.nroDeptos()+1;
                    }
                    y++;
                }
                if( sw ){
                    System.out.println("\n "+v[1].getPapeleta().getQuestion());
                    System.out.println(" \n INTRO RESPUESTA (si - no - nulo - blanco)");
                    String r=Leer.dato();
                    nue.setEstado(r);
                    nue.setSufragio(true);
                    lx.adiultimo(nue);
                }else{
                    System.out.println("\n VERIFIQUE AL DEPTO QUE PERTENECE...");
                }

                break;

            default:
                break;
        }
    }

    public void setEstadoSufragio(String id, String res) {
        // TODO Auto-generated method stub
        int x, y;
        x=y=1;
        while ( x<=n ) {
            NodoE r=v[x].getP();
            int qN = v[x].nroNodos();
            while( y<=qN ){
                if( r.getE().getCI().equals(id) ){
                    r.getE().getPapeleta().setState(res);
                    r.getE().setSufragio(true);
                    x=n+1;
                    y=qN+1;
                }
                r=r.getSig();
            }
        }
    }

    public Papeleta getPapeleta(){
        return v[1].getPapeleta();
    }

    public String getNomE(String id){
        for (int i = 1; i <= n; i++) {
            int qN=v[i].nroNodos();
            NodoE r=v[i].getP();
            for (int j = 1; j <= qN; j++) {
                if( id.equals(r.getE().getCI()))
                    return r.getE().getNom();
                r=r.getSig();
            }
        }
        return "";
    }

    public int verificaEstadoSufragio(String id) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= n; i++) {
            NodoE r=v[i].getP();
            int qN=v[i].nroNodos();
            for (int j = 1; j <= qN; j++) {
                if( id.equals(r.getE().getCI() ) && r.getE().getEstadoSufragio())
                    return 1;
                if( id.equals(r.getE().getCI() ) && r.getE().getEstadoSufragio()==false)
                    return 2;
                r=r.getSig();
            }
        }
        return 3;
    }

    public void resultsReferendum() {
        // TODO Auto-generated method stub
        double si, no, nulo, blanco, Si, No, Nulo, Blanco, t, eoc, EoC;
        Si=No=Nulo=Blanco=t=eoc=EoC=0;
        for (int i = 1; i <= n; i++) {
            NodoE r=v[i].getP();
            int qN=v[i].nroNodos();

            si=no=nulo=blanco=eoc=0;

            for (int j = 1; j <= qN; j++) {
                if( "si".equals(r.getE().getPapeleta().getState()) )
                    si++;
                if( "no".equals(r.getE().getPapeleta().getState()) )
                    no++;
                if( "nulo".equals(r.getE().getPapeleta().getState()) )
                    nulo++;
                if( "blanco".equals(r.getE().getPapeleta().getState()) )
                    blanco++;
                if( null==r.getE().getPapeleta().getState() )
                    eoc=eoc+1;
                r=r.getSig();
            }
            System.out.println("\n "+p.getDepto(i)+"\n" );
            System.out.println(" si: "+((si*100)/qN) );
            System.out.println(" no: "+((no*100)/qN) );
            System.out.println(" nulo: "+((nulo*100)/qN) );
            System.out.println(" blanco: "+((blanco*100)/qN) );
            System.out.println(" NO VOTARON: "+((eoc*100)/qN));
            Si=Si+si;
            No=No+no;
            Blanco=Blanco+blanco;
            Nulo=Nulo+nulo;
            EoC=EoC+eoc;
            t=t+qN;
        }
        System.out.println("\n "+p.getNomPais());
        System.out.println("\n SI: "+((Si*100)/t));
        System.out.println("\n NO: "+((No*100)/t));
        System.out.println("\n NULO: "+((Nulo*100)/t));
        System.out.println("\n BLANCO: "+((Blanco*100)/t));
        System.out.println("\n NO VOTARON : "+((EoC*100)/t)+" >_<");
    }


}
