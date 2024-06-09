public class Principal {
    public static void main(String[] args) {
        idadePessoa pessoa = new idadePessoa();

        pessoa.setNome("Lucas");
        pessoa.setIdade(24);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.verificarIdade();
    }
}
