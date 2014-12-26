public class Orc extends Person {
	public Orc(int health, int strength, int shield) {
		super(health, strength, shield);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Orc (health=" + getHealth() + ")");
		return sb.toString();
	}

}
