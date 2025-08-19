package app;

public class Aluno {
    public String nome; //Atributo
    public int idade;

    public String getDados(/*lista de parametros*/) {
        return this.nome + " (" + this.idade + ")"; // "this" -> Sempre referece ao objeto
    }

    public Aluno(String nome, int idade) {
        this.nome = nome; // "this" referece ao atributo
        this.idade = idade;
    }

    public Aluno() {}
}