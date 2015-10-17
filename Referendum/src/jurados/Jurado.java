package jurados;

import electores.Elector;

/**
 * Created by jPablo on 16/10/2015.
 */
public class Jurado {

    private int nroMesa;
    private Elector E;

    public Jurado() {
        // TODO Auto-generated constructor stub
    }

    public void setNroMesa(int mesa){
        nroMesa=mesa;
    }

    public void setElector( Elector ex){
        E=ex;
    }

    public void mostrar(){
        System.out.println("\n ...Jurado...");
        System.out.println("nroMesa: "+nroMesa);
        E.mostrar();
    }

    //metodos

    public Elector getElector(){
        return E;
    }
}
