public class Person implements GameObject {
	private int health;
	private int strength;
	private int shield;

	public Person(int health, int strength, int shield) {
		this.health = health;
		this.strength = strength;
		this.shield = shield;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	public boolean isAlive() {
		if (getHealth() <= 0)
			return false;
		return true;
	}

	@Override
	public void attack(GameObject other) {
		other.handleAttack(getStrength());
	}

	@Override
	public void handleAttack(int attackStrength) {
		setHealth(getHealth() - (attackStrength - getShield()));

	}
}
