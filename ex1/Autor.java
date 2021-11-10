public class Autor
{
    private String nomeautor;
    private Data datanascimento;
    
    public Autor(String nomeautor, Data datanascimento)
    {
        this.nomeautor = nomeautor;
        this.datanascimento = datanascimento;
    }

    public void printAutor()
    {
        System.out.println("Nome: " + nomeautor);
        System.out.println("Data de Nascimento: " + datanascimento.getData());
    }
}
