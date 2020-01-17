package SistemaLivraria;

public class Livro {
    private String titulo;
    private String totalPaginas;
    private boolean aberto;
    private String genero;
    private String autor;
    private String editora;
    private int paginasAtual;
    private String anoPublicado;

    public Livro(String titulo, String totalPaginas, boolean aberto, String genero, String autor, String editora, int paginasAtual, String anoPublicado) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.aberto = aberto;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginasAtual = paginasAtual;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(String totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginasAtual() {
        return paginasAtual;
    }

    public void setPaginasAtual(int paginasAtual) {
        this.paginasAtual = paginasAtual;
    }

    public String getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public enum Genero{
        romantico,
        horror,
        biografia,
        historica,
    }


}
