public class WindRunners extends Radiantes{

private int nivelJuramento;
private String segundoJuramento;
private String terceiroJuramento;
private String quartoJuramento;

private String palavraChave;
private String poderes;

public WindRunners() {
    super("Corredores dos Ventos", "Proteger", "Honra");

    this.palavraChave = "Proteger";
    this.poderes = "Adesão e Gravitação";

    this.nivelJuramento = 1;

    this.segundoJuramento = "Protegerei aqueles que não podem se proteger";

    this.terceiroJuramento = "Protegerei até mesmo aqueles que eu odeio";

    this.quartoJuramento = "Eu não posso salvar todos";


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