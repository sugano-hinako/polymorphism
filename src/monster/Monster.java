package monster;
import character.Character;

public abstract class Monster {
	private String name;
	private int hp;

	public abstract void run() ;
	public abstract void attack(Character c) ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
