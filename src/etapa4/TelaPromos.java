package etapa4;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPromos extends javax.swing.JFrame {


    public TelaPromos() {
        initComponents();
        carregarTabelaPromocoes();
        
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
    }
});

        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarActionPerformed(evt);
    }
});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPromo = new javax.swing.JTable();
        btnVoltarPromo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CoffiSystem");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tabela das Promoções");

        tblPromo.setBackground(new java.awt.Color(204, 204, 204));
        tblPromo.setForeground(new java.awt.Color(0, 0, 0));
        tblPromo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Porcentagem", "Validade da Promo"
            }
        ));
        jScrollPane1.setViewportView(tblPromo);

        btnVoltarPromo.setText("Voltar");
        btnVoltarPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPromoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnSalvar.setText("Salvar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(274, 274, 274))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltarPromo)
                        .addGap(115, 115, 115)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarPromo)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar))
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPromoActionPerformed
      MenuGerente menuGerente = new MenuGerente ();
      menuGerente.setVisible(true);
    }//GEN-LAST:event_btnVoltarPromoActionPerformed

    public void carregarTabelaPromocoes() {

    DefaultTableModel modelo = (DefaultTableModel) tblPromo.getModel();
    modelo.setRowCount(0);

    PromocaoDAO promoDAO = new PromocaoDAO();
    ProdutoDAO prodDAO = new ProdutoDAO();

    java.util.ArrayList<Promocao> listaPromo = promoDAO.listar();
    java.util.ArrayList<Produto> listaProd = prodDAO.listar();

    for (Promocao p : listaPromo) {

        String nomeProduto = "";

        for (Produto prod : listaProd) {
            if (prod.getIdProduto() == p.getIdProduto()) {
                nomeProduto = prod.getNomeProd();
                break;
            }
        }

        modelo.addRow(new Object[]{
            p.getIdPromocao(),
            nomeProduto,
            p.getPorcentagemDesc(),
            p.getDataValidade()
        });
    }
}
    
    private int linhaSelecionada = -1;

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
                                      
    int linha = tblPromo.getSelectedRow();

    if (linha == -1) {
        JOptionPane.showMessageDialog(null, "Selecione uma promoção!");
        return;
    }

    try {
        String porcentagemAtual = tblPromo.getValueAt(linha, 2).toString();
        String validadeAtual = tblPromo.getValueAt(linha, 3).toString();

        String novaPorcentagem = JOptionPane.showInputDialog("Nova porcentagem:", porcentagemAtual);
        String novaValidade = JOptionPane.showInputDialog("Nova validade:", validadeAtual);

        if (novaPorcentagem != null && novaValidade != null) {

        tblPromo.setValueAt(Double.parseDouble(novaPorcentagem), linha, 2);
        tblPromo.setValueAt(novaValidade, linha, 3);

        JOptionPane.showMessageDialog(null, "Valores alterados! Clique em SALVAR para confirmar.");

        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Valor inválido!");
    }
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    
    int linha = tblPromo.getSelectedRow();

    if (linha == -1) {
        JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        return;
    }

    try {
        int id = Integer.parseInt(tblPromo.getValueAt(linha, 0).toString());
        double porcentagem = Double.parseDouble(tblPromo.getValueAt(linha, 2).toString());
        String validade = tblPromo.getValueAt(linha, 3).toString();

        Promocao p = new Promocao(id, 0, porcentagem, validade);

        PromocaoDAO dao = new PromocaoDAO();
        dao.atualizar(p);

        JOptionPane.showMessageDialog(null, "Promoção atualizada com sucesso!");

        carregarTabelaPromocoes();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar!");
    }
}
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltarPromo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPromo;
    // End of variables declaration//GEN-END:variables
}
