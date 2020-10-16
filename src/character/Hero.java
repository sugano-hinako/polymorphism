package character;
import monster.Monster;

public class Hero extends Character{
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public Hero() {
		this.name = "名なしのスライム";
		this.hp = 774;
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("▼" + m.name + "に10のダメージをあたえた！");
		m.hp -= 10;
	}

}
