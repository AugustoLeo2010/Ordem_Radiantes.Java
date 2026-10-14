public class Main {

    public static void main(String[] args) {

        String nome;

        while (true) {
            nome = IO.readln("DIGA SEU NOME: ");
            if (nome != null && !nome.isBlank()) {
                nome = nome.trim();
                break;
            }
            IO.println("O nome não pode ser vazio, tente novamente.");
        }

        Personagem personagem = new Personagem(nome);
        String menu;

        while (true) {
            IO.println("\n{[====================]}");
            IO.println(" |      " + personagem.getNome() + "       |");
            IO.println(" |                    |");
            IO.println(" |     1.Historia     |");
            IO.println(" |   2.Informaçoes    |");
            IO.println(" |      3.Lutar       |");
            IO.println(" |     4.Status       |");
            IO.println(" |      5.Sair        |");

            if (personagem.podeFalarPrimeiroIdeal()) {
                IO.println(" |  6.Primeiro Ideal  |");
                IO.println("{[====================]}");
                menu = IO.readln("O que você vai fazer (1-6): ");

            } else if (personagem.segundoIdealLiberado()) {
                IO.println(" |  6.Escolher Ordem  |");
                IO.println("{[====================]}");
                menu = IO.readln("O que você vai fazer (1-6): ");

            } else if (personagem.proximoIdealLiberado()) {
                IO.println(" |  6.Proximo Ideal   |");
                IO.println("{[====================]}");
                menu = IO.readln("O que você vai fazer (1-6): ");

            } else {
                IO.println("{[====================]}");
                menu = IO.readln("O que você vai fazer (1-5): ");
            }


            if (menu == null) continue;

            switch (menu.trim()) {

                case "1" -> {
                    IO.println("{[======================================]}");
                    IO.println(" |     Milenios atrás, na época das     |");
                    IO.println(" |    Desolações, a humanidade estava   |");
                    IO.println(" |      prestes a ser extinta pelos     |");
                    IO.println(" |      Esvaziadores... Até que Deus    |");
                    IO.println(" |     deu vida aos chamados Arautos,   |");
                    IO.println(" |   criadores das Ordens de Radiantes, |");
                    IO.println(" |     10 humanos imortais capazes de   |");
                    IO.println(" |       se vincular aos Esprenos,      |");
                    IO.println(" |      e aprisionar os Esvaziadores    |");
                    IO.println(" |    no Braize... E ao aprisioná-los   |");
                    IO.println(" |     a cada Desolação que passava     |");
                    IO.println(" |     sofrerem todo tipo de tortura    |");
                    IO.println(" |  para nos livrar da guerra e da dor  |");
                    IO.println(" |  ...e nos dar esperança novamente... |");
                    IO.println(" |   ...até que a proxima Desolação...  |");
                    IO.println(" |            ...Começasse...           |");
                    IO.println("{[======================================]}");
                }

                case "2" -> {
                    IO.println("{[=======================]}");
                    IO.println(" |  Um homem nascido em  |");
                    IO.println(" |  uma vila do interior |");
                    IO.println(" |     de Roshar, um     |");
                    IO.println(" |    Zé-Ninguém, que    |");
                    IO.println(" |   foi convocado para  |");
                    IO.println(" |    lutar contra os    |");
                    IO.println(" |     Parshedianos e    |");
                    IO.println(" |      vingar o Rei     |");
                    IO.println("{[=======================]}");
                }

                case "3" -> {
                    IO.println("\n!!! UM PARSHEDIANO APARECEU !!!");
                    IO.println("[ atacar | defender | esquivar | fugir ]");
                    String acao = IO.readln("Escolha sua ação: ");

                    if (acao == null || acao.isBlank()) {
                        IO.println("Você hesitou e foi atingido! Fim de jogo.");
                        System.exit(0);
                    }

                    String acaoLimpa = acao.trim().toLowerCase();

                    if (acaoLimpa.equals("atacar")) {
                        if (!personagem.temPrimeiroIdeal()) {
                            IO.println("Ações disponíveis: [ ataque base ]");
                            String escolha = IO.readln("Confirme seu ataque: ");

                            if (escolha != null && escolha.trim().equalsIgnoreCase("ataque base")) {
                                IO.println("Você utilizou o ataque base e derrotou o inimigo!");
                                personagem.registrarCombate();
                            } else {
                                IO.println("Ataque falhou! Você recebeu um golpe crítico.");
                            }

                        } else if (personagem.temTerceiroIdeal()) {
                            IO.println("Ações disponíveis: [ ataque base | espada fractal ]");
                            String escolha = IO.readln("Escolha a forma de ataque: ");

                            if (escolha != null && escolha.trim().equalsIgnoreCase("espada fractal")) {
                                boolean sucesso = personagem.usarEspadaFractal();
                                if (sucesso) {
                                    IO.println(personagem.getNome() + " venceu a luta com a Espada Fractal!");
                                    personagem.registrarCombate();
                                } else {
                                    IO.println("O ataque com a Espada Fractal falhou!");
                                }
                            } else if (escolha != null && escolha.trim().equalsIgnoreCase("ataque base")) {
                                IO.println("Você utilizou o ataque base e venceu a luta!");
                                personagem.registrarCombate();
                            } else {
                                IO.println("Ação de ataque inválida!");
                            }

                        } else {
                            IO.println("Ações disponíveis: [ ataque base | gravitacao | fixacao ]");
                            String escolha = IO.readln("Escolha a forma de ataque: ");

                            if (escolha != null && escolha.trim().equalsIgnoreCase("gravitacao")) {
                                boolean sucesso = personagem.usarGravitacao();
                                if (sucesso) {
                                    IO.println(personagem.getNome() + " venceu a luta usando Gravitação!");
                                    personagem.registrarCombate();
                                } else {
                                    IO.println("A Gravitação falhou!");
                                }
                            } else if (escolha != null && escolha.trim().equalsIgnoreCase("fixacao")) {
                                boolean sucesso = personagem.usarFixacao();
                                if (sucesso) {
                                    IO.println(personagem.getNome() + " venceu a luta usando Fixação!");
                                    personagem.registrarCombate();
                                } else {
                                    IO.println("A Fixação falhou!");
                                }
                            } else if (escolha != null && escolha.trim().equalsIgnoreCase("ataque base")) {
                                IO.println("Você utilizou o ataque base e venceu a luta!");
                                personagem.registrarCombate();
                            } else {
                                IO.println("Ação de ataque inválida!");
                            }
                        }

                    } else if (acaoLimpa.equals("defender")) {
                        personagem.defender();
                        IO.println(personagem.getNome() + " se defendeu com o escudo!");

                    } else if (acaoLimpa.equals("esquivar")) {
                        personagem.esquivar();

                    } else if (acaoLimpa.equals("fugir")) {
                        IO.println(personagem.getNome() + " fugiu da batalha com segurança.");

                    } else {
                        IO.println("Opção de combate inválida!");
                    }
                }

                case "4" -> personagem.mostrarStatus();

                case "5" -> {
                    IO.println("Você desistiu da jornada em Roshar...");
                    System.exit(0);
                }

                case "6" -> {
                    if (personagem.podeFalarPrimeiroIdeal()) {
                        IO.println("{[=====================================]}");
                        IO.println(" |  Vida antes da Morte,               |");
                        IO.println(" |  Forca antes da Fraqueza,           |");
                        IO.println(" |  Jornada antes do Destino           |");
                        IO.println("{[=====================================]}");
                        String resposta = IO.readln("RECITE O PRIMEIRO IDEAL: ");

                        if (personagem.pronunciarPrimeiroIdeal(resposta)) {
                            IO.println("\n!!! ESTAS PALAVRAS FORAM ACEITAS !!!");
                            IO.println("Você agora tem acesso aos poderes base dos Radiantes!");
                        } else {
                            IO.println("\n!!! ESTAS PALAVRAS NÃO FORAM ACEITAS !!!");
                        }

                    } else if (personagem.segundoIdealLiberado()) {
                        IO.println("{[=====================================]}");
                        IO.println(" |    ESCOLHA SUA ORDEM DE RADIANTE:   |");
                        IO.println(" |                                     |");
                        IO.println(" |   WindRunners        SkyBreakers    |");
                        IO.println(" |    Proteção            Justiça      |");
                        IO.println(" |                                     |");
                        IO.println(" |   LightWeavers        BondsMiths    |");
                        IO.println(" |     Verdade            Vinculo      |");
                        IO.println("{[=====================================]}");

                        String escolhaOrdem = IO.readln("Escolha a Ordem à qual deseja pertencer: ");

                        if (escolhaOrdem == null) break;

                        Radiantes ordemCriada = null;
                        String op = escolhaOrdem.trim().toLowerCase();

                        if (op.equals("windrunners")) ordemCriada = new WindRunners();
                        else if (op.equals("skybreakers")) ordemCriada = new SkyBreakers();
                        else if (op.equals("lightweavers")) ordemCriada = new LightWeavers();
                        else if (op.equals("bondsmiths")) ordemCriada = new BondsMiths();

                        if (ordemCriada != null) {
                            ordemCriada.exibirProximoIdeal();
                            String juramento = IO.readln("RECITE O 2º IDEAL: ");

                            if (ordemCriada.verificarIdeal(juramento)) {
                                IO.println("\n!!! ESTAS PALAVRAS FORAM ACEITAS !!!");
                                personagem.setOrdem(ordemCriada);
                                IO.println("Você agora pertence à Ordem dos " + ordemCriada.getOrdem() + "!");
                            } else {
                                IO.println("\n!!! ESTAS PALAVRAS NÃO FORAM ACEITAS !!!");
                            }
                        } else {
                            IO.println("Ordem inválida!");
                        }

                    } else if (personagem.proximoIdealLiberado()) {
                        Radiantes ordem = personagem.getOrdem();
                        ordem.exibirProximoIdeal();
                        String juramento = IO.readln("RECITE O SEU PRÓXIMO JURAMENTO: ");

                        if (ordem.verificarIdeal(juramento)) {
                            IO.println("\n!!! ESTAS PALAVRAS FORAM ACEITAS !!!");
                            IO.println("Você subiu para o " + ordem.getNivelIdeal() + "º Nível de Juramento!");
                        } else {
                            IO.println("\n!!! ESTAS PALAVRAS NÃO FORAM ACEITAS !!!");
                        }

                    } else {
                        IO.println("Opção inválida, tente novamente.");
                    }
                }

                default -> IO.println("Opção inválida, tente novamente.");
            }
        }
    }
}