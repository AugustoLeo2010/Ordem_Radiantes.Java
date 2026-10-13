public class BondsMiths extends Radiantes{

    private int nivelJuramento;
    private String segundoJuramento;
    private String terceiroJuramento;

    private String palavraChave;
    private String poderes;

    public BondsMiths() {
        super("Vinculadores", "União", "Divindade");

        this.palavraChave = "União";
        this.poderes = "Adesão e Tensão";

        this.nivelJuramento = 1;

        this.segundoJuramento = "Unirei ao invez de dividir";

        this.terceiroJuramento = "Assumirei a responsabilidade pelas coisas que fiz no passado," +
                " e me levantarei cada vez como um homem melhor";

    }

    public void segundoIdeal() {

        IO.println("{[====================]}");
        IO.println(" |                    |");
        IO.println(" |   Unirei ao invez  |");
        IO.println(" |     De dividir     |");
        IO.println(" |                    |");
        IO.println("{[====================]}");

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


        return false;
    }


    }



