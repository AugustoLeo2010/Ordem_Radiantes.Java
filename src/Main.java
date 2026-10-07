//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main (String []args) {

    String nome = IO.readln("DIGA SEU NOME: ");


        IO.println("[(========================)]");
        IO.println(" |                        |");
        IO.println(" |      1º Juramento      |");
        IO.println(" |                        |");
        IO.println(" |       Vida antes       |");
        IO.println(" |        da Morte,       |");
        IO.println(" |       Forca antes      |");
        IO.println(" |       da Fraqueza,     |");
        IO.println(" |      Jornada antes     |");
        IO.println(" |       do Destino       |");
        IO.println(" |                        |");
        IO.println("[(========================)]");

        String Primeiro_Ideal = IO.readln("Diga o primeiro Juramento: ");

        if (Primeiro_Ideal.equalsIgnoreCase("Vida antes da Morte, Forca antes da Fraqueza, Jornada antes do Destino")) {
            IO.println("!!!ESTAS PALAVRAS FORAM ACEITAS!!!");
        } else {
            IO.println("!!!ESTAS PALAVRAS NÃO FORAM ACEITAS!!!");
            System.exit(0);
        }

        IO.println("[(=======================================)]");
        IO.println(" |                                       | ");
        IO.println(" |   WindRunners           SkyBreakers   | ");
        IO.println(" |    Proteção               Justiça     | ");
        IO.println(" |                                       | ");
        IO.println(" |                                       | ");
        IO.println(" |   LightWeavers           BondsMiths   | ");
        IO.println(" |     Verdade               Vinculo     | ");
        IO.println(" |                                       | ");
        IO.println("[(=======================================)]");

        WindRunners windRunners = new WindRunners();
        SkyBreakers skyBreakers = new SkyBreakers();
        LightWeavers lightWeavers = new LightWeavers();
        BondsMiths bondsMiths = new BondsMiths();

        String escolha = IO.readln("Escolha a ordem a quem quer pertencer: ");

        switch (escolha) {


            case "WindRunners":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |  Protegerei aqueles que  | ");
                IO.println(" |   nao podem se proteger  | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                String resposta = IO.readln("RECITE O 2º JURAMENTO: ");

                if (windRunners.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou as abilidades de Adesão e Gravitação");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }

                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |   Protegerei até mesmo   | ");
                IO.println(" |   aqueles que eu odeio   | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 3º JURAMENTO: ");

                if (windRunners.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Espada Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }


                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |       Eu não posso       | ");
                IO.println(" |       salvar todos       | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 4º JURAMENTO: ");

                if (windRunners.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Armadura Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }


                break;

            case "SkyBreakers":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |     Colocarei a Lei      | ");
                IO.println(" |      acima de tudo       | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 2º JURAMENTO: ");

                if (skyBreakers.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou as abilidades de Adesão e Gravitação");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }

                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |     Dedicarei-me a       | ");
                IO.println(" |       um codigo          | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 3º JURAMENTO: ");

                if (skyBreakers.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Espada Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }


                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |     Seguirei as ordens   | ");
                IO.println(" |    de quem tiver razão   | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 4º JURAMENTO: ");

                if (skyBreakers.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Armadura Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }

                break;

            case "LightWeavers":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |      Diga uma verdade    | ");
                IO.println(" |         sobre voce       | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 2º JURAMENTO: ");

                if (lightWeavers.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou as abilidades de Adesão e Gravitação");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }


                IO.println("[(===========================)]");
                IO.println(" |                           | ");
                IO.println(" | Diga quem verdadeiramente | ");
                IO.println(" |         é voce            | ");
                IO.println(" |                           | ");
                IO.println("[(===========================)]");

                resposta = IO.readln("RECITE O 3º JURAMENTO: ");

                if (lightWeavers.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Espada Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }


                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |      Por que voce        | ");
                IO.println(" |          vive            | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 4º JURAMENTO: ");

                if (lightWeavers.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Armadura Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }

                break;


            case "BondsMiths":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |       Eu unirei ao       | ");
                IO.println(" |     inves de dividir     | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

                resposta = IO.readln("RECITE O 2º JURAMENTO: ");

                if (bondsMiths.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou as abilidades de Adesão e Tensão");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }


                IO.println("[(==============================)]");
                IO.println(" |                              | ");
                IO.println(" | Assumirei a responsabilidade | ");
                IO.println(" |   pelas coisas que fiz no    | ");
                IO.println(" |  passado, e me levantarei    | ");
                IO.println(" |    cada vez mais como um     | ");
                IO.println(" |        homem melhor          | ");
                IO.println(" |                              | ");
                IO.println("[(==============================)]");

                resposta = IO.readln("RECITE O 3º JURAMENTO: ");

                if (bondsMiths.verificarJuramento(resposta)){
                    IO.println("ESTAS PALAVRAS FORAM ACEITAS");
                    IO.println("Voce " + nome + " ganhou a abilidade de invocação da Espada Fractal");
                    IO.println("");
                } else {
                    IO.println("ESTAS PALAVRAS NÃO SÃO ACEITAS");
                }

                break;

            default:
                IO.println("ESSA ESCOLHA NÃO EXISTE");
                break;



        }



    }
<<<<<<< HEAD
}
=======
>>>>>>> 918af82 (atualização)
