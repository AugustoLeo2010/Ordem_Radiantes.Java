public class WindRunners extends Radiantes {

    private int nivelJuramento;
    private String segundoJuramento;
    private String terceiroJuramento;
    private String quartoJuramento;

    public WindRunners() {
        super("Corredores dos Ventos", "Proteger", "Espreno de Honra", "Adesao e Gravitacao");
        this.nivelJuramento = 1;
        this.segundoJuramento = "Protegerei aqueles que nao podem se proteger";
        this.terceiroJuramento = "Protegerei ate mesmo aqueles que eu odeio";
        this.quartoJuramento = "Eu nao posso salvar todos";
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
            IO.println(" |  Protegerei aqueles que nao podem  |");
            IO.println(" |  se proteger                       |");
        } else if (nivelJuramento == 2) {
            IO.println(" |  3º IDEAL:                         |");
            IO.println(" |  Protegerei ate mesmo aqueles      |");
            IO.println(" |  que eu odeio                      |");
        } else if (nivelJuramento == 3) {
            IO.println(" |  4º IDEAL:                         |");
            IO.println(" |  Eu nao posso salvar todos         |");
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