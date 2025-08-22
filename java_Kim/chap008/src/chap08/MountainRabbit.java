package chap08;

class MountainRabbit extends Rabbit {
	String mountain;
	void eatWildglass() {
		System.out.println("산토끼가 풀을 먹습니다.");
	}
	
	public void sleep() {
		System.out.println("산토끼가 굴에서 잠자고 있습니다.");
	}
}
