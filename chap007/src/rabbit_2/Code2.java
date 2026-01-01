package rabbit_2;

public class Code2 {

	public static void main(String[] args) {
		Rabbit2 rabbit = new Rabbit2();
		rabbit.setShape("흰토끼");
		rabbit.setPosition(100, 100);
		
		System.out.printf("토끼의 모양은 %s입니다.\n", rabbit.getShape());
		System.out.printf("토끼의 위치는 (%d,%d)입니다.\n", rabbit.getX(), rabbit.getY());
	}

}
