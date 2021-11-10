public class Jogador
{
    private int numero;
    private String alcunha;
    private int ngolos;
    
    public Jogador(int numero, String alcunha){
        this.numero = numero;
        this.alcunha = alcunha;
        ngolos = 0;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getAlcunha(){
        return alcunha;
    }
    
    public int getGolos(){
        return ngolos;
    }
    
    public void marcarGolos(int golos){
        this.ngolos += golos;
    }
}