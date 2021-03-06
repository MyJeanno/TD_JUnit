/**
 * Test de checkstyle .
 * @author Microlink
 *
 */
public class ExoEcritureCode {

    protected ExoEcritureCode() throws Exception {
           throw new Exception("Ce constructeur ne doit pas etre instanciť");
    }

    /**
     * Calcule la moyenne.
     * @param valeurs
     * @return la somme
     */
     public static double moyenne(final double[] valeurs) {
     double somme = 0;
        for (int i = 0; i < valeurs.length; i = i + 1) {
            somme += valeurs[i];
        }
        return somme / valeurs.length;
     }
}
