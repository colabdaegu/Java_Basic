package chap08;

public class Code08_02 {

	public static void main(String[] args) {
		HouseRabbit hRabbit = new HouseRabbit();
		MountainRabbit mRabbit = new MountainRabbit();
		
		hRabbit.shape = "삼각형";
		hRabbit.owner = "난생이";
		//hRabbit.move(100, 100);
		hRabbit.eatFeed();
		
		mRabbit.shape = "네모";
		mRabbit.mountain = "설악산";
		//mRabbit.move(200, 200);
		mRabbit.eatWildglass();
		
		hRabbit.move(500, 500);
		mRabbit.move(500, 500);
		
		System.out.printf("집토끼 위치 : (%d, %d) \n", hRabbit.xPos, hRabbit.yPos );
		System.out.printf("산토끼 위치 : (%d, %d) \n", mRabbit.xPos, mRabbit.yPos );
		
		hRabbit.sleep();
		mRabbit.sleep();
	}

}
