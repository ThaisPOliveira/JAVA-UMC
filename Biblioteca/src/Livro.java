public class Livro {
    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;

    public Livro(String tituloLivro, String autorLivro, int anoPublicacao) {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacao = anoPublicacao;
    }

    //GET
    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //SET

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    //Exibir informações
    public void exibirInformacoes(){
        System.out.println("Título: " + tituloLivro + " | Autor: " + autorLivro + " | Ano publicado: " + anoPublicacao);
    }
}

