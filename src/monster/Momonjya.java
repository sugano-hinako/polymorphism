package monster;
import character.Character;

public class Momonjya extends Monster{
	public Momonjya(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public Momonjya(){
		this.name = "野生のももんじゃ";
		this.hp = 88;
	}
	public void run() {
		System.out.println(this.name + "は走って逃げ出した");
	}

	public void attack(Character c) {
		System.out.println(this.name + "は体当たりをした！");
		System.out.println("▼" + c.name + "に8ダメージあたえた！");
		c.hp -= 8;
	}
	@Override //ここを消すとエラーになってしまう引数なしを用意してもだめ
	public void attack(java.lang.Character c) {
	}
}
