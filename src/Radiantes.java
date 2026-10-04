public abstract class  Radiantes {


private String ordem;
private String ideal;
private String espreno;


private static final String Primeiro_Ideal =
        "Vida antes da Morte, Força antes da fraqueza, Jornada antes do Destino";


public Radiantes( String ordem, String ideal, String espreno) {

    if (ordem == null || ordem.isBlank()) {
        throw new IllegalArgumentException("Todo Radiante precisa de uma Ordem");
    }

    if (ideal == null || ideal.isBlank()) {
        throw new IllegalArgumentException("Todo Radiante precisa seguir um Ideal");
    }

    if (espreno == null || espreno.isBlank()) {
        throw new IllegalArgumentException("Todo Radiante tem um espreno");
    }

    this.ordem = ordem;
    this.ideal = ideal;
    this.espreno = espreno;

}

public String getPrimeiro_Ideal(){
    return Primeiro_Ideal;
}

    public abstract boolean verificarJuramento(String resposta);


}