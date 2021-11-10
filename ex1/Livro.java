public class Livro
{
    private String titulo;
    private int ano;
    private Autor autor;
    private int npaginas;
    private Tamanho tamanho;
    
    public Livro(String titulo,int ano,Autor autor,int npaginas,Tamanho tamanho)
    {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.npaginas = npaginas;
        this.tamanho = tamanho;
    }
    
    public void print()
    {
        System.out.println("Livro");
        System.out.println("Título: " + titulo);
        System.out.println("Número de páginas: " + npaginas);
        System.out.println("Ano de publicação: " + ano);
        System.out.println("Dimenções do livro");
        tamanho.printTamanho();
        System.out.println("Autor");
        autor.printAutor();
    }
}
