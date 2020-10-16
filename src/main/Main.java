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
		//Wizardクラスの変数wにc[1]を代入
		Wizard w = (Wizard)c[1];

		//モンスターを生成
		Monster [] m = new Monster[2];
		m[0] = new Momonjya("ももんじゃ", 100);
		m[1] = new Momonjya_ver2();
		//Momonjya_ver2クラスの変数m2にm[1]を代入
		Momonjya_ver2 m2 = (Momonjya_ver2)m[1];

		//冒険スタート
		System.out.println(c[0].name + "たちは草むらを歩いている");
		System.out.println("草むらから敵が飛びだしてきた！！");
		System.out.println("▼" + m[0].name+ "と" + m[1].name+ "  " +"があらわれた！");
		c[0].attack(m[0]);
		w.fireball(m[1]);
		System.out.println("▼敵のターン");
		m2.rollOver(c[0]);

	}

}
