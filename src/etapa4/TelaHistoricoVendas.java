package etapa4;

import javax.swing.table.DefaultTableModel;

public class TelaHistoricoVendas extends javax.swing.JFrame {


    public TelaHistoricoVendas() {
        initComponents();
        carregarTabelaVendas();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFieldBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CoffiSystem");

        tblVendas.setBackground(new java.awt.Color(255, 255, 255));
        tblVendas.setForeground(new java.awt.Color(0, 0, 0));
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Categoria", "Valor", "Quantidade", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(tblVendas);

        btnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar:");

        txtFieldBusca.setBackground(new java.awt.Color(204, 204, 204));
        txtFieldBusca.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Histórico de Vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldBusca))
                    .addComponent(btnVoltar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new MenuContabilidade().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void carregarTabelaVendas() {

    DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();
    modelo.setRowCount(0);

    VendaDAO vendaDAO = new VendaDAO();
    ProdutoDAO produtoDAO = new ProdutoDAO();
    ClienteDAO clienteDAO = new ClienteDAO();
    CategoriaDAO categoriaDAO = new CategoriaDAO();

    java.util.ArrayList<Venda> vendas = vendaDAO.listar();
    java.util.ArrayList<Produto> produtos = produtoDAO.listar();
    java.util.ArrayList<Cliente> clientes = clienteDAO.listar();
    java.util.ArrayList<Categoria> categorias = categoriaDAO.listar();

    for (Venda v : vendas) {

        String nomeProduto = "";
        String nomeCategoria = "";
        String nomeCliente = "";

        for (Produto p : produtos) {
            if (p.getIdProduto() == v.getIdProduto()) {
                nomeProduto = p.getNomeProd();

                for (Categoria c : categorias) {
                    if (c.getIdCategoria() == p.getIdCategoria()) {
                        nomeCategoria = c.getNomeCategoria();
                        break;
                    }
                }
                break;
            }
        }

        for (Cliente c : clientes) {
            if (c.getIdCliente() == v.getIdCliente()) {
                nomeCliente = c.getNome();
                break;
            }
        }

        modelo.addRow(new Object[]{
            v.getIdVenda(),
            nomeProduto,
            nomeCategoria,
            v.getValorTotal(),
            v.getQuantidade(),
            nomeCliente
        });
    }
    }
    public void buscarVendas() {

    String busca = txtFieldBusca.getText().toLowerCase();

    DefaultTableModel modelo = (DefaultTableModel) tblVendas.getModel();
    modelo.setRowCount(0);

    VendaDAO vendaDAO = new VendaDAO();
    ProdutoDAO produtoDAO = new ProdutoDAO();

    java.util.ArrayList<Venda> vendas = vendaDAO.listar();
    java.util.ArrayList<Produto> produtos = produtoDAO.listar();

    for (Venda v : vendas) {

        String nomeProduto = "";

        for (Produto p : produtos) {
            if (p.getIdProduto() == v.getIdProduto()) {
                nomeProduto = p.getNomeProd();
                break;
            }
        }

        if (nomeProduto.toLowerCase().contains(busca)) {
            modelo.addRow(new Object[]{
                v.getIdVenda(),
                nomeProduto,
                "",
                v.getValorTotal(),
                v.getQuantidade(),
                ""
            });
        }
    }
    }
   
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtFieldBusca;
    // End of variables declaration//GEN-END:variables
}
