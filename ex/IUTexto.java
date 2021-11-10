import java.io.*;

/**
 * Classe para interaccao com o utilizador em modo texto.
 * 
 * @author ESTG-IPVC 
 * @version 0.1a
 */
public class IUTexto
{
    // Input
    private BufferedReader reader;

    /**
     * Construtor
     */
    public IUTexto()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    /**
     * Le uma linha de texto introduzida pelo utilizador
     * @param mensagem Mensagem a apresentar ao utilizador (null se nao existir mensagem)
     * @return String com texto introduzido
     */
    public String lerLinha(String mensagem)
    {
        if (mensagem != null) System.out.print(mensagem);
        try {
            return reader.readLine();
        }
        catch (IOException e) {
            return "";
        }
    }

    /**
     * Le um inteiro introduzido pelo utilizador
     * @param mensagem Mensagem a apresentar ao utilizador (null se n�o existir mensagem)
     * @return Valor do inteiro introduzido
     */
    public int lerInteiro(String mensagem)
    {
        boolean ok = false;
        int numero = -1;
        while (!ok) {
            try {
                numero = Integer.parseInt(lerLinha(mensagem));
                ok = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Valor inteiro incorrecto...");
            }
        }
        return numero;
    }

    /**
     * Le um inteiro Long introduzido pelo utilizador
     * @param mensagem Mensagem a apresentar ao utilizador (null se n�o existir mensagem)
     * @return Valor do inteiro introduzido
     */
    public long lerLong(String mensagem)
    {
        boolean ok = false;
        long numero = -1;
        while (!ok) {
            try {
                numero = Long.parseLong(lerLinha(mensagem));
                ok = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Valor inteiro incorrecto...");
            }
        }
        return numero;
    }

    /**
     * Le um n�mero real introduzido pelo utilizador
     * @param mensagem Mensagem a apresentar ao utilizador (null se n�o existir mensagem)
     * @return Valor do n�mero real introduzido
     */
    public double lerReal(String mensagem)
    {
        boolean ok = false;
        double numero = -1;
        while (!ok) {
            try {
                numero = Double.parseDouble(lerLinha(mensagem));
                ok = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Valor real incorrecto...");
            }
        }
        return numero;
    }

    /**
     * Simula o "clear screen" do terminal
     */
    public void cls()
    {
        for(int i=0; i<100; System.out.println("\n"), i++);
    }

}
