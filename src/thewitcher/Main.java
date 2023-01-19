package thewitcher;

public class Main {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		witcher brujo = new witcher();
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		if(brujo.isDeath()) {
			System.out.println(brujo.getName()+ " está muerto");
		}
		else {
			System.out.println(brujo.getName()+" está vivo");
		}
		System.out.println("continua luchando");
	}
	
}
