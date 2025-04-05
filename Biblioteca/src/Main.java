//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "Rowling", 1998);
        Livro livro2 = new Livro("Agua viva", "Clarice", 1973);
        Livro livro3 = new Livro("Pequeno Principe", "Antoine", 1943);
        Livro livro4 = new Livro("A cabana", "William ", 2007);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();
        livro4.exibirInformacoes();

   }
}