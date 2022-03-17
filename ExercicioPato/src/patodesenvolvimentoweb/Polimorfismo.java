package patodesenvolvimentoweb;

public class Polimorfismo {
public static void main(String[] args) {
	Pato p = new Pato ();
	PatoDeBorracha pb = new PatoDeBorracha ();
	PatoDeMadeira pm = new PatoDeMadeira ();
	PatoNormal pn = new PatoNormal ();
	PatoVoador pv = new PatoVoador();
	
	
	nomePato(pb);
	nomePato(pm); // as tres chamadas e pelo mesmo metodo
	nomePato(pn);
	nomePato(pv);
	
}
 static void nomePato(Pato pt) { //metodo capaz de receber qualquer pato
	 System.out.println(pt.nome());
 }
}
