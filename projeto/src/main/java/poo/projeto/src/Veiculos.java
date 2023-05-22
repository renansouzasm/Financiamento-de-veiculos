package poo.projeto.src;

import java.util.ArrayList;

public class Veiculos {
    public static ArrayList<Veiculos> listaVeiculos = new ArrayList<>();
    private String nome, fabricante;
    private int id;
    private float valor;
    
    public static int indice, size;
    
    public Veiculos(String nome, String fabricante, float valor) {
        size = listaVeiculos.size();
        this.nome = nome;
        this.fabricante = fabricante;
        this.id = size + 1;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public static Veiculos getChoice(String info) {
        if (verificacao(info)) {
            return listaVeiculos.get(indice);
        } else {
            return null;
        }
    }
    
    public static void edit(String info, String novaFabricante, float novoValor) {
        if (verificacao(info)) {
            listaVeiculos.get(indice).setFabricante(novaFabricante);
            listaVeiculos.get(indice).setValor(novoValor);
        }
    }
    
    public static void remove(String info) {
        if (verificacao(info)) {
            listaVeiculos.remove(indice);
        }
    }
    
    public static boolean verificacao(String info) {
        boolean res = false;
        size = listaVeiculos.size();
        
        for (int i = 0; i < size; i++) {
            try {
                if (listaVeiculos.get(i).getId() == Integer.parseInt(info)) {
                    res = true;
                    indice = i;
                    break;
                }
            } catch (NumberFormatException e) {}
            
            if (listaVeiculos.get(i).getNome().equalsIgnoreCase(info)) {
                res = true;
                indice = i;
                break;
            }  
        }        
        return res;
    }
    
    public static void insert(Veiculos veiculo) {
        listaVeiculos.add(veiculo);
        size = listaVeiculos.size();
        
        if (!verificacao(veiculo.getNome()) && size < 6) {
            if (!verificacao(String.valueOf(veiculo.getId()))) {
                listaVeiculos.add(veiculo);
            }
        }
    }
    
    public static void adicionarVeiculosPreCadastrados() {
        size = listaVeiculos.size();
        insert(new Veiculos("HYUNDAI Santa Fé", "HYUNDAI", (float) 170380.00));
        insert(new Veiculos("HONDA Fit", "HONDA", (float) 89900.00));
        insert(new Veiculos("HYUNDAI HB20", "HYUNDAI", (float) 62990.00));
        insert(new Veiculos("CB 300F Twister", "HONDA", (float) 21990.00));
        insert(new Veiculos("BMW G 310 R", "BMW",  (float) 21900.00));
    }
}
