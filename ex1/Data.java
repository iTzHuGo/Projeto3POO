public class Data
{
    public int dia;
    public int mes;
    public int ano;
    
    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void printData()
    {
        System.out.println(ano + "/" + mes + "/" + dia);
    }
    
    public String getData()
    {
        return (ano + "/" + mes + "/" + dia);
    }
}
