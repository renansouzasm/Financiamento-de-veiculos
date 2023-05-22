package poo.projeto.src;

public class Financiamento extends Veiculos {  
    
    public static Veiculos choice;
    public static int[] parcelas = {1, 3, 6, 12, 24};
    public static int[] entradas = {1000, 2000, 5000, 8000, 10000};

    public Financiamento(String nome, String fabricante, float valor) {
        super(nome, fabricante, valor);
    }    
    
    public static void setChoice(String info) {
        choice = getChoice(info);
    }
    
    public static double calculoFinanciamento(int parcela, int valorEntrada) {
        double result;
        
        if (choice != null) {
            result = choice.getValor();
            result -= entradas[valorEntrada];
            result /= parcelas[parcela];
        } else {
            result = Double.parseDouble("Não deu certo :(");
        }
        
        return result;
    }
}
