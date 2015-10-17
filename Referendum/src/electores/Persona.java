package electores;

/**
 * Created by jPablo on 16/10/2015.
 */
public class Persona {

    protected String nom;
    protected String CI;
    protected String sexo;

    public Persona() {
        // TODO Auto-generated constructor stub
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String cI) {
        CI = cI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Persona(String nombre,String ci, String genero){
        nom=nombre;
        CI=ci;
        sexo=genero;
    }

    public void mostrar(){
        System.out.println("---Persona---");
        System.out.println(nom+" - "+CI+" - "+sexo);
    }

    public void leer(){
        System.out.println(" \n intro Nom y CI(*** xyz) y Sexo (M - F)...");
        nom=Leer.dato();
        CI=Leer.dato();
        sexo=Leer.dato();
    }
}
