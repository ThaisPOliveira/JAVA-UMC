//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Thais Oliveira",1124110353, 10);
        Aluno aluno2 = new Aluno("Erick Fernando",1124110445, 9);
        Aluno aluno3 = new Aluno("Eduardo Vicente",1124110896, 3);
        Aluno aluno4 = new Aluno("Rafael Castro",1124110759, 8);

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
        aluno4.exibirDados();
    }

}