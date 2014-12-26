public class Dwarf extends Person {
	public Dwarf(int health, int strength, int shield) {
		super(health, strength, shield);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Obrim (health=" + getHealth() + ")");
		return sb.toString();
	}

}
