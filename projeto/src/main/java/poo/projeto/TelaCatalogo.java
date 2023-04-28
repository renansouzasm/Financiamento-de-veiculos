package poo.projeto;

import javax.swing.JOptionPane;
import poo.projeto.src.Financiamento;
import poo.projeto.src.Cadastro;

public class TelaCatalogo extends javax.swing.JFrame {
    
    Main telaLogin;
    TelaFinanciamento telaFinanciamento;
    TelaEdicao telaEdicao;
    Cadastro cadastro;
    Financiamento financiamento;
    String infoVeiculo;
    int indice;
    
    // ------------------------------------------------------------------------
    
    public TelaCatalogo() {  
        initComponents(); 
        financiamento = new Financiamento();
        cadastro = new Cadastro();
        imprimirCatalogo();
    }
    
    // ------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        navigation = new javax.swing.JPanel();
        iconUsuario = new javax.swing.JLabel();
        nameUsuario = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnFinanciamento = new javax.swing.JButton();
        btnEdicao = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        inputAdd = new javax.swing.JTextField();
        card1 = new javax.swing.JPanel();
        cardTitle1 = new javax.swing.JLabel();
        valor1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        fabricante1 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        cardIcon1 = new javax.swing.JButton();
        card2 = new javax.swing.JPanel();
        cardTitle2 = new javax.swing.JLabel();
        valor2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        fabricante2 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        cardIcon2 = new javax.swing.JButton();
        card3 = new javax.swing.JPanel();
        cardTitle3 = new javax.swing.JLabel();
        valor3 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        fabricante3 = new javax.swing.JLabel();
        nome3 = new javax.swing.JLabel();
        cardIcon3 = new javax.swing.JButton();
        card4 = new javax.swing.JPanel();
        cardTitle4 = new javax.swing.JLabel();
        valor4 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        fabricante4 = new javax.swing.JLabel();
        nome4 = new javax.swing.JLabel();
        cardIcon4 = new javax.swing.JButton();
        card5 = new javax.swing.JPanel();
        cardTitle5 = new javax.swing.JLabel();
        valor5 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        fabricante5 = new javax.swing.JLabel();
        nome5 = new javax.swing.JLabel();
        cardIcon5 = new javax.swing.JButton();
        card6 = new javax.swing.JPanel();
        cardTitle6 = new javax.swing.JLabel();
        valor6 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        fabricante6 = new javax.swing.JLabel();
        nome6 = new javax.swing.JLabel();
        cardIcon6 = new javax.swing.JButton();
        cardExtra1 = new javax.swing.JPanel();
        cardExtra2 = new javax.swing.JPanel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        setResizable(false);

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

