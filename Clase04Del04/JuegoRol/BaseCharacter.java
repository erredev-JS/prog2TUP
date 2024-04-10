package Clase04Del04.JuegoRol;

/**
 * @author Thomy
 * @version 1.0
 * @created 04-abr.-2024 11:42:50
 */
public abstract class BaseCharacter implements Character {

	private boolean alive;
	private int armor;
	private int level;
	private int magArmor;
	private String name;
	private int ps;
	private int dmg;

	public BaseCharacter(boolean alive, int armor, int level, int magArmor, String name, int ps, int dmg) {
		this.alive = alive;
		this.armor = armor;
		this.level = level;
		this.magArmor = magArmor;
		this.name = name;
		this.ps = ps;
		this.dmg = dmg;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMagArmor() {
		return magArmor;
	}

	public void setMagArmor(int magArmor) {
		this.magArmor = magArmor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public void checkAlive(){
	if (this.ps <= 0){
		this.alive = false;
		System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " died");
	}
	}
	public int attack(){
		if (!this.isAlive()){
			System.out.println(this.getName() + " no puede atacar porque está muerto");
			return 0;
		}else {
			System.out.println("The " + this.getClass().getSimpleName() + " attacks");
			return this.dmg;
		}
	}
	public void defend(int dmg){
		int trueDmg = this.armor - dmg;
		if (trueDmg < 0){
			this.ps += trueDmg;
		}
		if (this.ps > 0){
			System.out.println("El " + this.getClass().getSimpleName()+ " " + this.name + " le quedan " + this.ps + " puntos de vida");
		}
		this.checkAlive();
	}


}