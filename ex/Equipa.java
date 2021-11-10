import java.util.ArrayList;

public class Equipa{

    private ArrayList<Jogador> equipa;
    private String nome;

    public Equipa(String nome){
        this.nome = nome;
        this.equipa = new ArrayList<>();
    }

    public void addPlayer(Jogador player){
        equipa.add(player);
    }
    
    public void listarJogadores(){
        System.out.println("Equipa;" + nome);
        for(Jogador j:equipa){
            System.out.println();
            System.out.println("Alcunha: " + j.getAlcunha());
            System.out.println("Número: " + j.getNumero());
            System.out.println("Número de Golos: " + j.getGolos());
        }
    }
    
    public Jogador procurarJogador(int num){
        int index = 0;
        Jogador jogadorEncontrado = null;
        boolean encontrado = false;
        while(!encontrado && (index < equipa.size())){
            Jogador j = equipa.get(index);
            encontrado = (num== j.getNumero());
            if(encontrado){
                jogadorEncontrado = j;
            }
            index++;
        }
        return jogadorEncontrado;
    }
}
