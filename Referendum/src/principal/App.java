package principal;

import electores.Elector;
import electores.ListaSimpleE;
import electores.Papeleta;
import jurados.ListaDobleN_J;
import referendum.Pais;
import referendum.Referendum;

/**
 * Created by jPablo on 16/10/2015.
 */
public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Papeleta p = new Papeleta();	Elector e = new Elector("JPablo", "001 scz", "M");		e.setPapeleta(p);		e.setEstado("si");		e.setSufragio(true);
        Papeleta p2 = new Papeleta();	Elector e2 = new Elector("Edgar", "003 lpz", "M");		e2.setPapeleta(p2);		e2.setEstado("no");
        Papeleta p3 = new Papeleta();	Elector e3 = new Elector("Marco", "002 cba", "M");		e3.setPapeleta(p3);		e3.setEstado("blanco");
        Papeleta p4 = new Papeleta();	Elector e4 = new Elector("Cristhian", "004 lpz", "M");	e4.setPapeleta(p4); 	e4.setEstado(null);		e4.setSufragio(true);
        Papeleta p5 = new Papeleta();	Elector e5 = new Elector("Miguel", "005 lpz", "M");		e5.setPapeleta(p5);
        Papeleta p6 = new Papeleta();	Elector e6 = new Elector("Ronald", "006 scz", "M");		e6.setPapeleta(p6);
        Papeleta p7 = new Papeleta();	Elector e7 = new Elector("Carmen", "007 lpz", "F"); 	e7.setPapeleta(p7);
        Papeleta p8 = new Papeleta();	Elector e8 = new Elector("Paola", "008 lpz", "F");		e8.setPapeleta(p8);

        Papeleta p9 = new Papeleta();	Elector E = new Elector("Maria", "500 cba", "F");		E.setPapeleta(p9);
        Papeleta p10 = new Papeleta();	Elector E2 = new Elector("Angel", "501 cba", "M");		E2.setPapeleta(p10);
        Papeleta p11 = new Papeleta();	Elector E3 = new Elector("Juan", "502 lpz", "M");		E3.setPapeleta(p11);	E3.setEstado("si");
        Papeleta p12 = new Papeleta();	Elector E4 = new Elector("Isaac", "503 cba", "M");		E4.setPapeleta(p12);
        Papeleta p13 = new Papeleta();	Elector E5 = new Elector("Felipa", "504 cba", "F");		E5.setPapeleta(p13);

        Papeleta p14 = new Papeleta();	Elector EA = new Elector("Eusebio", "900 scz", "M");	EA.setPapeleta(p14);
        Papeleta p15 = new Papeleta();	Elector EB = new Elector("Antonia", "901 scz", "F");	EB.setPapeleta(p15);
        Papeleta p16 = new Papeleta();	Elector EC = new Elector("Marcia", "902 scz", "F");		EC.setPapeleta(p16);	EC.setEstado("no");
        Papeleta p17 = new Papeleta();	Elector ED = new Elector("Anthony", "903 scz", "M"); 	ED.setPapeleta(p17);
        Papeleta p18 = new Papeleta();	Elector EE = new Elector("Ruben", "904 scz", "M");		EE.setPapeleta(p18);
        Papeleta p19 = new Papeleta();	Elector EF = new Elector("Rodrigo", "905 scz", "M");	EF.setPapeleta(p19);
        Papeleta p20 = new Papeleta();	Elector EG = new Elector("Andrea", "906 cba", "F");		EG.setPapeleta(p20);
        Papeleta p21 = new Papeleta();	Elector EH = new Elector("Rene", "907 scz", "M");		EH.setPapeleta(p21);	EH.setEstado("blanco");
        Papeleta p22 = new Papeleta();	Elector EI = new Elector("Will", "908 scz", "M");		EI.setPapeleta(p22);
        Papeleta p23 = new Papeleta();	Elector EJ = new Elector("Luis", "909 scz", "M");		EJ.setPapeleta(p23);
        Papeleta p24 = new Papeleta();	Elector EK = new Elector("Tania", "910 scz", "F");		EK.setPapeleta(p24);
        Papeleta p25 = new Papeleta();	Elector EL = new Elector("Olivia", "911 scz", "F");		EL.setPapeleta(p25);
        Papeleta p26 = new Papeleta();	Elector EM = new Elector("Erick", "912 lpz", "M");		EM.setPapeleta(p26);

        ListaSimpleE A = new ListaSimpleE();
        A.adiprimero(e8);
        A.adiprimero(e7);
        A.adiprimero(e6);
        A.adiprimero(e5);
        A.adiprimero(e4);
        A.adiprimero(e3);
        A.adiprimero(e2);
        A.adiprimero(e);


        ListaSimpleE A2 = new ListaSimpleE();
        A2.adiprimero(E);
        A2.adiprimero(E2);
        A2.adiprimero(E3);
        A2.adiprimero(E4);
        A2.adiprimero(E5);


        ListaSimpleE A3 = new ListaSimpleE();
        A3.adiprimero(EA);
        A3.adiprimero(EB);
        A3.adiprimero(EC);
        A3.adiprimero(ED);
        A3.adiprimero(EE);
        A3.adiprimero(EF);
        A3.adiprimero(EG);
        A3.adiprimero(EH);
        A3.adiprimero(EI);
        A3.adiprimero(EJ);
        A3.adiprimero(EK);
        A3.adiprimero(EL);
        A3.adiprimero(EM);

        Pais P = new Pais();

        Referendum R = new Referendum();
        R.setPais(P);
        R.setListaS_E(A);
        R.setListaS_E(A2);
        R.setListaS_E(A3);


        // 2.- Considerando el proceso del Referendum autonómico, a realizarse
        // próximamente en nuestro País.
        // Se requiere controlar la información de este proceso utilizando la
        // estructura de datos Listas.
        // Resolver los siguientes problemas:

        // A) Disponer de un registro de electores
        System.out.println("\n SOL A ...");
        R.mostrar();
        System.out.println("\n"+"\n"+"\n");

        // C) Registrar las preguntas del referéndum, por departamento
        System.out.println("\n"+"\n"+"\n");
        System.out.println("\n SOL C ...");
        sol_c(R);
        R.mostrar();

        // B) Generar Jurados electorales (50% mujeres y 50% varones)
        System.out.println("\n"+"\n"+"\n");
        System.out.println("\n SOL B ...");
        ListaDobleN_J J=new ListaDobleN_J();
        sol_b(R, J);
        J.mostrar();

        // D) Depositar el voto de los electores. (virtual)
        System.out.println("\n"+"\n"+"\n");
        System.out.println("\n INTRO CI...");
        String id=Leer.dato();
        sol_d(R, id, A3);
        R.mostrar();

        // E) Emisión de resultados como ser: número de votos por
        // pregunta(textual y en grafico estadístico), Si, No, nulos, blancos
        System.out.println("\n"+"\n"+"\n");
        sol_e(R);

        System.out.println("\n"+"\n"+"\n");
        sol_c(R);
        R.mostrar();

    }

    public static void sol_e(Referendum r) {
        // TODO Auto-generated method stub
        r.resultsReferendum();
    }

    public static void sol_d(Referendum r, String id, ListaSimpleE lx) {
        // TODO Auto-generated method stub
        r.emitirVoto(id, lx);
    }

    public static void sol_b(Referendum r, ListaDobleN_J j) {
        // TODO Auto-generated method stub
        r.generarJurados(j);
    }

    public static void sol_c(Referendum referendum) {
        // TODO Auto-generated method stub
        referendum.ordenarDepto();
        referendum.updatePob();
    }


}
