public class Destino
{
    public String pais;
    public String hotel;
    public double preco;
    
    public Destino(String pais, String hotel, double preco)
    {
        this.pais = pais;
        this.hotel = hotel;
        this.preco = preco;
    }
    
    public String getInfo()
    {
        return "País: " + pais + "\n" + "Hotel: " + hotel + "\n" + "Preço: " + preco + " €";
    }
}
