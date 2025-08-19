package app;

public class PrimeiraClasse {
    public static void main(String[] args){
        // "new" serve para alocar recurso
        Aluno a1 = new Aluno(); // Método construtor (Aluno())
        a1.nome = "Iago";
        a1.idade = 20;

        Aluno a2 = a1;
        a2.nome = "Neymar"; // Nomes ficam iguais pois reference ao mesmo objeto

        System.out.println("[ A1 ]");
        System.out.println("nome = " + a1.nome);
        System.out.println("idade = " + a1.idade + "\n");

        System.out.println("[ A2 ]");
        System.out.println("nome = " + a2.nome);
        System.out.println("idade = " + a2.idade + "\n");
        
        System.out.println("[ CHAMADA DE MÉTODO ]");
        System.out.println("A1 = " + a1.getDados()); 
        System.out.println("A2 = " + a2.getDados() + "\n");
         
        Aluno a3 = new Aluno("Maria", 35);
        System.out.println("[ CHAMADA DE MÉTODO ]");
        System.out.println("A3 = " + a3.getDados() + "\n");

        Cliente c1 = new Cliente();
        c1.setNome("Teste"); 
        System.out.println("[ CHAMADA DE GET ]");
        System.out.println(c1.getNome());
    }
}