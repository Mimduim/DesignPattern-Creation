package TesteS;

import FilesS.Configura��o;

public class TestaSingleton {

	public static void main(String[] args) {
		Configura��o configuracao = Configura��o.getInstance();
		System.out.println(configuracao.getPropriedade("time - zone "));
		System.out.println(configuracao.getPropriedade(" currency - code "));
	}
}
