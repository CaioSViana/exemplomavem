
public class APP {
	public static void main(String[] args) {
		String[] resultado = ResultadoMegasena.obtemUltimoResultado();
		for (String string : resultado) {
			System.out.println(string + " ");
		}
	}

}
