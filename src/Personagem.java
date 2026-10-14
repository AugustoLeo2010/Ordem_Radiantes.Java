public class Personagem {

    private String nome;
    private int combateC;
    private int vida;
    private int vidaMaxima;
    private int estamina;
    private int estaminaMaxima;
    private boolean primeiroIdeal;
    private Radiantes ordem;

    public Personagem(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        this.nome = nome.trim();
        this.combateC = 0;
        this.vidaMaxima = 100;
        this.vida = 100;
        this.estaminaMaxima = 100;
        this.estamina = 100;
        this.primeiroIdeal = false;
        this.ordem = null;
    }

    public String getNome() {
        return nome;
    }

    public int getCombateC() {
        return combateC;
    }

    public void registrarCombate() {
        combateC++;
        restaurarStatusAposCombate();
    }

    public boolean temPrimeiroIdeal() {
        return primeiroIdeal;
    }

    public boolean temTerceiroIdeal() {
        return ordem != null && ordem.getNivelIdeal() >= 3;
    }

    public Radiantes getOrdem() {
        return ordem;
    }

    public void setOrdem(Radiantes ordem) {
        this.ordem = ordem;
    }

    public boolean podeFalarPrimeiroIdeal() {
        return combateC >= 2 && !primeiroIdeal;
    }

    public boolean pronunciarPrimeiroIdeal(String resposta) {
        if (resposta != null && resposta.trim().equalsIgnoreCase(Radiantes.getPrimeiro_Ideal())) {
            this.primeiroIdeal = true;
            return true;
        }
        return false;
    }

    public boolean segundoIdealLiberado() {
        return combateC >= 4 && primeiroIdeal && ordem == null;
    }

    public boolean proximoIdealLiberado() {
        if (ordem == null) return false;
        int nivelActual = ordem.getNivelIdeal();
        if (nivelActual == 2) return combateC >= 6;
        if (nivelActual == 3) return combateC >= 8;
        return false;
    }

    public boolean usarGravitacao() {
        if (!primeiroIdeal) {
            IO.println("VOCÊ AINDA NÃO RECITOU O PRIMEIRO IDEAL!");
            return false;
        }
        if (estamina < 25) {
            IO.println("Você não tem estamina suficiente! A Gravitação falhou.");
            return false;
        }
        estamina -= 25;
        IO.println("Você alterou a gravidade e desferiu um golpe aéreo devastador!");
        return Math.random() < 0.80;
    }

    public boolean usarFixacao() {
        if (!primeiroIdeal) {
            IO.println("VOCÊ AINDA NÃO RECITOU O PRIMEIRO IDEAL!");
            return false;
        }
        if (estamina < 25) {
            IO.println("Você não tem estamina suficiente! A Fixação falhou.");
            return false;
        }
        estamina -= 25;
        IO.println("Você prendeu o inimigo no chão/parede com a Fixação e o golpeou!");
        return Math.random() < 0.80;
    }

    public boolean usarEspadaFractal() {
        if (!temTerceiroIdeal()) {
            IO.println("VOCÊ AINDA NÃO ATINGIU O 3º JURAMENTO PARA INVOCAR A ESPADA FRACTAL!");
            return false;
        }
        if (estamina < 20) {
            IO.println("Você não tem estamina suficiente para invocar a Espada Fractal!");
            return false;
        }
        estamina -= 20;
        IO.println("Sua Espada Fractal se materializou em suas mãos, cortando a alma do inimigo!");
        return Math.random() < 0.95;
    }

    public boolean defender() {
        if (estamina < 15) {
            IO.println("Você não tem estamina para se defender totalmente!");
            vida -= 15;
            return false;
        }
        estamina -= 15;
        vida -= 5;
        return true;
    }

    public boolean esquivar() {
        if (Math.random() < 0.6) {
            IO.println(nome + " esquivou com maestria do golpe e recuperou 15 de Estamina!");
            estamina = Math.min(estaminaMaxima, estamina + 15);
            return true;
        } else {
            IO.println("A esquiva falhou! Você recebeu dano.");
            vida -= 20;
            return false;
        }
    }

    private void restaurarStatusAposCombate() {
        this.vida = Math.min(vidaMaxima, vida + 30);
        this.estamina = Math.min(estaminaMaxima, estamina + 50);
    }

    public void mostrarStatus() {
        IO.println("{[=====================================]}");
        IO.println(" |  Nome: " + nome);
        IO.println(" |  Vida: " + vida + "/" + vidaMaxima);
        IO.println(" |  Estamina: " + estamina + "/" + estaminaMaxima);
        IO.println(" |  Combates Vencidos: " + combateC);
        if (ordem != null) {
            IO.println(" |  Ordem: " + ordem.getOrdem());
            IO.println(" |  Nível do Juramento: " + ordem.getNivelIdeal() + "º Ideal");
            IO.println(" |  Poderes: " + ordem.getPoderes());
            IO.println(" |  Espreno: " + ordem.getEspreno());
        } else {
            IO.println(" |  Ordem: Sem Vínculo Radiante");
        }
        IO.println("{[=====================================]}");
    }
}