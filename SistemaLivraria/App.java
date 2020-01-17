package SistemaLivraria;

public class App {
    public static void main(String[] args) {

        Autor autor1 = new Autor(
          "Simone",
          "Beauvoir",
          "literatura",
          "feminino",
                "frança",
                "paris",
                35
        );

        Livro livro1 = new Livro(
            "ADM.programadores",
                89,
                true,
                Livro.Genero.biografia.toString(),
                "leçon des choses",
                "2009",
                8,
                "2010"

        );
        Editora livro = new Editora(
                "espoir",
                "2009",
                "289467990-899"
                "frança",
                "paris"
        );

    }
}

