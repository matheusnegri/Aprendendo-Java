
public class ManipulandoString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		//minuscula
		String s01 = original.toLowerCase();
		
		//Maiuscula
		String s02 = original.toUpperCase();
		
		//Elimina espaços no inicio e fim da string
		String s03 = original.trim();
		
		//Montar uma nova string a partir do caracter 2 em diante
		String s04 = original.substring(2);
		
		//Montar uma nova string a partir do caracter 2 até o caracter 9
		//O caracter final (9) não entra na nova string
		String s05 = original.substring(2, 9);
		
		//Substituindo o a minusculo por x minusculo
		String s06 = original.replace("a", "x");
		
		//Substituindo a string abc minusculo por XY maiusculo
		//Case sensitive
		String s07 = original.replace("abc", "XY");
		
		//Encontrar a posição da primeira substring bc
		//Retorna a posição do primeiro caracter, nesse exemplo, do caracter B
		int i = original.indexOf("bc");
		
		//Encontrar a posição da última substring bc
		//Retorna a posição do primeiro caracter, nesse exemplo, do caracter B
		int j = original.lastIndexOf("bc");
		
		//Split quebra as strings separadas pelo caracter informado
		String[] s08 = original.split(" ");
		
		int quantidade = s08.length;
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring (2): -" + s04 + "-");
		System.out.println("Substring (2, 9): -" + s05 + "-");
		System.out.println("Replace ('a', 'x'): -" + s06 + "-");
		System.out.println("Replace ('abc', 'XY'): -" + s07 + "-");
		System.out.println("indexOf ('bc'): -" + i + "-");
		System.out.println("lastIndexOf ('bc'): -" + j + "-");
		
		for (int a = 0; a < quantidade; a++) {
			System.out.printf("Split[%d]: %s %n",a, s08[a]);
		}
	}

}
