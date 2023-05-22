package poo.projeto;

import poo.projeto.src.Cadastro;
import poo.projeto.src.Financiamento;

public class Main extends javax.swing.JFrame {
    Financiamento financiamento;
    Cadastro cadastro;
    TelaCadastro telaCadastro;
    TelaCatalogo telaCatalogo;
    
    public Main() {
        initComponents();
        
        cadastro = new Cadastro();
        
        erroUsuario.setVisible(false);
        erroSenha.setVisible(false);
    }

    // ------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        inputUsuario = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        erroUsuario = new javax.swing.JLabel();
        erroSenha = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 500));

        background.setBackground(new java.awt.Color(34, 41, 50));

        title.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(225, 225, 230));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Login");

        labelUsuario.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(225, 225, 230));
        labelUsuario.setText("Usuário");

        inputUsuario.setBackground(new java.awt.Color(54, 63, 73));
        inputUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputUsuario.setForeground(new java.awt.Color(225, 225, 230));
        inputUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputUsuario.setCaretColor(new java.awt.Color(238, 238, 238));

        labelSenha.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(225, 225, 230));
        labelSenha.setText("Senha");

        btnEntrar.setBackground(new java.awt.Color(54, 63, 73));
        btnEntrar.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(225, 225, 230));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(34, 41, 50));
        btnCadastrar.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(225, 225, 230));
        btnCadastrar.setText("Cadastrar-se");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        erroUsuario.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroUsuario.setForeground(new java.awt.Color(255, 0, 0));
        erroUsuario.setText("Usuário Incorreto");

        erroSenha.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroSenha.setForeground(new java.awt.Color(255, 0, 0));
        erroSenha.setText("Senha Incorreta");

        inputSenha.setBackground(new java.awt.Color(54, 63, 73));
        inputSenha.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputSenha.setForeground(new java.awt.Color(225, 225, 230));
        inputSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputSenha.setCaretColor(new java.awt.Color(238, 238, 238));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(erroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUsuario)
                            .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(erroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSenha))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroUsuario)
                .addGap(18, 18, 18)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroSenha)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // ------------------------------------------------------------------------
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (cadastro.autenticaUsuario(inputUsuario.getText())) {
            erroUsuario.setVisible(false);
            
            if (cadastro.autenticaSenha(String.valueOf(inputSenha.getPassword()))) {
                erroSenha.setVisible(false);
            } else {
                erroSenha.setVisible(true);
            }
        } else {
            erroUsuario.setVisible(true);
        }
        
        if (cadastro.autenticaUsuario(inputUsuario.getText()) 
        && cadastro.autenticaSenha(String.valueOf(inputSenha.getPassword()))) {
            cadastro.setCurrentUser(inputUsuario.getText());
            telaCatalogo = new TelaCatalogo();
            dispose();
            telaCatalogo.setVisible(true);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        telaCadastro = new TelaCadastro();
        this.dispose();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        Cadastro.adicionarUsuariosPreCadastrados();
        Financiamento.adicionarVeiculosPreCadastrados();
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel erroSenha;
    private javax.swing.JLabel erroUsuario;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
