public class Voo
{
    public String numeroVoo;
    public String lugar;
    public Data dataPartida;
    public Hora horaPartida;
    
    public Voo(String numeroVoo, String lugar, Data dataPartida, Hora horaPartida)
    {
        this.numeroVoo = numeroVoo;
        this.lugar = lugar;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
    }
    
    public String getVoo()
    {
        return "Número: " + numeroVoo + "\n" + "Lugar: " + lugar + "\n" + "Partida a " + dataPartida.getData() + " às " + horaPartida.getHora();
    }
}
