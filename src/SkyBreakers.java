public class SkyBreakers extends Radiantes {

    private int nivelJuramento;
    private String segundoJuramento;
    private String terceiroJuramento;
    private String quartoJuramento;

    public SkyBreakers() {
        super("Rompe-ceus", "Justiça", "Espreno Elevado", "Gravitacao e Divisao");
        this.nivelJuramento = 1;
        this.segundoJuramento = "Colocarei a Lei acima de tudo";
        this.terceiroJuramento = "Dedicarei-me a um codigo";
        this.quartoJuramento = "Seguirei as ordens de quem tiver razao";
    }

    @Override
    public int getNivelIdeal() {
        return nivelJuramento;
    }

    @Override
    public void exibirProximoIdeal() {
        IO.println("{[====================================]}");
        if (nivelJuramento == 1) {
            IO.println(" |  2º IDEAL:                         |");
            IO.println(" |  Colocarei a Lei acima de tudo     |");
        } else if (nivelJuramento == 2) {
            IO.println(" |  3º IDEAL:                         |");
            IO.println(" |  Dedicarei-me a um codigo          |");
        } else if (nivelJuramento == 3) {
            IO.println(" |  4º IDEAL:                         |");
            IO.println(" |  Seguirei as ordens de quem tiver  |");
            IO.println(" |  razao                             |");
        }
        IO.println("{[====================================]}");
    }

    @Override
    public boolean verificarIdeal(String resposta) {
        if (resposta == null || resposta.isBlank()) {
            return false;
        }

        String resp = resposta.trim();

        if (nivelJuramento == 1 && resp.equalsIgnoreCase(segundoJuramento)) {
            nivelJuramento++;
            return true;
        }
        if (nivelJuramento == 2 && resp.equalsIgnoreCase(terceiroJuramento)) {
            nivelJuramento++;
            return true;
        }
        if (nivelJuramento == 3 && resp.equalsIgnoreCase(quartoJuramento)) {
            nivelJuramento++;
            return true;
        }

        return false;
    }
}
