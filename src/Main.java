public static void main (String []args) {

    String nome;

    while (true) {
       nome = IO.readln("DIGA SEU NOME: ");

        if (nome != null && !nome.isBlank()) {
            nome = nome.trim();
            break;

        }
        IO.println("O nome não pode ser vazio, tente novamente");
    }

        Personagem personagem = new Personagem(nome);


    String menu;

    while (true) {

        IO.println("{[====================]}");
        IO.println(" |      " + nome + "       |");
        IO.println(" |                    |");
        IO.println(" |     1.Historia     |");
        IO.println(" |   2.Informaçoes    |");
        IO.println(" |      3.Lutar       |");
        IO.println(" |     4.Status       |");
        IO.println(" |      5.Sair        |");

        if (personagem.podeFalarPrimeiroIdeal()) {
            IO.println(" |  6.Primeiro Ideal  |");
        }

        IO.println(" |                    |");
        IO.println("{[====================]}");

        if (personagem.podeFalarPrimeiroIdeal()) {
            IO.println("1/2/3/4/5/6");
            menu = IO.readln("Oque você vai fazer: ");
        } else {
            IO.println("1/2/3/4/5");
            menu = IO.readln("Oque você vai fazer: ");
        }

        if (menu.equals("1")) {
            IO.println("{[======================================]}");
            IO.println(" |     Milenios atrás, na época das     |");
            IO.println(" |    Desolações, a humanidade estava   |");
            IO.println(" |      prestes a ser extinta pelos     |");
            IO.println(" |      Esvasiadores... Até que Deus    |");
            IO.println(" |     deu vida aos chamados Arautos,   |");
            IO.println(" |     10 humanos imortais capazes de   |");
            IO.println(" |       se vincular aos Esprenos,      |");
            IO.println(" |      e aprisionar os Esvasiadores    |");
            IO.println(" |    no Braize... E ao aprisiona-los   |");
            IO.println(" |     a cada Desolação que passava     |");
            IO.println(" |     sofrerem todo tipo de tortura    |");
            IO.println(" |  para nos livrar da guerra e da dor  |");
            IO.println(" |     e nos dar esperança novamente    |");
            IO.println(" |   ...até que a proxima Desolação...  |");
            IO.println(" |   ............começasse............  |");
            IO.println("{[======================================]}");

        } else if (menu.equals("2")) {
            IO.println("{[=======================]}");
            IO.println(" |  Um homem nascido em  |");
            IO.println(" |  uma vila do interior |");
            IO.println(" |     de Roshar, um     |");
            IO.println(" |    Zé-Ninguem, que    |");
            IO.println(" |   que foi convocado   |");
            IO.println(" |   para lutar contra   |");
            IO.println(" |    os Parshedianos    |");
            IO.println(" |    e vingar o Rei     |");
            IO.println("{[=======================]}");

        } else if (menu.equals("3")) {
            IO.println("!!!UM PARSHEDIANO APARECEU!!!");
            IO.println("atacar - defender - esquivar - fugir");
            String acao = IO.readln("Escolha sua ação: ");

            if (acao == null || acao.isBlank()) {
                IO.println("You died");
                System.exit(0);

            } else if (acao.equalsIgnoreCase("atacar")) {

                // sem 1ºIdeal
                if(!personagem.temPrimeiroIdeal()) {
                    IO.println("[ataque base]");
                    String escolha = IO.readln("escolha sua ação: ");

                    if (escolha == null) {
                        IO.println("Voce não fez nada");
                        IO.println("Você recebeu um golpe critico e morreu");
                        System.exit(0);

                    } else if (escolha.trim().equalsIgnoreCase("ataque base")) {
                        IO.println("você utilizou ataque base");
                        personagem.registrarCombate();
                        IO.println(nome + " ganhou a luta");
                    } else {
                        IO.println("Opção invalida");
                    }

                    // com 1ºIdeal
                } else if (personagem.temPrimeiroIdeal()) {
                    IO.println("[ataque base - gravitacão - fixacão]");
                    String escolha = IO.readln("escolha sua ação: ");

                    if (escolha == null) {
                        IO.println("Você não fez nada");
                        IO.println("Você recebeu um golpe critico e morreu");
                        System.exit(0);

                    } else if (escolha.trim().equalsIgnoreCase("ataque base")) {
                        IO.println("Você utilizou o ataque base");
                        personagem.registrarCombate();
                        IO.println(nome + " ganhou a luta");

                    } else if (escolha.trim().equalsIgnoreCase("gravitacao")) {
                       boolean sucesso = personagem.usarGravitacao();

                    if (sucesso) {
                        IO.println("A Gravitação funcionou! Seu golpe acertou o inimigo.");
                        personagem.registrarCombate();
                        IO.println(nome + " ganhou a luta");
                    } else {
                        IO.println("A Gravitação falhou!");
                    }

                } else if (escolha.trim().equalsIgnoreCase("fixacao")) {
                       boolean sucesso = personagem.usarFixacao();

                       if (sucesso) {
                           IO.println("Você usou a Fixacao, prendeu seu inimigo na parede e deu multiplos socos nele");
                           personagem.registrarCombate();
                           IO.println(nome + " ganhou a luta");
                       } else {
                           IO.println("A Fixacao falhou!");
                       }
                    }
                } else {
                    IO.println("Ataque invalido");
                }

            } else if (acao.equalsIgnoreCase("defender")) {


            } else if (acao.equalsIgnoreCase("esquivar")) {


            } else if (acao.equalsIgnoreCase("fugir")) {
                IO.println(nome + " Fugiu");

            } else {
            IO.println("Opção invalida");
        }

        } else if (menu.equals("4")) {
            personagem.mostrarStatus();


        } else if (menu.equals("5")) {
            IO.println("Você desistiu da jornada...");
            System.exit(0);

        } else if (menu.equals("6") && personagem.podeFalarPrimeiroIdeal()) {
            IO.println("{[==========================]}");
            IO.println(" |                          |");
            IO.println(" |    Vida antes da Morte,  |");
            IO.println(" |  Forca antes da Fraqueza,|");
            IO.println(" | Jornada antes do Destino |");
            IO.println(" |                          |");
            IO.println("{[==========================]}");
            String resposta = IO.readln("DIGA O JURAMENTO: ");

            if (personagem.pronunciarPrimeiroIdeal(resposta)) {
                IO.println("ESTAS PALAVRAS FORAM ACEITAS");
            } else {
                IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
            }
        } else {
            IO.println("Escolha a opção do menu");
        }


    }

}


