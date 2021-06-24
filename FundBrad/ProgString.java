public class ProgString
    {
    public static void main(String arg[])
        {
        System.out.println("\n*** Recomenda-se nao acentuar as palavras ***");
        System.out.println("\n==============================================");
        String v1 = "Sistema";
        String v2 = new String("sistema");

        //equals
        System.out.println("Exemplo COM o metodo de comparacao: equals");
        if (v1.equals(v2))
            {System.out.println("Variaveis Identicas => " + " v1: "+ v1 + " v2: "+ v2);}
        else
            {System.out.println("Variaveis Diferentes => " + " v1: "+ v1 + " v2: "+ v2);}
        
        System.out.println ("\n==============================================");
        //equalsIgnoreCase
        System.out.println ("Exemplo SEM o metodo de comparacao: equalsIgnoreCase");
        if (v1.equalsIgnoreCase(v2))
            {System.out.println("Variaveis Identicas =>" + " v1: "+ v1 + " v2: "+ v2);}
        else
            {System.out.println("Variaveis Diferentes => " + " v1: "+ v1 + " v2: "+ v2);}
        
            System.out.println ("\n===============================================");
        //Alguns metodos
        // indexOf, charAt, substring
        System.out.println ("Exemplos com metodos: indexOf, substring, chartAt");
        String frase = "Desenvolvimento de Sistemas";
        System.out.println("\nFrase-Exemplo => Desenvolvimento de Sistemas");
        System.out.println("\nindexOf => Posicao da fonte <a> na Frase-Exemplo (0 a 26 e com os espacos): " + frase.indexOf('a'));
        System.out.println("\nsubstring => Elimina os (4) primeiros caracteres na Frase-Exemplo: " + frase.substring(4));
        System.out.println("\ncharAt => identicacao da fonte encontrada na posicao (5) da Frase-Exemplo: " + frase.charAt(5));

        System.out.println("\n================================================");
        //concat
        String titulo1 = "Desenvolvimento ", titulo2 = "de Sistemas ";
        String cursoCompleto = titulo1.concat(titulo2);
        System.out.println("\ntitulo 1: " + titulo1);
        System.out.println("\ntitulo 2: " + titulo2);
        System.out.println("Exemplo Concetenado => titulo 1 + titulo 2 = " + cursoCompleto);

    }
}