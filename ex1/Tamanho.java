public class Tamanho
{
    private int altura;
    private int largura;
    private int espessura;
    
    public Tamanho(int altura, int largura, int espessura)
    {
        this.altura = altura;
        this.largura = largura;
        this.espessura = espessura;
    }
    
    public void printTamanho()
    {
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Espessura: " + espessura);
    }
}
