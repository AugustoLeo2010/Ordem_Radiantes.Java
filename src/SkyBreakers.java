public class SkyBreakers extends Radiantes{

    private int nivelJuramento;
    private String segundoJuramento;
    private String terceiroJuramento;
    private String quartoJuramento;

    private String palavraChave;
    private String poderes;

    public SkyBreakers() {
        super("Rompe-céus", "Justiça", "Honra");

        this.palavraChave = "Justiça";
        this.poderes = "Adesão e Gravitação";

        this.nivelJuramento = 1;

        this.segundoJuramento = "Colocarei a Lei acima de tudo";

        this.terceiroJuramento = "dedicarei-me a um codigo escolhido";

        this.quartoJuramento = "Seguirei as Ordens de quem Tiver a razão";


    }

    @Override
    public boolean verificarJuramento(String resposta){

        if (resposta == null) {
            return false;
        }

        if (nivelJuramento == 1 && resposta.equalsIgnoreCase(segundoJuramento)){
            nivelJuramento++;
            return true;
        }

        if (nivelJuramento == 2 && resposta.equalsIgnoreCase(terceiroJuramento)){
            nivelJuramento++;
            return true;
        }

        if (nivelJuramento == 3 && resposta.equalsIgnoreCase(quartoJuramento)){
            nivelJuramento++;
            return true;
        }

        return true;
    }


}