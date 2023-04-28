package poo.projeto;

import poo.projeto.src.Cadastro;

public class TelaCadastro extends javax.swing.JFrame {
    
    Cadastro cadastro;
    Main telaLogin;
    int cpf, dataNascimento;
    
    // ------------------------------------------------------------------------
    
    public TelaCadastro() {
        initComponents();
        
        erroNovoUsuario.setVisible(false);
        erroNovoCpf.setVisible(false);
        erroNovaDataNascimento.setVisible(false);
        
        cadastro = new Cadastro();
        telaLogin = new Main();
    }

    // ------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        labelNovoUsuario = new javax.swing.JLabel();
        inputNovoUsuario = new javax.swing.JTextField();
        labelNovoCpf = new javax.swing.JLabel();
        inputNovoCpf = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        erroNovoUsuario = new javax.swing.JLabel();
        erroNovoCpf = new javax.swing.JLabel();
        labelNovaDataNascimento = new javax.swing.JLabel();
        inputNovaDataNascimento = new javax.swing.JTextField();
        erroNovaDataNascimento = new javax.swing.JLabel();
        labelNovaSenha = new javax.swing.JLabel();
        inputNovaSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(350, 600));
        setMinimumSize(new java.awt.Dimension(350, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 600));

        background.setBackground(new java.awt.Color(34, 41, 50));

        title.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(225, 225, 230));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Cadastro");

        labelNovoUsuario.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovoUsuario.setForeground(new java.awt.Color(225, 225, 230));
        labelNovoUsuario.setText("Novo Usuário");

        inputNovoUsuario.setBackground(new java.awt.Color(54, 63, 73));
        inputNovoUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovoUsuario.setForeground(new java.awt.Color(225, 225, 230));
        inputNovoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovoUsuario.setCaretColor(new java.awt.Color(238, 238, 238));

        labelNovoCpf.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovoCpf.setForeground(new java.awt.Color(225, 225, 230));
        labelNovoCpf.setText("CPF");

        inputNovoCpf.setBackground(new java.awt.Color(54, 63, 73));
        inputNovoCpf.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovoCpf.setForeground(new java.awt.Color(225, 225, 230));
        inputNovoCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovoCpf.setCaretColor(new java.awt.Color(238, 238, 238));

        btnCadastrar.setBackground(new java.awt.Color(54, 63, 73));
        btnCadastrar.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(225, 225, 230));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(34, 41, 50));
        btnVoltar.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(225, 225, 230));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setFocusPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        erroNovoUsuario.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroNovoUsuario.setForeground(new java.awt.Color(255, 0, 0));
        erroNovoUsuario.setText("Este Usuário já existe");

        erroNovoCpf.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroNovoCpf.setForeground(new java.awt.Color(255, 0, 0));
        erroNovoCpf.setText("Cpf inválido");

        labelNovaDataNascimento.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovaDataNascimento.setForeground(new java.awt.Color(225, 225, 230));
        labelNovaDataNascimento.setText("Data de Nascimento");

        inputNovaDataNascimento.setBackground(new java.awt.Color(54, 63, 73));
        inputNovaDataNascimento.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovaDataNascimento.setForeground(new java.awt.Color(225, 225, 230));
        inputNovaDataNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovaDataNascimento.setCaretColor(new java.awt.Color(238, 238, 238));

        erroNovaDataNascimento.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroNovaDataNascimento.setForeground(new java.awt.Color(255, 0, 0));
        erroNovaDataNascimento.setText("Data de Nascimento inválida");

        labelNovaSenha.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovaSenha.setForeground(new java.awt.Color(225, 225, 230));
        labelNovaSenha.setText("Nova Senha");

        inputNovaSenha.setBackground(new java.awt.Color(54, 63, 73));
        inputNovaSenha.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovaSenha.setForeground(new java.awt.Color(225, 225, 230));
        inputNovaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovaSenha.setCaretColor(new java.awt.Color(238, 238, 238));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelNovaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNovaDataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(erroNovoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroNovaDataNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNovoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNovoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNovoCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNovoCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNovaDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNovaSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(erroNovoCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelNovoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroNovoUsuario)
                .addGap(18, 18, 18)
                .addComponent(labelNovoCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroNovoCpf)
                .addGap(18, 18, 18)
                .addComponent(labelNovaDataNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovaDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroNovaDataNascimento)
                .addGap(18, 18, 18)
                .addComponent(labelNovaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (cadastro.autenticacaoUsuario(inputNovoUsuario.getText())) {
            
            erroNovoUsuario.setVisible(true);
            erroNovoCpf.setVisible(false);
            erroNovaDataNascimento.setVisible(false);
        } else {
            
            erroNovoUsuario.setVisible(false);
            
            try { 
                cpf = Integer.parseInt(inputNovoCpf.getText()); 
                erroNovoCpf.setVisible(false);
            } catch (NumberFormatException e) { erroNovoCpf.setVisible(true); }
            
            try { 
                dataNascimento = Integer.parseInt(inputNovaDataNascimento.getText());
                erroNovaDataNascimento.setVisible(false);
            } catch (NumberFormatException e) { erroNovaDataNascimento.setVisible(true); }
            
            try { 
                dataNascimento = Integer.parseInt(inputNovaDataNascimento.getText());
                cpf = Integer.parseInt(inputNovoCpf.getText()); 

                cadastro.setUsuario
                (inputNovoUsuario.getText(), cpf, 
                dataNascimento, inputNovaSenha.getText());
                
                dispose();
                telaLogin.setVisible(true);
            } catch (NumberFormatException e) { erroNovaDataNascimento.setVisible(true); }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // ------------------------------------------------------------------------
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
    }
    
    // ------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel erroNovaDataNascimento;
    private javax.swing.JLabel erroNovoCpf;
    private javax.swing.JLabel erroNovoUsuario;
    private javax.swing.JTextField inputNovaDataNascimento;
    private javax.swing.JTextField inputNovaSenha;
    private javax.swing.JTextField inputNovoCpf;
    private javax.swing.JTextField inputNovoUsuario;
    private javax.swing.JLabel labelNovaDataNascimento;
    private javax.swing.JLabel labelNovaSenha;
    private javax.swing.JLabel labelNovoCpf;
    private javax.swing.JLabel labelNovoUsuario;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------
}
