package FilesS;

import java.util.*;

public class Configura��o {

	private Map<String, String> propriedades;
	private static Configura��o instance;

	private Configura��o () {
	 this . propriedades = new HashMap < String , String >() ;
	 this . propriedades . put ("time - zone ", " America / Sao_Paulo ") ;
	 this . propriedades . put (" currency - code ", " BRL ") ;
	 }

	public static Configura��o getInstance() {
		if (Configura��o.instance == null) {
			Configura��o.instance = new Configura��o();
		}
		return Configura��o.instance;
	}

	public String getPropriedade(String nomeDaPropriedade) {
		return this.propriedades.get(nomeDaPropriedade);
	}
}
