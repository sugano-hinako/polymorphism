package monster;

public abstract class Monster {
	public String name;
	public int hp;

	public abstract void run() ;
	public abstract void attack(Character c) ;

}
