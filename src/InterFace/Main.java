package InterFace;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals[] djur = {new Cheetah(), new Leopard(), new Lion()};
		for(Animals djuren : djur) {
			
			System.out.println("");
			
			djuren.eat();
			djuren.jump();
			djuren.run();
		}
	}

}
