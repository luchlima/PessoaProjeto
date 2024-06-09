public class idadePessoa {
    private String nome;
    private int idade;
    private String maiorMenor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void verificarIdade(){
        if (idade >= 18){
            System.out.println("Maior de idade");
            this.maiorMenor = maiorMenor;
        }else {
            System.out.println("Menor de idade");
        }
    }
}