        btnHome.setBackground(new java.awt.Color(34, 41, 50));
        btnHome.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(225, 225, 230));
        btnHome.setText("Home");
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setFocusPainted(false);
        btnHome.setIconTextGap(10);

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

        javax.swing.GroupLayout navigationLayout = new javax.swing.GroupLayout(navigation);
        navigation.setLayout(navigationLayout);
        navigationLayout.setHorizontalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nameUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFinanciamento, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btnEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        title.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(225, 225, 230));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Catálogo de Veículos");

        subtitle.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        subtitle.setForeground(new java.awt.Color(225, 225, 230));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle.setText("Escolha um veículo pelo nome ou id para fazer o financiamento");

        btnAdd.setBackground(new java.awt.Color(34, 41, 50));
        btnAdd.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(225, 225, 230));
        btnAdd.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/filled-plus-2-math.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.setIconTextGap(10);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(21, 25, 28));
        jButton4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(225, 225, 230));
        jButton4.setText("Home");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setIconTextGap(10);

        inputAdd.setBackground(new java.awt.Color(54, 63, 73));
        inputAdd.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        inputAdd.setForeground(new java.awt.Color(225, 225, 230));
        inputAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        inputAdd.setCaretColor(new java.awt.Color(238, 238, 238));
        inputAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddActionPerformed(evt);
            }
        });

        card1.setBackground(new java.awt.Color(54, 63, 73));
        card1.setMaximumSize(new java.awt.Dimension(200, 210));
        card1.setPreferredSize(new java.awt.Dimension(200, 210));

        cardTitle1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cardTitle1.setForeground(new java.awt.Color(225, 225, 230));
        cardTitle1.setText("Indefinido..");
        cardTitle1.setMaximumSize(new java.awt.Dimension(75, 25));

        valor1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        valor1.setForeground(new java.awt.Color(225, 225, 230));
        valor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor1.setText("Valor R$ Indefinido..");

        id1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        id1.setForeground(new java.awt.Color(225, 225, 230));
        id1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id1.setText("ID: 1");

        fabricante1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        fabricante1.setForeground(new java.awt.Color(225, 225, 230));
        fabricante1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricante1.setText("Fabricante: Indefinido..");

        nome1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        nome1.setForeground(new java.awt.Color(225, 225, 230));
        nome1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nome1.setText("Nome: Indefinido..");

        cardIcon1.setBackground(new java.awt.Color(34, 41, 50));
        cardIcon1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/car--v1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        cardIcon1.setBorder(null);
        cardIcon1.setBorderPainted(false);
        cardIcon1.setFocusPainted(false);
        cardIcon1.setFocusable(false);

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card1Layout.createSequentialGroup()
                        .addComponent(cardTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(valor1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(id1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fabricante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(card1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(nome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        card2.setBackground(new java.awt.Color(54, 63, 73));
        card2.setMaximumSize(new java.awt.Dimension(200, 210));
        card2.setPreferredSize(new java.awt.Dimension(200, 210));

        cardTitle2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cardTitle2.setForeground(new java.awt.Color(225, 225, 230));
        cardTitle2.setText("Indefinido..");
        cardTitle2.setMaximumSize(new java.awt.Dimension(105, 50));
        cardTitle2.setPreferredSize(new java.awt.Dimension(105, 50));

        valor2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        valor2.setForeground(new java.awt.Color(225, 225, 230));
        valor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor2.setText("Valor R$ Indefinido..");

        id2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        id2.setForeground(new java.awt.Color(225, 225, 230));
        id2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id2.setText("ID: 2");

        fabricante2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        fabricante2.setForeground(new java.awt.Color(225, 225, 230));
        fabricante2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricante2.setText("Fabricante: Indefinido..");

        nome2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        nome2.setForeground(new java.awt.Color(225, 225, 230));
        nome2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nome2.setText("Nome: Indefinido..");

        cardIcon2.setBackground(new java.awt.Color(34, 41, 50));
        cardIcon2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/car--v1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        cardIcon2.setBorder(null);
        cardIcon2.setBorderPainted(false);
        cardIcon2.setFocusPainted(false);
        cardIcon2.setFocusable(false);

        javax.swing.GroupLayout card2Layout = new javax.swing.GroupLayout(card2);
        card2.setLayout(card2Layout);
        card2Layout.setHorizontalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card2Layout.createSequentialGroup()
                        .addComponent(cardTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(valor2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(id2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(fabricante2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(nome2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        card2Layout.setVerticalGroup(
            card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card2Layout.createSequentialGroup()
                .addGroup(card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(card2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricante2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        card3.setBackground(new java.awt.Color(54, 63, 73));
        card3.setMaximumSize(new java.awt.Dimension(200, 210));
        card3.setPreferredSize(new java.awt.Dimension(200, 210));

        cardTitle3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cardTitle3.setForeground(new java.awt.Color(225, 225, 230));
        cardTitle3.setText("Indefinido..");
        cardTitle3.setMaximumSize(new java.awt.Dimension(105, 50));
        cardTitle3.setPreferredSize(new java.awt.Dimension(105, 50));

        valor3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        valor3.setForeground(new java.awt.Color(225, 225, 230));
        valor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor3.setText("Valor R$ Indefinido..");

        id3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        id3.setForeground(new java.awt.Color(225, 225, 230));
        id3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id3.setText("ID: 3");

        fabricante3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        fabricante3.setForeground(new java.awt.Color(225, 225, 230));
        fabricante3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricante3.setText("Fabricante: Indefinido..");

        nome3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        nome3.setForeground(new java.awt.Color(225, 225, 230));
        nome3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nome3.setText("Nome: Indefinido..");

        cardIcon3.setBackground(new java.awt.Color(34, 41, 50));
        cardIcon3.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/car--v1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        cardIcon3.setBorder(null);
        cardIcon3.setBorderPainted(false);
        cardIcon3.setFocusPainted(false);
        cardIcon3.setFocusable(false);

        javax.swing.GroupLayout card3Layout = new javax.swing.GroupLayout(card3);
        card3.setLayout(card3Layout);
        card3Layout.setHorizontalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card3Layout.createSequentialGroup()
                        .addComponent(cardTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(valor3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(id3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(fabricante3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(nome3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        card3Layout.setVerticalGroup(
            card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card3Layout.createSequentialGroup()
                .addGroup(card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(card3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricante3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        card4.setBackground(new java.awt.Color(54, 63, 73));
        card4.setMaximumSize(new java.awt.Dimension(200, 210));
        card4.setPreferredSize(new java.awt.Dimension(200, 210));

        cardTitle4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cardTitle4.setForeground(new java.awt.Color(225, 225, 230));
        cardTitle4.setText("Indefinido..");
        cardTitle4.setMaximumSize(new java.awt.Dimension(105, 50));
        cardTitle4.setPreferredSize(new java.awt.Dimension(105, 50));

        valor4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        valor4.setForeground(new java.awt.Color(225, 225, 230));
        valor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor4.setText("Valor R$ Indefinido..");

        id4.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        id4.setForeground(new java.awt.Color(225, 225, 230));
        id4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id4.setText("ID: 4");

        fabricante4.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        fabricante4.setForeground(new java.awt.Color(225, 225, 230));
        fabricante4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricante4.setText("Fabricante: Indefinido..");

        nome4.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        nome4.setForeground(new java.awt.Color(225, 225, 230));
        nome4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nome4.setText("Nome: Indefinido..");

        cardIcon4.setBackground(new java.awt.Color(34, 41, 50));
        cardIcon4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/motorbike-helmet.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        cardIcon4.setBorder(null);
        cardIcon4.setBorderPainted(false);
        cardIcon4.setFocusPainted(false);
        cardIcon4.setFocusable(false);

        javax.swing.GroupLayout card4Layout = new javax.swing.GroupLayout(card4);
        card4.setLayout(card4Layout);
        card4Layout.setHorizontalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card4Layout.createSequentialGroup()
                        .addComponent(cardTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(valor4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(id4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(fabricante4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(nome4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        card4Layout.setVerticalGroup(
            card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card4Layout.createSequentialGroup()
                .addGroup(card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(card4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nome4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricante4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        card5.setBackground(new java.awt.Color(54, 63, 73));
        card5.setMaximumSize(new java.awt.Dimension(200, 210));
        card5.setPreferredSize(new java.awt.Dimension(200, 210));

        cardTitle5.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cardTitle5.setForeground(new java.awt.Color(225, 225, 230));
        cardTitle5.setText("Indefinido..");
        cardTitle5.setMaximumSize(new java.awt.Dimension(105, 50));
        cardTitle5.setPreferredSize(new java.awt.Dimension(105, 50));

        valor5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        valor5.setForeground(new java.awt.Color(225, 225, 230));
        valor5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor5.setText("Valor R$ Indefinido..");

        id5.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        id5.setForeground(new java.awt.Color(225, 225, 230));
        id5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id5.setText("ID: 5");

        fabricante5.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        fabricante5.setForeground(new java.awt.Color(225, 225, 230));
        fabricante5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricante5.setText("Fabricante: Indefinido..");

        nome5.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        nome5.setForeground(new java.awt.Color(225, 225, 230));
        nome5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nome5.setText("Nome: Indefinido..");

        cardIcon5.setBackground(new java.awt.Color(34, 41, 50));
        cardIcon5.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/motorbike-helmet.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        cardIcon5.setBorder(null);
        cardIcon5.setBorderPainted(false);
        cardIcon5.setFocusPainted(false);
        cardIcon5.setFocusable(false);

        javax.swing.GroupLayout card5Layout = new javax.swing.GroupLayout(card5);
        card5.setLayout(card5Layout);
        card5Layout.setHorizontalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card5Layout.createSequentialGroup()
                        .addComponent(cardTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(valor5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(fabricante5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(nome5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        card5Layout.setVerticalGroup(
            card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5Layout.createSequentialGroup()
                .addGroup(card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(card5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(nome5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricante5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        card6.setBackground(new java.awt.Color(54, 63, 73));
        card6.setMaximumSize(new java.awt.Dimension(200, 210));
        card6.setPreferredSize(new java.awt.Dimension(200, 210));

        cardTitle6.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cardTitle6.setForeground(new java.awt.Color(225, 225, 230));
        cardTitle6.setText("Indefinido..");
        cardTitle6.setMaximumSize(new java.awt.Dimension(105, 50));
        cardTitle6.setPreferredSize(new java.awt.Dimension(105, 50));

        valor6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        valor6.setForeground(new java.awt.Color(225, 225, 230));
        valor6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor6.setText("Valor R$ Indefinido..");

        id6.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        id6.setForeground(new java.awt.Color(225, 225, 230));
        id6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        id6.setText("ID: 6");

        fabricante6.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        fabricante6.setForeground(new java.awt.Color(225, 225, 230));
        fabricante6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fabricante6.setText("Fabricante: Indefinido..");

        nome6.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        nome6.setForeground(new java.awt.Color(225, 225, 230));
        nome6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nome6.setText("Nome: Indefinido..");

        cardIcon6.setBackground(new java.awt.Color(34, 41, 50));
        cardIcon6.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img.icons8.com/ios-glyphs/30/e1e1e6/question-mark.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        cardIcon6.setBorder(null);
        cardIcon6.setBorderPainted(false);
        cardIcon6.setFocusPainted(false);
        cardIcon6.setFocusable(false);

        javax.swing.GroupLayout card6Layout = new javax.swing.GroupLayout(card6);
        card6.setLayout(card6Layout);
        card6Layout.setHorizontalGroup(
            card6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card6Layout.createSequentialGroup()
                        .addComponent(cardTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardIcon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(valor6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(id6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(fabricante6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(nome6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        card6Layout.setVerticalGroup(
            card6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card6Layout.createSequentialGroup()
                .addGroup(card6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(card6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardIcon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(nome6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricante6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardExtra1.setBackground(new java.awt.Color(54, 63, 73));

        javax.swing.GroupLayout cardExtra1Layout = new javax.swing.GroupLayout(cardExtra1);
        cardExtra1.setLayout(cardExtra1Layout);
        cardExtra1Layout.setHorizontalGroup(
            cardExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cardExtra1Layout.setVerticalGroup(
            cardExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cardExtra2.setBackground(new java.awt.Color(54, 63, 73));

        javax.swing.GroupLayout cardExtra2Layout = new javax.swing.GroupLayout(cardExtra2);
        cardExtra2.setLayout(cardExtra2Layout);
        cardExtra2Layout.setHorizontalGroup(
            cardExtra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cardExtra2Layout.setVerticalGroup(
            cardExtra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(357, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cardExtra1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cardExtra2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(inputAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardExtra1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(card5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cardExtra2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addGap(122, 122, 122)
                        .addComponent(jButton4))
                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void inputAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddActionPerformed
        try {
            adicinarVeiculos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
        }
    }//GEN-LAST:event_inputAddActionPerformed
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        adicinarVeiculos();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFinanciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanciamentoActionPerformed
        
        telaFinanciamento = new TelaFinanciamento();
        dispose();
        telaFinanciamento.setVisible(true);
    }//GEN-LAST:event_btnFinanciamentoActionPerformed

    private void btnEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdicaoActionPerformed
        
        if (Cadastro.getUsuario().equals("adm")) {
            telaEdicao = new TelaEdicao();
            dispose();
            telaEdicao.setVisible(true);
        }
    }//GEN-LAST:event_btnEdicaoActionPerformed
    
    // ------------------------------------------------------------------------
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCatalogo().setVisible(true);
        });
    }
    
    // ------------------------------------------------------------------------
    
    private void adicinarVeiculos() {
        infoVeiculo = inputAdd.getText();
        Financiamento.setVeiculoEscolhido(infoVeiculo);
        
        inputAdd.setText("");
    }
    
    // ------------------------------------------------------------------------

    public void imprimirCatalogo() {
        if (Cadastro.getUsuario() != null) {
            nameUsuario.setText("Olá, " + Cadastro.getUsuario());
        }
        
        indice = 0;
        cardTitle1.setText(Financiamento.nomes.get(indice));
        nome1.setText("Nome: " + Financiamento.nomes.get(indice));
        fabricante1.setText("Fabricante: " + Financiamento.fabricantes.get(indice));
        valor1.setText("Valor R$ " + String.valueOf(Financiamento.valores.get(indice)));

        indice++;
        cardTitle2.setText(Financiamento.nomes.get(indice));
        nome2.setText("Nome: " + Financiamento.nomes.get(indice));
        fabricante2.setText("Fabricante: " + Financiamento.fabricantes.get(indice));
        valor2.setText("Valor R$ " + String.valueOf(Financiamento.valores.get(indice)));
        
        indice++;
        cardTitle3.setText(Financiamento.nomes.get(indice));
        nome3.setText("Nome: " + Financiamento.nomes.get(indice));
        fabricante3.setText("Fabricante: " + Financiamento.fabricantes.get(indice));
        valor3.setText("Valor R$ " + String.valueOf(Financiamento.valores.get(indice)));
        
        indice++;
        cardTitle4.setText(Financiamento.nomes.get(indice));
        nome4.setText("Nome: " + Financiamento.nomes.get(indice));
        fabricante4.setText("Fabricante: " + Financiamento.fabricantes.get(indice));
        valor4.setText("Valor R$ " + String.valueOf(Financiamento.valores.get(indice)));
        
        indice++;
        cardTitle5.setText(Financiamento.nomes.get(indice));
        nome5.setText("Nome: " + Financiamento.nomes.get(indice));
        fabricante5.setText("Fabricante: " + Financiamento.fabricantes.get(indice));
        valor5.setText("Valor R$ " + String.valueOf(Financiamento.valores.get(indice)));
        
        if (Financiamento.nomes.size() == 6) {
            indice++;
            cardTitle6.setText(Financiamento.nomes.get(indice));
            nome6.setText("Nome: " + Financiamento.nomes.get(indice));
            fabricante6.setText("Fabricante: " + Financiamento.fabricantes.get(indice));
            valor6.setText("Valor R$ " + String.valueOf(Financiamento.valores.get(indice)));
        }
    }
    
    // ------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAdd;
    private static javax.swing.JButton btnEdicao;
    private javax.swing.JButton btnFinanciamento;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JPanel card5;
    private javax.swing.JPanel card6;
    private javax.swing.JPanel cardExtra1;
    private javax.swing.JPanel cardExtra2;
    private javax.swing.JButton cardIcon1;
    private javax.swing.JButton cardIcon2;
    private javax.swing.JButton cardIcon3;
    private javax.swing.JButton cardIcon4;
    private javax.swing.JButton cardIcon5;
    private javax.swing.JButton cardIcon6;
    public javax.swing.JLabel cardTitle1;
    public javax.swing.JLabel cardTitle2;
    public javax.swing.JLabel cardTitle3;
    public javax.swing.JLabel cardTitle4;
    public javax.swing.JLabel cardTitle5;
    public javax.swing.JLabel cardTitle6;
    public javax.swing.JLabel fabricante1;
    public javax.swing.JLabel fabricante2;
    public javax.swing.JLabel fabricante3;
    public javax.swing.JLabel fabricante4;
    public javax.swing.JLabel fabricante5;
    public javax.swing.JLabel fabricante6;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JTextField inputAdd;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nameUsuario;
    private javax.swing.JPanel navigation;
    public javax.swing.JLabel nome1;
    public javax.swing.JLabel nome2;
    public javax.swing.JLabel nome3;
    public javax.swing.JLabel nome4;
    public javax.swing.JLabel nome5;
    public javax.swing.JLabel nome6;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    public javax.swing.JLabel valor1;
    public javax.swing.JLabel valor2;
    public javax.swing.JLabel valor3;
    public javax.swing.JLabel valor4;
    public javax.swing.JLabel valor5;
    public javax.swing.JLabel valor6;
    // End of variables declaration//GEN-END:variables
    
    // ------------------------------------------------------------------------
}
