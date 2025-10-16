class Jornal extends MaterialBiblioteca {
    private String dataPublicacao;

 
    public Jornal(String titulo, String autor, int anoPublicacao, String dataPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.dataPublicacao = dataPublicacao;
    }

    
    
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Data de Publicação: " + dataPublicacao);
    }
}