package character;
import monster.Monster;

public class Wizard extends Character{
	int mp;

	public Wizard(String name, int hp, int mp) {
		this.setName(name);
		this.setHp(hp);
		this.mp = mp;
	}
	public Wizard() {
		this.setName("名なしの魔術師");
		this.setHp(774);
		this.mp = 774;
	}

	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("▼" + m.getName() + "に5のダメージ");
		m.setHp(m.getHp() - 5);
	}

	public void fireball(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("▼" + m.getName() + "に20のダメージ");
		m.setHp(m.getHp() - 20);
		this.mp -= 8;
	}

}
