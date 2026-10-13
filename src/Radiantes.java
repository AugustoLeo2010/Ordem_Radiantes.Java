public abstract class Radiantes implements Juravel {

    private String ordem;
    private String ideal;
    private String espreno;
    private String poderes;

    private static final String PRIMEIRO_IDEAL =
            "Vida antes da Morte, Forca antes da Fraqueza, Jornada antes do Destino";

    public Radiantes(String ordem, String ideal, String espreno, String poderes) {
        if (ordem == null || ordem.isBlank()) {
            throw new IllegalArgumentException("Todo Radiante precisa de uma Ordem.");
        }
        if (ideal == null || ideal.isBlank()) {
            throw new IllegalArgumentException("Todo Radiante precisa seguir um Ideal.");
        }
        if (espreno == null || espreno.isBlank()) {
            throw new IllegalArgumentException("Todo Radiante precisa de um Espreno.");
        }
        if (poderes == null || poderes.isBlank()) {
            throw new IllegalArgumentException("Todo Radiante precisa ter Poderes definidos.");
        }

        this.ordem = ordem;
        this.ideal = ideal;
        this.espreno = espreno;
        this.poderes = poderes;
    }

    public static String getPrimeiro_Ideal() {
        return PRIMEIRO_IDEAL;
    }

    public String getOrdem() {
        return ordem;
    }

    public String getIdeal() {
        return ideal;
    }

    public String getEspreno() {
        return espreno;
    }

    public String getPoderes() {
        return poderes;
    }
}