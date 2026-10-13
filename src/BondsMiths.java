public class BondsMiths extends Radiantes {

    private int nivelJuramento;
    private String segundoJuramento;
    private String terceiroJuramento;
    private String quartoJuramento;

    public BondsMiths() {
        super("Vinculadores", "União", "Pai das Tempestades", "Adesao e Tensao");
        this.nivelJuramento = 1;
        this.segundoJuramento = "Unirei ao inves de dividir";
        this.terceiroJuramento = "Assumirei a responsabilidade pelas coisas que fiz";
        this.quartoJuramento = "Me levantarei cada vez um homem melhor";
    }

    @Override
    public int getNivelJuramento() {
        return nivelJuramento;
    }

    @Override
    public void exibirProximoJuramento() {
        IO.println("{[====================================]}");
        if (nivelJuramento == 1) {
            IO.println(" |  2º JURAMENTO:                      |");
            IO.println(" |  Unirei ao inves de dividir         |");
        } else if (nivelJuramento == 2) {
            IO.println(" |  3º JURAMENTO:                      |");
            IO.println(" |  Assumirei a responsabilidade pelas |");
            IO.println(" |  coisas que fiz                     |");
        } else if (nivelJuramento == 3) {
            IO.println(" |  4º JURAMENTO:                      |");
            IO.println(" |  Me levantarei cada vez um homem    |");
            IO.println(" |  melhor                             |");
        }
        IO.println("{[====================================]}");
    }

    @Override
    public boolean verificarJuramento(String resposta) {
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
