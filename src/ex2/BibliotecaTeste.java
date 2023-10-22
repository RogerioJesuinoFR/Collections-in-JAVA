package ex2;

public class BibliotecaTeste {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Titulo livro 1", "Autor 1", 1999, "Editora 1", 400);
        Livro l2 = new Livro("Titulo livro 2", "Autor 2", 2000, "Editora 2", 500);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        // Exemplo de empréstimo e devolução
        Livro livroEmprestado = biblioteca.buscarLivroPorTitulo("Titulo livro 1");
        if (livroEmprestado != null) {
            livroEmprestado.emprestar(5); // Dia de empréstimo
            livroEmprestado.devolver(11); // Dia de devolução
        }
    }
}

