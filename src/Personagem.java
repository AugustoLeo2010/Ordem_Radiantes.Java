public class Personagem {

    private String nome;
    private int combateC;
    private int vida;
    private int estamina;
    private boolean primeiroIdeal;

    public Personagem(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
    this.nome = nome;
    this.combateC = 0;
    this.vida = 100;
    this.estamina = 100;
    this.primeiroIdeal = false;


}

public void registrarCombate() {
        combateC++;
}

public int getCombateC() {
        return combateC;
}

public boolean usarGravitacao() {

        if(!primeiroIdeal) {
            IO.println("VOCÊ NÃO DISSE O PRIMEIRO IDEAL");
            return false;
        }

        if (estamina < 25) {
            estamina = 0;
            IO.println("Você não tem estamina o suficiente, o poder falhou");
            return false;

        }
            estamina -= 25;

    return Math.random() < 0.5;

}

public boolean usarFixacao() {


        if (!primeiroIdeal) {
            IO.println("VOCÊ NÃO DISSE O PRIMEIRO IDEAL");
            return false;
        }

        if (estamina < 25) {
            estamina = 0;
            IO.println("Você não tem estamina suficiente, o poder falhou.");
            return false;
        }

        estamina -= 25;

        return Math.random() < 0.5;
    }



    public boolean podeFalarPrimeiroIdeal() {
        return combateC >= 1 && !primeiroIdeal;
    }

    public boolean pronunciarPrimeiroIdeal(String resposta) {
        if (podeFalarPrimeiroIdeal() && resposta.trim().equalsIgnoreCase(Radiantes.getPrimeiro_Ideal())) {

            primeiroIdeal = true;
            return true;
        }
        return false;

    }

    public boolean temPrimeiroIdeal() {
        return primeiroIdeal;
    }

    public void mostrarStatus() {
        IO.println("{[=================]}");
        IO.println(" |                 |");
        IO.println(" |   nome: " + nome + " |");
        IO.println(" |   Vida: " + vida + "     |");
        IO.println(" |   Estamina: " + estamina + " |");
        IO.println(" |   Combates: " + getCombateC() + "   |");
        IO.println(" |                 |");
        IO.println("{[=================]}");
    }



}
