package Clase04Del04.JuegoRol;

public class Rogue extends BaseCharacter {
	private int potions;

	public Rogue(boolean alive, int armor, int level, int magArmor, String name, int ps, int dmg, int potions) {
		super(alive, armor, level, magArmor, name, ps, dmg);
		this.potions = potions;
	}

	public int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}

	public void drinkPotion(){
		if (this.potions <= 0){
			System.out.println("El picaro " + this.getName() + " se ha quedado sin posiones");
		}else {
			this.setPs(this.getPs() + 50);
			System.out.println("El picaro " + this.getName() + " consumió una pocion y su vida aumentó en 50");
		}
	}
}