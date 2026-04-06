package etapa3;

import javax.swing.JOptionPane;

public class CadastroPromos extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPromos
     */
    public CadastroPromos() {
        initComponents();
        carregarProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPorcentagem = new javax.swing.JTextField();
        txtValidadePromo = new javax.swing.JTextField();
        comboPromo = new javax.swing.JComboBox<>();
        btnCadastrarPromo = new javax.swing.JButton();
        btnVerPromo = new javax.swing.JButton();
        btnVoltarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CoffiSystem");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cadastro de Promoções");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Produto:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Porcentagem de desconto (%):");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Validade da Promoção:");

        txtPorcentagem.setBackground(new java.awt.Color(204, 204, 204));
        txtPorcentagem.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPorcentagem.setForeground(new java.awt.Color(0, 0, 0));
        txtPorcentagem.setBorder(null);

        txtValidadePromo.setBackground(new java.awt.Color(204, 204, 204));
        txtValidadePromo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtValidadePromo.setForeground(new java.awt.Color(0, 0, 0));
        txtValidadePromo.setBorder(null);

        comboPromo.setBackground(new java.awt.Color(204, 204, 204));
        comboPromo.setForeground(new java.awt.Color(0, 0, 0));

        btnCadastrarPromo.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrarPromo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnCadastrarPromo.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrarPromo.setText("Cadastrar");
        btnCadastrarPromo.setBorder(null);
        btnCadastrarPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPromoActionPerformed(evt);
            }
        });

        btnVerPromo.setBackground(new java.awt.Color(204, 204, 204));
        btnVerPromo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnVerPromo.setForeground(new java.awt.Color(0, 0, 0));
        btnVerPromo.setText("Ver");
        btnVerPromo.setBorder(null);
        btnVerPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPromoActionPerformed(evt);
            }
        });

        btnVoltarLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltarLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltarLogin.setText("Voltar");
        btnVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltarLogin)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPorcentagem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValidadePromo)
                            .addComponent(comboPromo, 0, 231, Short.MAX_VALUE))
                        .addGap(182, 182, 182))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(274, 274, 274))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(263, 263, 263))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrarPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnVerPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtValidadePromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarPromo)
                    .addComponent(btnVerPromo)
                    .addComponent(btnVoltarLogin))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPromoActionPerformed

    try {
        
        double porcentagem = Double.parseDouble(txtPorcentagem.getText());
        String validade = txtValidadePromo.getText();
        Produto produtoSelecionado = (Produto) comboPromo.getSelectedItem();
        int idProduto = produtoSelecionado.getIdProduto();
        int id = Dados.listaPromocoes.size() + 1;

        Promocao promo = new Promocao(
                id,
                idProduto,
                porcentagem,
                validade
        );

        Dados.listaPromocoes.add(promo);

        JOptionPane.showMessageDialog(null, "Promoção cadastrada com sucesso!");
        
        txtPorcentagem.setText("");
        txtValidadePromo.setText("");
        comboPromo.setSelectedIndex(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar promoção!");
    }
    }//GEN-LAST:event_btnCadastrarPromoActionPerformed

    private void btnVerPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPromoActionPerformed
        TelaPromos tela = new TelaPromos();
        tela.setVisible(true);
    }//GEN-LAST:event_btnVerPromoActionPerformed

    private void btnVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLoginActionPerformed
        new MenuGerente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarLoginActionPerformed

    public void carregarProdutos() {
    comboPromo.removeAllItems();

    for (Produto p : Dados.listaProdutos) {
        comboPromo.addItem(p);
    }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPromo;
    private javax.swing.JButton btnVerPromo;
    private javax.swing.JButton btnVoltarLogin;
    private javax.swing.JComboBox<Produto> comboPromo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPorcentagem;
    private javax.swing.JTextField txtValidadePromo;
    // End of variables declaration//GEN-END:variables
}
