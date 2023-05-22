package poo.projeto.src;

import java.util.ArrayList;

public class Cadastro {
    private static ArrayList<Cadastro> listaUsuarios = new ArrayList<>();
    private static String current; 
    private String usuario, senha; 
    private int cpf, dataNascimento;
    
    
    public Cadastro() {};

    public Cadastro(String novoUsuario, String novaSenha, int novoCpf, int novaDataNascimento) {
        this.usuario = novoUsuario;
        this.senha = novaSenha;
        this.cpf = novoCpf;
        this.dataNascimento = novaDataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    private String getSenha() {
        return senha;
    }
    
    public void setCurrentUser(String user) {
        current = user;
    }
    
    public String getCurrentUser() {
        return current;
    }
    
    public boolean autenticaUsuario(String info) {
        boolean res = false;
        for (Cadastro user : listaUsuarios) {
            if (user.getUsuario().equalsIgnoreCase(info)) {
                res = true;
                break;
            }
        }
        return res;
    }
    
    public boolean autenticaSenha(String info) {
        boolean res = false;
        for (Cadastro user : listaUsuarios) {
            if (user.getSenha().equals(info)) {
                res = true;
                break;
            }
        }
        return res;
    }
    
    public static void insert(Cadastro cadastro) {
        listaUsuarios.add(cadastro);
    }
    
    public static void adicionarUsuariosPreCadastrados() {
        insert(new Cadastro("adm", "adm", 123456, 19900101));
    }
}
