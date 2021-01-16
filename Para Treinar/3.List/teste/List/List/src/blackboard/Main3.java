package blackboard;

import java.util.ArrayList;

public class Main3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("vai palmeiras");
		list.add("time gigante");
		list.add("alviverde imponente");
		list.add("time monstro");
		
		for (String sentenca : list) {
			System.out.println(sentenca);
		}
		list.remove(3);
		list.forEach(sentenca -> {
			System.out.println("percorrendo: ");
			System.out.println(sentenca);
		});
		
		
	}

}
