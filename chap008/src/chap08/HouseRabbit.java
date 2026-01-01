package chap08;

class HouseRabbit extends Rabbit {
	String owner;
	HouseRabbit() {
		System.out.println("2. 서브 클래스(집토끼)의 생성자가 호출됩니다.");
	}
	void eatFeed() {
		System.out.println("집 토끼가 사료를 먹습니다.");
	}
	
	void move(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		
		if (this.xPos > 100)
			this.xPos = 100;
		if (this.yPos > 100)
			this.yPos = 100;
	}
	
	public void sleep() {
		System.out.println("집토끼가 우리에서 잠자고 있습니다.");
	}
}
