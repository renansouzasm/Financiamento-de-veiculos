package poo.projeto;

import poo.projeto.src.Cadastro;
import poo.projeto.src.Financiamento;

public class TelaFinanciamento extends javax.swing.JFrame {

    Main telaLogin;
    TelaEdicao telaEdicao;
    Cadastro cadastro;
    TelaCatalogo telaCatalogo;
    Financiamento financiamento;
    
    int parcela, valorEntrada;
    double resultado;
    
    // ------------------------------------------------------------------------
    
    public TelaFinanciamento() {
        initComponents();
        
        cadastro = new Cadastro();
        telaEdicao = new TelaEdicao();
        financiamento = new Financiamento();
        telaCatalogo = new TelaCatalogo();
        
        nameUsuario.setText("Olá, " + Cadastro.getUsuario());        
        if (!Financiamento.veiculoEscolhido.isEmpty()) {
            labelVeiculoEscolhido.setText(String.valueOf(Financiamento.veiculoEscolhido));
        }
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
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        cardExtra1 = new javax.swing.JPanel();
        labelVeiculoEscolhido = new javax.swing.JLabel();
        labelParcelas = new javax.swing.JLabel();
        comboBoxParcela = new javax.swing.JComboBox<>();
        cardExtra2 = new javax.swing.JPanel();
        labelFinanciamento = new javax.swing.JLabel();
        labelValorEntrada = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        comboBoxValorEntrada = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 550));
        setMinimumSize(new java.awt.Dimension(900, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 550));

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

        btnEdicao.setBackground(new java.awt.Color(21, 25, 28));
        btnEdicao.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnEdicao.setForeground(new java.awt.Color(225, 225, 230));
        btnEdicao.setText("Edição");
        btnEdicao.setBorder(null);
        btnEdicao.setBorderPainted(false);
        btnEdicao.setFocusPainted(false);
        btnEdicao.setIconTextGap(10);
        btnEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdicaoActionPerformed(evt);
            }
        });

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

        btnFinanciamento.setBackground(new java.awt.Color(34, 41, 50));
        btnFinanciamento.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnFinanciamento.setForeground(new java.awt.Color(225, 225, 230));
        btnFinanciamento.setText("Financiamento");
        btnFinanciamento.setBorder(null);
        btnFinanciamento.setBorderPainted(false);
        btnFinanciamento.setFocusPainted(false);
        btnFinanciamento.setIconTextGap(10);

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

        title.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(225, 225, 230));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Financiamento de Veículos");

        subtitle.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        subtitle.setForeground(new java.awt.Color(225, 225, 230));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle.setText("Veja as opções de Entrada e Pracelamento para Financiar seu Veículo");

        cardExtra1.setBackground(new java.awt.Color(54, 63, 73));

        labelVeiculoEscolhido.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelVeiculoEscolhido.setForeground(new java.awt.Color(225, 225, 230));
        labelVeiculoEscolhido.setText("Nenhum Veículo selecionado..");

        javax.swing.GroupLayout cardExtra1Layout = new javax.swing.GroupLayout(cardExtra1);
        cardExtra1.setLayout(cardExtra1Layout);
        cardExtra1Layout.setHorizontalGroup(
            cardExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardExtra1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVeiculoEscolhido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardExtra1Layout.setVerticalGroup(
            cardExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardExtra1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVeiculoEscolhido, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelParcelas.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelParcelas.setForeground(new java.awt.Color(225, 225, 230));
        labelParcelas.setText("Parcelas");

        comboBoxParcela.setBackground(new java.awt.Color(54, 63, 73));
        comboBoxParcela.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        comboBoxParcela.setForeground(new java.awt.Color(225, 225, 230));
        comboBoxParcela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À Vista", "3 Vezes", "6 Vezes", "12 Vezes", "24 Vezes" }));
        comboBoxParcela.setBorder(null);

        cardExtra2.setBackground(new java.awt.Color(54, 63, 73));

        labelFinanciamento.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        labelFinanciamento.setForeground(new java.awt.Color(225, 225, 230));
        labelFinanciamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFinanciamento.setText("Você ainda não realizou um Financiamento..");

        javax.swing.GroupLayout cardExtra2Layout = new javax.swing.GroupLayout(cardExtra2);
        cardExtra2.setLayout(cardExtra2Layout);
        cardExtra2Layout.setHorizontalGroup(
            cardExtra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardExtra2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFinanciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardExtra2Layout.setVerticalGroup(
            cardExtra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardExtra2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFinanciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelValorEntrada.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        labelValorEntrada.setForeground(new java.awt.Color(225, 225, 230));
        labelValorEntrada.setText("Valor de Entrada");

        btnCalcular.setBackground(new java.awt.Color(54, 63, 73));
        btnCalcular.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(225, 225, 230));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setFocusPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        comboBoxValorEntrada.setBackground(new java.awt.Color(54, 63, 73));
        comboBoxValorEntrada.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        comboBoxValorEntrada.setForeground(new java.awt.Color(225, 225, 230));
        comboBoxValorEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Até R$ 1.000,00", "R$ 2.000,00", "R$ 5.000,00", "R$ 8.000,00", "R$ 10.000,00" }));
        comboBoxValorEntrada.setBorder(null);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cardExtra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cardExtra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle)
                .addGap(18, 18, 18)
                .addComponent(cardExtra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorEntrada)
                    .addComponent(labelParcelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardExtra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        dispose();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        imprimirFinanciamento();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        dispose();
        telaCatalogo.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdicaoActionPerformed
        if (Cadastro.getUsuario().equals("adm")) {
            dispose();
            telaEdicao.setVisible(true);
        }
    }//GEN-LAST:event_btnEdicaoActionPerformed

    // ------------------------------------------------------------------------
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaFinanciamento().setVisible(true);
        });
    }
    
    // ------------------------------------------------------------------------
    
    private void imprimirFinanciamento() {
        try {       
            valorEntrada = comboBoxValorEntrada.getSelectedIndex();
            parcela = comboBoxParcela.getSelectedIndex();
        
            resultado = Financiamento.calculoFinanciamento(parcela, valorEntrada);
        
            labelFinanciamento.setText("Valor Final R$ " + String.valueOf(resultado));
        } catch (NumberFormatException e) {}
    }
    
    // ------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCalcular;
    private static javax.swing.JButton btnEdicao;
    private javax.swing.JButton btnFinanciamento;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel cardExtra1;
    private javax.swing.JPanel cardExtra2;
    private javax.swing.JComboBox<String> comboBoxParcela;
    private javax.swing.JComboBox<String> comboBoxValorEntrada;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelFinanciamento;
    private javax.swing.JLabel labelParcelas;
    private javax.swing.JLabel labelValorEntrada;
    private javax.swing.JLabel labelVeiculoEscolhido;
    private javax.swing.JLabel nameUsuario;
    private javax.swing.JPanel navigation;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    // ------------------------------------------------------------------------

}
