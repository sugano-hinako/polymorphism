package character;
import monster.Monster;

public class Hero extends Character{
	public Hero(String name, int hp) {
		this.setName(name);
		this.setHp(hp);
	}
	public Hero() {
		this.setName("名なしのスライム");
		this.setHp(774);
	}

	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("▼" + m.getName() + "に10のダメージをあたえた！");
		m.setHp(m.getHp() - 10);
	}

}
