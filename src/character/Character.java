package character;
import monster.Monster;

public abstract class Character {
	private String name;
	public int hp;

	public void run() {
		System.out.println(this.getName() + "は逃げ出した");
	}
	public abstract void attack(Monster m);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
