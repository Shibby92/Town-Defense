public class TunnelFight {

	private static final int NUMBER = 11;

	public static void main(String[] args) {
		Orc[] orcs = new Orc[NUMBER];
		Dwarf obrim = new Dwarf(30, 9, 2);
		for (int i = 0; i < orcs.length; i++) {
			if (i == orcs.length - 1) {
				orcs[i] = new Goblin(3, 3, obrim.getStrength() * -1);
			} else
				orcs[i] = new Orc(10, 5, 0);
		}

		for (int i = 0; i < orcs.length; i++) {
			System.out.println("Duel " + (i + 1)
					+ ". Obrim, sin Agammov (health=" + obrim.getHealth()
					+ ") u borbi protiv Orc (health=" + orcs[i].getHealth()
					+ ")");
			Duel duel = new Duel(obrim, orcs[i]);
			duel.fight();
			if (!obrim.isAlive()) {
				System.out.println("Obrim je mrtav nakon " + i
						+ " borbi. Odajte mu pocast...");
				break;
			}

		}
		if (obrim.isAlive())
			System.out.println("Obrim je uspjesno odbranio selo! HURAA!!!");
	}

}
