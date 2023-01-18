package thewitcher;

public class witcher {
	private String name;
	private int health;
	private boolean hasSoul;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public boolean isHasSoul() {
		return hasSoul;
	}


	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	public boolean isDeath() {
		if(health==0){
			return true;
		}
		else if(!hasSoul) {
			return false;
		}
		else {
			return false;
		}
		
	}
	
	public void recibirDamage(int damage) {
		health-= damage;
		if (health<0) health = 0;
	}

}
