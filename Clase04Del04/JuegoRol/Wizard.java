package Clase04Del04.JuegoRol;

public class Wizard extends BaseCharacter {
	private int mana;
	private int magDmg;

	public Wizard(boolean alive, int armor, int level, int magArmor, String name, int ps, int dmg, int mana, int magDmg) {
		super(alive, armor, level, magArmor, name, ps, dmg);
		this.mana = mana;
		this.magDmg = magDmg;
	}

	public int magicAttack(){
		if (!this.isAlive()){
			System.out.println(this.getName() + " no puede atacar porque está muerto");
			return 0;
		}else {
			if (this.mana >= 10) {
				System.out.println("El mago " + this.getName() + " ha atacado con un hechizo");
				mana -= 10;
				return magDmg;
			} else {
				System.out.println("El mago " + this.getName() + " no tiene suficiente maná y va a realizar un ataque normal");
				return this.attack();
			}
		}
	}

}