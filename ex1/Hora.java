public class Hora
{
    public int hora;
    public int minuto;
    
    public Hora(int hora, int minuto)
    {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public String getHora()
    {
        String horatemp;
        if (hora < 10) horatemp = "0" + hora;
        else horatemp = "" + hora;
        String minutotemp;
        if (minuto < 10) minutotemp = "0" + minuto;
        else minutotemp = "" + minuto;
        return horatemp + ":" + minutotemp;
    }
}
