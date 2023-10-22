package ex2;

public class Livro {

    private String titulo;
    /*private String autor;
    private int anoPublicacao;
    private String editora;
    private int numeroTotalPaginas;*/
    private boolean disponibilidade;
    private int dataEmprestimo;

    public Livro(String titulo, String autor, int anoPublicacao, String editora, int numeroTotalPaginas) {
        this.titulo = titulo;
        /*this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.numeroTotalPaginas = numeroTotalPaginas;*/
        this.disponibilidade = true;
        this.dataEmprestimo = 0; // Inicialmente, nenhum empréstimo
    }

    private boolean verificarDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar(int dataEmprestimo) {
        if (verificarDisponibilidade()) {
            this.dataEmprestimo = dataEmprestimo;
            disponibilidade = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro solicitado não está disponível para empréstimo.");
        }
    }

	public void devolver(int dataDevolucao) {
        if (dataDevolucao - dataEmprestimo > 7) {
            int diasAtraso = dataDevolucao - dataEmprestimo - 7;
            double multa = 1.5 * diasAtraso;
            System.out.println("Multa de R$" + multa + " a ser cobrada.");
        } else {
            System.out.println("Livro devolvido sem multa.");
        }
        disponibilidade = true;
        this.dataEmprestimo = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    
    /*public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumeroTotalPaginas() {
		return numeroTotalPaginas;
	}*/

	public int getDataEmprestimo() {
		return dataEmprestimo;
	}
}
