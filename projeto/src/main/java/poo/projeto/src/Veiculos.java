package poo.projeto.src;

import java.util.ArrayList;

public class Veiculos {
    
    public static ArrayList<String> ids = new ArrayList<>();
    public static ArrayList<String> nomes = new ArrayList<>();
    public static ArrayList<String> fabricantes = new ArrayList<>();
    public static ArrayList<Double> valores = new ArrayList<>();
    
    private static int indice, size;
    
    // ------------------------------------------------------------------------
    
    public Veiculos() {
        
        if (nomes.isEmpty()) {
            nomes.add("HYUNDAI Sanat Fé"); 
            nomes.add("HONDA Fit"); 
            nomes.add("HYUNDAI HB20"); 
            nomes.add("CB 300F Twister"); 
            nomes.add("BMW G 310 R");
            
            for (int i = 1; i <= nomes.size(); i++) {
                ids.add(String.valueOf(i));
            }
            
            fabricantes.add("HYUNDAI"); 
            fabricantes.add("HONDA"); 
            fabricantes.add("HYUNDAI"); 
            fabricantes.add("HONDA"); 
            fabricantes.add("BMW");
            
            valores.add(170380.00); 
            valores.add(89900.00); 
            valores.add(62990.00); 
            valores.add(21990.00); 
            valores.add(21900.00);
        }
    }
    
    // ------------------------------------------------------------------------
    
    public static ArrayList<String> getVeiculo(String infoVeiculo) {
        ArrayList<String> veiculoEscolhido = new ArrayList<>();
        
        if (verificacao(infoVeiculo)) {
            veiculoEscolhido.add(ids.get(indice));
            veiculoEscolhido.add(nomes.get(indice));
            veiculoEscolhido.add(fabricantes.get(indice));
            veiculoEscolhido.add(String.valueOf(valores.get(indice)));
        }
        
        return veiculoEscolhido;
    }
    
    // ------------------------------------------------------------------------
    
    public static void setVeiculo(String novoNome, String novaFabricante, double novoValor) {
        size = nomes.size();
        
        if (!verificacao(novoNome) && size < 6) {
            if (nomes.get(indice).equals("Indefinido..")) {
                nomes.remove(indice);
                nomes.add(indice, novoNome);
                fabricantes.remove(indice);
                fabricantes.add(indice, novaFabricante);
                valores.remove(indice);
                valores.add(indice, novoValor);
            } else {
                ids.add(String.valueOf(size));
                nomes.add(novoNome);
                fabricantes.add(novaFabricante);
                valores.add(novoValor); 
            }
        }
    }
    
    // ------------------------------------------------------------------------
        
    public static void editVeiculo
    (String infoVeiculo, String novaFabricante, double novoValor) {
        if (verificacao(infoVeiculo)) {
            
            fabricantes.remove(indice);
            fabricantes.add(indice, novaFabricante);
            valores.remove(indice);
            valores.add(indice, novoValor);
        }
    }
    
    // ------------------------------------------------------------------------
    
    public static void removeVeiculo(String infoVeiculo) {
        if (verificacao(infoVeiculo)) {
            
            nomes.remove(indice);
            nomes.add(indice, "Indefinido..");
            fabricantes.remove(indice);
            fabricantes.add(indice, "Indefinido..");
            valores.remove(indice);
            valores.add(indice, 0.0);
        }
    }
    
    // ------------------------------------------------------------------------
    
    public static boolean verificacao(String infoVeiculo) {
        boolean resposta = false;
        size = nomes.size();
        
        for (int i = 0; i < size; i++) {
            if (nomes.get(i).equals("Indefinido..")) {
                indice = i;
                break;
            }
            if (infoVeiculo.equalsIgnoreCase(ids.get(i)) 
            || infoVeiculo.equalsIgnoreCase(nomes.get(i))) {
                resposta = true; 
                indice = i;
                break;
            }
        }
        
        return resposta;
    }
    
}
