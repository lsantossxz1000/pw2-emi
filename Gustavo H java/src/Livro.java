class Livro extends MaterialBiblioteca {
    private int numeroPaginas;

 
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}