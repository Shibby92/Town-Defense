public class Goblin extends Orc {
	public Goblin(int health, int strength, int shield) {
		super(health, strength, shield);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Goblin (health=" + getHealth() + ")");
		return sb.toString();
	}

}
