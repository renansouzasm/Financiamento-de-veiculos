package poo.projeto.src;

import java.util.ArrayList;

public class Cadastro {
    public static ArrayList<String> usuarios = new ArrayList<>();
    public static ArrayList<Integer> cpfs = new ArrayList<>();
    public static ArrayList<Integer> datasNascimento = new ArrayList<>();
    public static ArrayList<String> senhas = new ArrayList<>();
    
    private static int indice, size;
    private static String usuarioLogado;
    
    // ------------------------------------------------------------------------
    
    public Cadastro() {
        
        if (usuarios.isEmpty()) {
            usuarios.add("adm");
            cpfs.add(112213242);
            datasNascimento.add(2002);
            senhas.add("adm");
        }
    }
    
    // ------------------------------------------------------------------------
    
    public static String getUsuario() {
        return usuarioLogado;
    }
    
    // ------------------------------------------------------------------------
    
    public static void imprimirUsuario(String nomeUsuario) {
        usuarioLogado = nomeUsuario;
    }
    
    // ------------------------------------------------------------------------
    
    public static boolean autenticacaoUsuario(String infoUsuario) {
        boolean resposta = false;
        size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            if (infoUsuario.equals(usuarios.get(i))) {
                resposta = true;
                indice = i;
                break;
            }
        }
        return resposta; 
    }
    
    // ------------------------------------------------------------------------
    
    public static boolean autenticacaoSenha(String infoSenha) { 
        boolean resposta = false;
        
        if (infoSenha.equals(senhas.get(indice))) {
            resposta = true;
        }
        return resposta; 
    }
    
    // ------------------------------------------------------------------------
    
    public static void setUsuario
    (String novoUsuario, int novoCpf, int novaDataNascimento, String novaSenha) {
        size = usuarios.size();
        
        if (!autenticacaoUsuario(novoUsuario) && size <= 10) {
            
            usuarios.add(novoUsuario);
            cpfs.add(novoCpf);
            datasNascimento.add(novaDataNascimento);
            senhas.add(novaSenha);
        }
    }

}
