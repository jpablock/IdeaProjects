package electores;

/**
 * Created by jPablo on 16/10/2015.
 */
public class Elector extends  Persona {

    private boolean sufragio; 	// true or false si el Elector sugrago
    private Papeleta p;			//

    public Elector() {
        // TODO Auto-generated constructor stub
    }

    public void leer() {
        super.leer();
        p=new Papeleta();
    }

    public Elector( String nombre, String ci, String sexo){
        super(nombre, ci, sexo);
        sufragio=false;
    }

    public void setPapeleta(Papeleta px){
        p=px;
    }

    public void setEstado(String d){
        p.setState(d);
    }

    public boolean getEstadoSufragio () {
        return sufragio;
    }

    public void setSufragio(boolean estado){
        sufragio=estado;
    }

    public void mostrar() {
        System.out.println(" +++ Elector +++");
        super.mostrar();
        System.out.println("sufragio: "+sufragio);
        p.mostrar();
    }

    //

    public Papeleta getPapeleta(){
        return p;
    }

}
