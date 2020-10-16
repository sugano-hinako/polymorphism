package character;
import monster.Monster;

public class Wizard extends Character{
	int mp;

	public Wizard(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Wizard() {
		this.name = "名なしの魔術師";
		this.hp = 774;
		this.mp = 774;
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("▼" + m.name + "に5のダメージ");
		m.hp -= 5;
	}

	public void fireball(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("▼" + m.name + "に20のダメージ");
		m.hp -= 20;
		this.mp -= 8;
	}

}
