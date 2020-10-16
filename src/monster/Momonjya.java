package monster;
import character.Character;

public class Momonjya extends Monster{
	public Momonjya(String name, int hp) {
		this.setName(name);
		this.hp = hp;
	}
	public Momonjya(){
		this.setName("野生のももんじゃ");
		this.hp = 88;
	}
	public void run() {
		System.out.println(this.getName() + "は走って逃げ出した");
	}

	public void attack(Character c) {
		System.out.println(this.getName() + "は体当たりをした！");
		System.out.println("▼" + c.getName() + "に8ダメージあたえた！");
		c.hp -= 8;
	}
}
