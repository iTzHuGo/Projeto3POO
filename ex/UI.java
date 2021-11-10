public class UI
{
    private IUTexto ui;
    private Equipa equipa;

    public UI(){
        ui = new IUTexto();
        equipa = new Equipa("EDV");
        int opcao;
        opcao = -1;
        while(opcao != 0){
            ui.cls();
            el("Opções");
            el("1. Adicionar Jogador");
            el("2. Listar Jogadores");
            el("3. Registar Golos");
            el("99. Carregar Dados Teste");
            el("0. Sair");
            opcao = ui.lerInteiro("Qual a opção: ");
            switch(opcao){
                case 1: addJogador();
                break;
                case 2: listarJogadores();
                break;
                case 3: regGolos();
                break;
                case 99: carregaDadosTeste();
                break;
                case 0: el("Fim do programa");
                break;
                default: el("Opção inválida");
                break;            
            }
            ui.lerLinha("Carregue no enter");
        }
    }

    private void el(String linha){
        System.out.println(linha);
    }

    public void addJogador(){
        el("Novo Jogador:");
        int numero;
        String alcunha;
        alcunha = ui.lerLinha("Qual a alcunha do jogador?");
        numero = ui.lerInteiro("Qual o número do jogador?");
        Jogador novoJogador = new Jogador(numero,alcunha);
        equipa.addPlayer(novoJogador);
        el("Novo jogador adicionado!");
    }

    public void listarJogadores(){
        el("Jogadores:");
        equipa.listarJogadores();
    }

    public void regGolos(){
        int numero;
        numero = ui.lerInteiro("Qual o número do jogador que marcou o(s) golo(s)");
        Jogador j = equipa.procurarJogador(numero);
        if(j == null){
            el("O jogador não existe.");
        }
        else{
            int golos = ui. lerInteiro("Quantos Golos?");
            j.marcarGolos(golos);
            el("Registado com sucesso!");
        }
    }

    private void carregaDadosTeste(){
        equipa.addPlayer(new Jogador(10, "João"));
        equipa.addPlayer(new Jogador(23, "Ronaldo"));
        equipa.addPlayer(new Jogador(12, "Cristóvão"));
        equipa.addPlayer(new Jogador(43, "Tiago"));
        equipa.addPlayer(new Jogador(21, "ye"));
        Jogador j = new Jogador(32, "Ultimo");
        j.marcarGolos(4);
        equipa.addPlayer(j);
    }
    
    public static void main(String[] args){
        new UI();
    }
}
