package electores;

/**
 * Created by jPablo on 16/10/2015.
 */
public class Papeleta {

    private String question; 	//pregunta del referendum
    private String state;		//state: si, no, nulo, blanco

    public Papeleta() {
        // TODO Auto-generated constructor stub
        question="¿ Esta usted acuerdo con la reforma del articulo 168 de la Constitucion Politica del Estado " +
                "para permitir que la que la Presidenta o Presidente y la Vicepresidenta o el Vicepresidente del Estado " +
                "puedan ser reelectas o reelectos por dos veces de manera continua, lo que habilitaria la canditatura de los " +
                "actuales mandatarios por el periodo de 2020-2025 ?";
        state=null;
    }

    public void setState(String e){
        state=e;
    }

    public String  getQuestion(){
        return question;
    }

    public String getState(){
        return state;
    }

    public void mostrar(){
        System.out.println("+++Papeleta+++");
        System.out.println(question);
        System.out.println("voto:	"+state);
    }


}
