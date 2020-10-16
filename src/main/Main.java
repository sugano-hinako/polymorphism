package main;
import character.Character;
import character.Hero;
import character.Wizard;
import monster.Momonjya;
import monster.Momonjya_ver2;
import monster.Monster;

public class Main {

	public static void main(String[] args) {
		//戦闘キャラクターを生成
		Character[] c = new Character[3];
		c[0] = new Hero("スラリン", 300);
		c[1] = new Wizard("ミイホン", 200, 80);
		c[2] = new Wizard();

		//モンスターを生成
		Monster [] monsters = new Monster[2];
		monsters[0] = new Momonjya("ももんじゃ", 100);
		monsters[1] = new Momonjya_ver2();

		System.out.println(c[0].name + "たちは草むらを歩いている");
		System.out.println("草むらから敵が飛びだしてきた！！");
		System.out.println("▼" + monsters[0].name+ "と" + monsters[1].name+ "  " +"があらわれた！");
		c[0].attack(monsters[0]);
		((Wizard) c[1]).fireball(monsters[1]);
		/*if (c[1] instanceof Wizard) {
			Wizard w = (Wizard)c[1];
			c[1].fireball(monsters[1]);
		}*/
	}

}
