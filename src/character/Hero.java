package character;
import monster.Monster;

public class Hero extends Character{
	public Hero(String name, int hp) {
		this.setName(name);
		this.hp = hp;
	}
	public Hero() {
		this.setName("名なしのスライム");
		this.hp = 774;
	}

	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("▼" + m.getName() + "に10のダメージをあたえた！");
		m.hp -= 10;
	}

}
