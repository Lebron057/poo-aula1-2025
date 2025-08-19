package app;

public class Cliente  {
    private String nome;
    private double saldo;

    // Inserir o valor (set -> inserir)
    public void setNome(String nome) { // set é utilizado para inserir atributos
        this.nome = nome;
    }

    // Retornar o valor (get -> pegar)
    public String getNome() {
        return this.nome;
    }
}