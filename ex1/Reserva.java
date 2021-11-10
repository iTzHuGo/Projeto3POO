public class Reserva
{
    public Data dataEntrada;
    public Data dataSaida;
    public Destino destino;
    public Hora hora;
    public Voo voo;
    
    public Reserva(Data dataEntrada, Data dataSaida, Destino destino, Hora hora, Voo voo)
    {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.destino = destino;
        this.hora = hora;
        this.voo = voo;
    }
    
    public void printReserva()
    {
        System.out.print("Data de entrada: ");
        dataEntrada.printData();
        System.out.print("Data de saída: ");
        dataSaida.printData();
    }
    
    public Data getDataEntrada()
    {
        return dataEntrada;
    }
    
    public Data getDataSaida()
    {
        return dataSaida;
    }
    
    public void imprime()
    {
        System.out.println("Data");
        System.out.println("Data de entrada: " + dataEntrada.getData());
        System.out.println("Data de saída: " + dataSaida.getData());
        System.out.println("Destino: ");
        System.out.println(destino.getInfo());
        System.out.println("Voo");
        System.out.println(voo.getVoo());
    }
}
