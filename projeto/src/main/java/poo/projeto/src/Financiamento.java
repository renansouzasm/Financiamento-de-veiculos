package poo.projeto.src;

import java.util.ArrayList;

public class Financiamento extends Veiculos {  
    
    public static ArrayList<String> veiculoEscolhido = new ArrayList<>();
    public static int[] parcelas = {1, 3, 6, 12, 24};
    public static int[] valoresEntrada = {1000, 2000, 5000, 8000, 10000};
    
    // ------------------------------------------------------------------------

    public Financiamento() {}
    
    // ------------------------------------------------------------------------
    
    public static void setVeiculoEscolhido(String infoVeiculo) {
        veiculoEscolhido = getVeiculo(infoVeiculo);
    }
    
    // ------------------------------------------------------------------------
    
    public static double calculoFinanciamento(int parcela, int valorEntrada) {
        double resultado;
        
        if (!veiculoEscolhido.isEmpty()) {
            resultado = Double.parseDouble(veiculoEscolhido.get(3));
            resultado -= valoresEntrada[valorEntrada];
            resultado /= parcelas[parcela];
        } else {
            resultado = Double.parseDouble("Não deu certo :(");
        }
        
        return resultado;
    }
}
