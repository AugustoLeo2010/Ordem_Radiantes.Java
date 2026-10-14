public class LightWeavers extends Radiantes {

    private int nivelJuramento;

    public LightWeavers() {
        super("Teceluzes", "Verdade", "Criptidio", "Iluminacao e Transmutacao");
        this.nivelJuramento = 1;
    }

    @Override
    public int getNivelIdeal() {
        return nivelJuramento;
    }

    @Override
    public void exibirProximoIdeal() {
        IO.println("{[====================================]}");
        if (nivelJuramento == 1) {
            IO.println(" |  2º IDEAL (VERDADE 1):             |");
            IO.println(" |  Diga uma verdade profunda sobre si|");
        } else if (nivelJuramento == 2) {
            IO.println(" |  3º IDEAL (VERDADE 2):             |");
            IO.println(" |  Diga quem voce verdadeiramente e  |");
        } else if (nivelJuramento == 3) {
            IO.println(" |  4º IDEAL (VERDADE 3):             |");
            IO.println(" |  Encare seu maior medo ou segredo  |");
        }
        IO.println("{[====================================]}");
    }

    @Override
    public boolean verificarIdeal(String resposta) {
        if (resposta != null && resposta.trim().length() >= 3) {
            if (nivelJuramento < 4) {
                nivelJuramento++;
                return true;
            }
        }
        return false;
    }
}