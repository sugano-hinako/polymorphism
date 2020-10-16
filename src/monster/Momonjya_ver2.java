package monster;
import character.Character;

public class Momonjya_ver2 extends Momonjya{
	public Momonjya_ver2(String name, int hp) {
		this.setName(name);
		this.hp = hp;
	}
	public Momonjya_ver2() {
		this.setName("野生のももんじゃ(しっぽ３本)");
		this.hp = 333;
	}
	public void rollOver(Character c) {
		System.out.println(this.getName() + "は勢いよく転がった！");
		System.out.println("▼" + c.getName() + "に勢いよくぶつかった！15ダメージをあたえた！");
		c.hp -= 15;
	}
	public void run() {
		System.out.println(this.getName() + "はダッシュで逃げ出した！！");
	}

}
