package chap08;

public class Rabbit {
	String shape;
	int xPos;
	int yPos;
	
	Rabbit() {
		System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호출됩니다.");
	}

	void move(int x, int y) {
		this.xPos=x;
		this.yPos=y;
	}
}
