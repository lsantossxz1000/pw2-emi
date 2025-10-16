public class App {
    public static void main(String[] args) {
      
        Livro livro = new Livro("Harry Potter", "J.K Rowling", 1998, 1965);
        Revista revista = new Revista("Veja", "Vários", 1968, 5);
        Jornal jornal = new Jornal("O Globo", "Vários", 1925, "30/10/2024");

       
        System.out.println("Detalhes do Livro:");
        livro.exibirDetalhes();

        System.out.println("\nDetalhes da Revista:");
        revista.exibirDetalhes();

        System.out.println("\nDetalhes do Jornal:");
        jornal.exibirDetalhes();
    }
}