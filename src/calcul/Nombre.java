package calcul;

public class Nombre {

	public int plusGrandNombre(int[] t) {
		int MAX = Integer.MIN_VALUE;
		if (t == null)
			throw new ListNonValidException("La liste ne peut pas être nulle");
		for (Integer i : t) {
			if (i > MAX)
				MAX = i;
		}
		return MAX;
	}

	public int plusGrandNombre2(int[] t) {
		int i, MAX = Integer.MIN_VALUE;
		for (i = 0; i < t.length; i++) {
			if (t[i] > MAX)
				MAX = t[i];
		}
		return MAX;
	}

}
