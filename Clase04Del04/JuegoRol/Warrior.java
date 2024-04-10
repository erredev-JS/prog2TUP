package Clase04Del04.JuegoRol;

/**
 * @author Thomy
 * @version 1.0
 * @created 04-abr.-2024 11:42:51
 */
public class Warrior extends BaseCharacter {

	private int rage;


	public Warrior(boolean alive, int armor, int level, int magArmor, String name, int ps, int dmg, int rage) {
		super(alive, armor, level, magArmor, name, ps, dmg);
		this.rage = rage;
	}
@Override
	public int attack(){
		if (!this.isAlive()){
			System.out.println(this.getName() + " no puede atacar porque está muerto");
			return 0;
		}else {
			if (this.rage >= 50){
				riseAttack();
			}
			System.out.println("El Guerrero " + this.getName() + " ha atacado");
			this.rage += 10;
			return this.getDmg();
		}
	}


	public void riseAttack(){
		System.out.println("El guerrero "+ this.getName() +" se ha enfurecido y aumentó su ataque");
		this.setDmg(this.getDmg()*2);
		this.rage = 0;
	}

}