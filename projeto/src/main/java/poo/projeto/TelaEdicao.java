package poo.projeto;

import poo.projeto.src.Cadastro;
import poo.projeto.src.Financiamento;

public class TelaEdicao extends javax.swing.JFrame {
    public String nome, fabricante;
    public float valor;
    
    Main telaLogin;
    TelaCatalogo telaCatalogo;
    TelaFinanciamento telaFinanciamento;
    
    Financiamento financiamento;    
    Cadastro cadastro;
    
    public TelaEdicao() {
        initComponents();
        
        cadastro = new Cadastro();
        
        if (cadastro.getCurrentUser() != null) {
            nameUsuario.setText("Olá, " + cadastro.getCurrentUser());
        }
        
        removerElementos();
    }

    // ------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        navigation = new javax.swing.JPanel();
        iconUsuario = new javax.swing.JLabel();
        nameUsuario = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnEdicao = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFinanciamento = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        comboBoxVeiculo = new javax.swing.JComboBox<>();
        inputNomeVeiculo = new javax.swing.JTextField();
        inputNovoNomeVeiculo = new javax.swing.JTextField();
        labelNomeVeiculo = new javax.swing.JLabel();
        labelNovoNomeVeiculo = new javax.swing.JLabel();
        erroNomeVeiculo = new javax.swing.JLabel();
        erroNovoNomeVeiculo = new javax.swing.JLabel();
        labelNovaFabricante = new javax.swing.JLabel();
        inputNovaFabricante = new javax.swing.JTextField();
        labelNovoValor = new javax.swing.JLabel();
        inputNovoValor = new javax.swing.JTextField();
        erroNovoValor = new javax.swing.JLabel();
        btnVerificarVeiculo = new javax.swing.JButton();
        btnSalvarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 550));
        setMinimumSize(new java.awt.Dimension(600, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 550));

        background.setBackground(new java.awt.Color(34, 41, 50));
        background.setMaximumSize(new java.awt.Dimension(900, 550));
        background.setMinimumSize(new java.awt.Dimension(900, 550));
        background.setPreferredSize(new java.awt.Dimension(900, 550));

        navigation.setBackground(new java.awt.Color(21, 25, 28));
        navigation.setMaximumSize(new java.awt.Dimension(150, 550));
        navigation.setMinimumSize(new java.awt.Dimension(150, 550));

        iconUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        iconUsuario.setForeground(new java.awt.Color(225, 225, 230));
        iconUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUsuario.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/60/e1e1e6/user--v1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        iconUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iconUsuario.setIconTextGap(10);

        nameUsuario.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        nameUsuario.setForeground(new java.awt.Color(225, 225, 230));
        nameUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameUsuario.setText("Olá, User");
        nameUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nameUsuario.setIconTextGap(10);

        btnHome.setBackground(new java.awt.Color(21, 25, 28));
        btnHome.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(225, 225, 230));
        btnHome.setText("Home");
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setFocusPainted(false);
        btnHome.setIconTextGap(10);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnEdicao.setBackground(new java.awt.Color(34, 41, 50));
        btnEdicao.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnEdicao.setForeground(new java.awt.Color(225, 225, 230));
        btnEdicao.setText("Edição");
        btnEdicao.setBorder(null);
        btnEdicao.setBorderPainted(false);
        btnEdicao.setFocusPainted(false);
        btnEdicao.setIconTextGap(10);

        btnLogin.setBackground(new java.awt.Color(21, 25, 28));
        btnLogin.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(225, 225, 230));
        btnLogin.setText("Sair");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setIconTextGap(10);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright©️ 2023");

        btnFinanciamento.setBackground(new java.awt.Color(21, 25, 28));
        btnFinanciamento.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnFinanciamento.setForeground(new java.awt.Color(225, 225, 230));
        btnFinanciamento.setText("Financiamento");
        btnFinanciamento.setBorder(null);
        btnFinanciamento.setBorderPainted(false);
        btnFinanciamento.setFocusPainted(false);
        btnFinanciamento.setIconTextGap(10);
        btnFinanciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanciamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationLayout = new javax.swing.GroupLayout(navigation);
        navigation.setLayout(navigationLayout);
        navigationLayout.setHorizontalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nameUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btnFinanciamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigationLayout.setVerticalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iconUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameUsuario)
                .addGap(50, 50, 50)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinanciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        title1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(225, 225, 230));
        title1.setText("Edição de Veículos");

        comboBoxVeiculo.setBackground(new java.awt.Color(54, 63, 73));
        comboBoxVeiculo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        comboBoxVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        comboBoxVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adicionar", "Editar", "Remover" }));
        comboBoxVeiculo.setBorder(null);

        inputNomeVeiculo.setBackground(new java.awt.Color(54, 63, 73));
        inputNomeVeiculo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNomeVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        inputNomeVeiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNomeVeiculo.setCaretColor(new java.awt.Color(238, 238, 238));

        inputNovoNomeVeiculo.setBackground(new java.awt.Color(54, 63, 73));
        inputNovoNomeVeiculo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovoNomeVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        inputNovoNomeVeiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovoNomeVeiculo.setCaretColor(new java.awt.Color(238, 238, 238));

        labelNomeVeiculo.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNomeVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        labelNomeVeiculo.setText("Nome ou ID do Veículo");

        labelNovoNomeVeiculo.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovoNomeVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        labelNovoNomeVeiculo.setText("Novo Nome");

        erroNomeVeiculo.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroNomeVeiculo.setForeground(new java.awt.Color(255, 0, 0));
        erroNomeVeiculo.setText("Nenhum erro..");

        erroNovoNomeVeiculo.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroNovoNomeVeiculo.setForeground(new java.awt.Color(255, 0, 0));
        erroNovoNomeVeiculo.setText("Nenhum erro..");

        labelNovaFabricante.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovaFabricante.setForeground(new java.awt.Color(225, 225, 230));
        labelNovaFabricante.setText("Nova Fabricante");

        inputNovaFabricante.setBackground(new java.awt.Color(54, 63, 73));
        inputNovaFabricante.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovaFabricante.setForeground(new java.awt.Color(225, 225, 230));
        inputNovaFabricante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovaFabricante.setCaretColor(new java.awt.Color(238, 238, 238));

        labelNovoValor.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelNovoValor.setForeground(new java.awt.Color(225, 225, 230));
        labelNovoValor.setText("Novo Valor");

        inputNovoValor.setBackground(new java.awt.Color(54, 63, 73));
        inputNovoValor.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputNovoValor.setForeground(new java.awt.Color(225, 225, 230));
        inputNovoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputNovoValor.setCaretColor(new java.awt.Color(238, 238, 238));

        erroNovoValor.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        erroNovoValor.setForeground(new java.awt.Color(255, 0, 0));
        erroNovoValor.setText("Nenhum erro..");

        btnVerificarVeiculo.setBackground(new java.awt.Color(54, 63, 73));
        btnVerificarVeiculo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnVerificarVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        btnVerificarVeiculo.setText("Verificar");
        btnVerificarVeiculo.setBorder(null);
        btnVerificarVeiculo.setBorderPainted(false);
        btnVerificarVeiculo.setFocusPainted(false);
        btnVerificarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarVeiculoActionPerformed(evt);
            }
        });

        btnSalvarVeiculo.setBackground(new java.awt.Color(54, 63, 73));
        btnSalvarVeiculo.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        btnSalvarVeiculo.setForeground(new java.awt.Color(225, 225, 230));
        btnSalvarVeiculo.setText("Salvar Alterações");
        btnSalvarVeiculo.setBorder(null);
        btnSalvarVeiculo.setBorderPainted(false);
        btnSalvarVeiculo.setFocusPainted(false);
        btnSalvarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(inputNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNovoNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNovoNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroNovoNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNovaFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNovaFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title1)
                .addGap(15, 15, 15)
                .addComponent(labelNomeVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroNomeVeiculo)
                .addGap(18, 18, 18)
                .addComponent(labelNovoNomeVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovoNomeVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroNovoNomeVeiculo)
                .addGap(18, 18, 18)
                .addComponent(labelNovaFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovaFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNovoValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroNovoValor)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // ------------------------------------------------------------------------
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        telaLogin = new Main();
        this.dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        telaCatalogo = new TelaCatalogo();
        this.dispose();
        telaCatalogo.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnFinanciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanciamentoActionPerformed
        telaFinanciamento = new TelaFinanciamento();
        this.dispose();
        telaFinanciamento.setVisible(true);
    }//GEN-LAST:event_btnFinanciamentoActionPerformed

    private void btnVerificarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarVeiculoActionPerformed
        switch (String.valueOf(comboBoxVeiculo.getSelectedItem())) {
            case "Adicionar" -> {
                addVeiculo();
                break;
            } case "Editar" -> {
                edVeiculo();
                break;
            } case "Remover" -> {
                remVeiculo();
                break;
            }   
            default -> throw new AssertionError();
        }
    }//GEN-LAST:event_btnVerificarVeiculoActionPerformed

    private void btnSalvarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarVeiculoActionPerformed
        switch (String.valueOf(comboBoxVeiculo.getSelectedItem())) {
            case "Adicionar" -> {
                salvarAddVeiculo();
            } case "Editar" -> {
                salvarEdVeiculo();
                break;
            } case "Remover" -> {
                salvarRemVeiculo();
                break;
            }
            default -> throw new AssertionError();
        }
    }//GEN-LAST:event_btnSalvarVeiculoActionPerformed

    /*    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaEdicao().setVisible(true);
        });
    }
    */
    
    private void removerElementos() {
        erroNomeVeiculo.setVisible(false);
        erroNovoNomeVeiculo.setVisible(false);
        erroNovoValor.setVisible(false);
        labelNovoNomeVeiculo.setVisible(false);
        inputNovoNomeVeiculo.setVisible(false);
        labelNovaFabricante.setVisible(false);
        inputNovaFabricante.setVisible(false);
        labelNovoValor.setVisible(false);
        inputNovoValor.setVisible(false);
        btnSalvarVeiculo.setVisible(false);
    }
    
    private void addVeiculo() {
        
        if (!Financiamento.verificacao(inputNomeVeiculo.getText())) {
            
            labelNovoNomeVeiculo.setVisible(true);
            inputNovoNomeVeiculo.setVisible(true);
            labelNovaFabricante.setVisible(true);
            inputNovaFabricante.setVisible(true);
            labelNovoValor.setVisible(true);
            inputNovoValor.setVisible(true);
            btnSalvarVeiculo.setVisible(true);
            
            erroNomeVeiculo.setVisible(false);
            erroNovoNomeVeiculo.setVisible(false);
            erroNovoValor.setVisible(false);
        } else {
            erroNomeVeiculo.setVisible(true);
            erroNomeVeiculo.setText("Este Veículo já Existe");
        }
    }
    
    private void salvarAddVeiculo() {
        if (!Financiamento.verificacao(inputNovoNomeVeiculo.getText())) {
            erroNovoNomeVeiculo.setVisible(false);
            
            try {
                nome = inputNovoNomeVeiculo.getText();
                fabricante = inputNovaFabricante.getText();
                valor = Float.parseFloat(inputNovoValor.getText());
                financiamento = new Financiamento(nome, fabricante, valor);
                Financiamento.insert(financiamento);
                
                erroNovoValor.setVisible(false);
            }   catch (NumberFormatException e) {
                erroNovoValor.setVisible(true);
                erroNovoValor.setText("Valor inválido");
            }          
        } else {
            erroNovoNomeVeiculo.setVisible(true);
            erroNovoNomeVeiculo.setText("Este Veículo já Existe");
        }
    }
    
    private void edVeiculo() {
        if (Financiamento.verificacao(inputNomeVeiculo.getText())) {
            
            labelNovoNomeVeiculo.setVisible(false);
            inputNovoNomeVeiculo.setVisible(false);
            labelNovaFabricante.setVisible(true);
            inputNovaFabricante.setVisible(true);
            labelNovoValor.setVisible(true);
            inputNovoValor.setVisible(true);
            btnSalvarVeiculo.setVisible(true);
            
            erroNomeVeiculo.setVisible(false);
            erroNovoNomeVeiculo.setVisible(false);
            erroNovoValor.setVisible(false);
        } else {
            erroNomeVeiculo.setVisible(true);
            erroNomeVeiculo.setText("Este Veículo não Existe");
        }
    }
    
    private void salvarEdVeiculo() {
        if (Financiamento.verificacao(inputNomeVeiculo.getText())) {
            erroNomeVeiculo.setVisible(false);
            
            try {                
                nome = inputNovoNomeVeiculo.getText();
                fabricante = inputNovaFabricante.getText();
                valor = Float.parseFloat(inputNovoValor.getText());
                Financiamento.edit(nome, fabricante, valor);
                
                erroNovoValor.setVisible(false);
            }   catch (NumberFormatException e) {
                erroNovoValor.setVisible(true);
                erroNovoValor.setText("Valor inválido");
            }          
        } else {
            erroNomeVeiculo.setVisible(true);
            erroNomeVeiculo.setText("Este Veículo não Existe");
        }
    }
    
    private void remVeiculo() {
        if (Financiamento.verificacao(inputNomeVeiculo.getText())) {
            
            labelNovoNomeVeiculo.setVisible(false);
            inputNovoNomeVeiculo.setVisible(false);
            labelNovaFabricante.setVisible(false);
            inputNovaFabricante.setVisible(false);
            labelNovoValor.setVisible(false);
            inputNovoValor.setVisible(false);
            btnSalvarVeiculo.setVisible(true);
            
            erroNomeVeiculo.setVisible(false);
            erroNovoNomeVeiculo.setVisible(false);
            erroNovoValor.setVisible(false);
        } else {
            erroNomeVeiculo.setVisible(true);
            erroNomeVeiculo.setText("Este Veículo não Existe");
        }
    }
    
    private void salvarRemVeiculo() {
        if (Financiamento.verificacao(inputNomeVeiculo.getText())) {
            erroNomeVeiculo.setVisible(false);

            Financiamento.remove(inputNomeVeiculo.getText());
        } else {
            erroNomeVeiculo.setVisible(true);
            erroNomeVeiculo.setText("Este Veículo não Existe");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private static javax.swing.JButton btnEdicao;
    private javax.swing.JButton btnFinanciamento;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalvarVeiculo;
    private javax.swing.JButton btnVerificarVeiculo;
    private javax.swing.JComboBox<String> comboBoxVeiculo;
    private javax.swing.JLabel erroNomeVeiculo;
    private javax.swing.JLabel erroNovoNomeVeiculo;
    private javax.swing.JLabel erroNovoValor;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JTextField inputNomeVeiculo;
    private javax.swing.JTextField inputNovaFabricante;
    private javax.swing.JTextField inputNovoNomeVeiculo;
    private javax.swing.JTextField inputNovoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelNomeVeiculo;
    private javax.swing.JLabel labelNovaFabricante;
    private javax.swing.JLabel labelNovoNomeVeiculo;
    private javax.swing.JLabel labelNovoValor;
    private javax.swing.JLabel nameUsuario;
    private javax.swing.JPanel navigation;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables

}
