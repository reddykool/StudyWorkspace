
public class PStringOps {
	
	public void Start() {
		System.out.println("###  PStringOps ###");		
		String [] words = {"funk", "chunk", "furry", "baconator", "   great"};
		
		//startsWith
		for(String w:words) {
			if(w.startsWith("fu")) {
				System.out.println(w + " starts with \"fu\"");
			}
		}

		//endsWith
		for(String w:words) {
			if(w.endsWith("nk")) {
				System.out.println(w + " starts with \"nk\"");
			}
		}
		
		System.out.println("index of 'n' in funky:" + words[0].indexOf('n'));
		System.out.println("index of 'at' in baconator:" + words[3].indexOf("at"));
		System.out.println(words[0] + " " + words[2]);
		System.out.println(words[1] + " to -> "+ words[1].replace('c', 'p'));
		System.out.println(words[4] + " timmed to -> "+ words[4].trim());
	}
}

/*	
	public static void main(String args[]) {
		System.out.println("****   START of program  *****");
		PStringOps obj = new PStringOps();
		obj.Start();
		System.out.println("****   END of program  *****");		
	}
*/