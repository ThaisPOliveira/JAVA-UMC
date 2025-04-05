public class Aluno {
    private String nomeAluno;
    private int matriculaAluno;
    private double notaAluno;


    //Construtor
    public Aluno(String nomeAluno, int matriculaAluno, double notaAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.notaAluno = notaAluno;
    }

    //GET
    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public double getNotaAluno() {
        return notaAluno;
    }

    //SET
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public void setNotaAluno(double notaAluno) {
        this.notaAluno = notaAluno;
    }

    //Exibir Dadps
    public void exibirDados(){
        System.out.println("Nome Aluno: " + nomeAluno + " | Matricula: " + matriculaAluno + " | Nota: " + notaAluno);
    }
}
