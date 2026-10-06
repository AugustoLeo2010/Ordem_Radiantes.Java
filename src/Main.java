//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main (String []args) {

    String nome = IO.readln("DIGA SEU NOME: ");

    while (true) {
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

        WindRunners winsRunners = new WindRunners();
        SkyBreakers skyBreakers = new SkyBreakers();
        LightWeavers lightweavers = new LightWeavers();
        BondsMiths bondsMiths = new BondsMiths();

        String escolha = IO.readln("Escolha a ordem a quem quer pertencer: ");

        switch (escolha) {

            case "WindRunners":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |  Protegerei aqueles que  | ");
                IO.println(" |   não podem se proteger  | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");
                break;

            case "SkyBreakers":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |     Colocarei a Lei      | ");
                IO.println(" |      acima de tudo       | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");
                break;

            case "LightWeavers":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |     Diga uma verdade     | ");
                IO.println(" |        sobre você        | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");
                break;

            case "BondsMiths":
                IO.println("[(==========================)]");
                IO.println(" |                          | ");
                IO.println(" |       Eu unirei ao       | ");
                IO.println(" |     inves de dividir     | ");
                IO.println(" |                          | ");
                IO.println("[(==========================)]");

            default:
                IO.println("ESSA ESCOLHA NÃO EXISTE");
                break;

                String resposta = IO.readln("RECITE O 2º JURAMENTO: ");

            if (WindRunners.verificarJuramento(resposta)){

            }

        }



    }
}
