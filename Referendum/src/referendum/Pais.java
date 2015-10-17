package referendum;

/**
 * Created by jPablo on 16/10/2015.
 */
public class Pais {

    private int deptos;
    private String nom;
    private String pob[][]=new String [3][11];

    public Pais() {
        // TODO Auto-generated constructor stub
        // BOLIVIA=BO / BENI=BNI/CHUQUISACA=CHQ/COCHA=CBA/LA PAZ=LPZ/ORURO=ORU/PANDO=PND/POTOSI=PSI/SANTA CRUZ=SCZ/TARIJA=TJA
        deptos=3;
        nom="BOLIVIA";
        pob[1][1]="lpz";pob[2][1]="8";
        pob[1][2]="cba";pob[2][2]="5";
        pob[1][3]="scz";pob[2][3]="13";
    }

    public void mostrar() {
        System.out.println("PAIS: "+nom);
        for (int i = 1; i <= deptos; i++) {
            System.out.println(pob[1][i]+" :: "+pob[2][i]);
        }
    }

    // metodos

    public int nroDeptos(){
        return deptos;
    }

    public String getNomPais(){
        return nom;
    }

    public String getDepto(int y){
        return pob[1][y];
    }

    public void setPobDepto(String q, int pos){
        pob[2][pos]=q;
    }



}
