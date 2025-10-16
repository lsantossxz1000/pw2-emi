class Revista extends MaterialBiblioteca {
    private int edicao;

    
    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

   

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Edição: " + edicao);
    }
}
