package character;
import monster.Monster;

public abstract class Character {
	public String name;
	public int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public abstract void attack(Monster m);

}
