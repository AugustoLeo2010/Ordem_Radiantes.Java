public class LightWeavers extends Radiantes{

    private int nivelJuramento;
    private String segundoJuramento;
    private String terceiroJuramento;
    private String quartoJuramento;

    private String palavraChave;
    private String poderes;

    public LightWeavers() {
        super("Teceluzes", "Verdade", "Criptidios");

        this.palavraChave = "Justiça";
        this.poderes = "Adesão e Gravitação";

        this.nivelJuramento = 1;

        this.segundoJuramento = " Diga sua Verdade";

        this.terceiroJuramento = "Diga sua Verdade";

        this.quartoJuramento = "Diga sua Verdade";

        LightWeavers lightweavers = new LightWeavers();

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

        if (nivelJuramento == 2 && resposta.equalsIgnoreCase(quartoJuramento)){
            nivelJuramento++;
            return true;
        }

        return false;
    }


}
