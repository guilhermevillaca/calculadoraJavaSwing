package calculadora;

import java.util.Objects;

/**
 *
 * @author villaca
 */
public class tela extends javax.swing.JFrame {

    Integer primeiroValor;
    Integer segundoValor;
    Integer resultado;
    String operacao;

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        telaCalculadora = new javax.swing.JTextField();
        botaoTres = new javax.swing.JButton();
        botaoVirgula = new javax.swing.JButton();
        botaoDois = new javax.swing.JButton();
        botaoUm = new javax.swing.JButton();
        botaoZero = new javax.swing.JButton();
        botaoPorcento = new javax.swing.JButton();
        botaoMenos = new javax.swing.JButton();
        botaoMais = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botaoQuatro = new javax.swing.JButton();
        botaoCinco = new javax.swing.JButton();
        botaoSeis = new javax.swing.JButton();
        botaoMultiplicar = new javax.swing.JButton();
        botaoSete = new javax.swing.JButton();
        botaoOito = new javax.swing.JButton();
        botaoNove = new javax.swing.JButton();
        botaoDividir = new javax.swing.JButton();
        botaoLimpa = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaCalculadoraActionPerformed(evt);
            }
        });

        botaoTres.setText("3");
        botaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTresActionPerformed(evt);
            }
        });

        botaoVirgula.setText(",");
        botaoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVirgulaActionPerformed(evt);
            }
        });

        botaoDois.setText("2");
        botaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoisActionPerformed(evt);
            }
        });

        botaoUm.setText("1");
        botaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUmActionPerformed(evt);
            }
        });

        botaoZero.setText("0");
        botaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZeroActionPerformed(evt);
            }
        });

        botaoPorcento.setText("%");
        botaoPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPorcentoActionPerformed(evt);
            }
        });

        botaoMenos.setText("-");
        botaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenosActionPerformed(evt);
            }
        });

        botaoMais.setText("+");
        botaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisActionPerformed(evt);
            }
        });

        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        botaoQuatro.setText("4");
        botaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuatroActionPerformed(evt);
            }
        });

        botaoCinco.setText("5");
        botaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCincoActionPerformed(evt);
            }
        });

        botaoSeis.setText("6");
        botaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeisActionPerformed(evt);
            }
        });

        botaoMultiplicar.setText("x");
        botaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicarActionPerformed(evt);
            }
        });

        botaoSete.setText("7");
        botaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSeteActionPerformed(evt);
            }
        });

        botaoOito.setText("8");
        botaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOitoActionPerformed(evt);
            }
        });

        botaoNove.setText("9");
        botaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNoveActionPerformed(evt);
            }
        });

        botaoDividir.setText("/");
        botaoDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDividirActionPerformed(evt);
            }
        });

        botaoLimpa.setText("AC");
        botaoLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telaCalculadora)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(botaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(botaoLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telaCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaCalculadoraActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_telaCalculadoraActionPerformed

    private void botaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTresActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "3");
    }//GEN-LAST:event_botaoTresActionPerformed

    private void botaoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVirgulaActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + ",");
    }//GEN-LAST:event_botaoVirgulaActionPerformed

    private void botaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoisActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "2");
    }//GEN-LAST:event_botaoDoisActionPerformed

    private void botaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUmActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "1");
    }//GEN-LAST:event_botaoUmActionPerformed

    private void botaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZeroActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "0");
    }//GEN-LAST:event_botaoZeroActionPerformed

    private void botaoPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPorcentoActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "%");
    }//GEN-LAST:event_botaoPorcentoActionPerformed

    private void botaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenosActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "-");
        operacao = "-";
        if (Objects.isNull(primeiroValor)) {
            primeiroValor = Integer.valueOf(numeroEmTela);
        } 
    }//GEN-LAST:event_botaoMenosActionPerformed

    private void botaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "+");
        operacao = "+";
        if (Objects.isNull(primeiroValor)) {
            primeiroValor = Integer.valueOf(numeroEmTela);
        } 


    }//GEN-LAST:event_botaoMaisActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        // Ação de calcular
        String numeroEmTela = telaCalculadora.getText();
        String split = numeroEmTela.split("\\"+operacao)[1];
        segundoValor = Integer.valueOf(split);        
        switch (operacao) {
            case "+" -> {
                resultado = primeiroValor + segundoValor;                                
            }

            case "-" -> {
                resultado = primeiroValor - segundoValor;        
            }

            case "*" -> {
                resultado = primeiroValor * segundoValor;
            }

            case "/" -> {
                resultado = primeiroValor / segundoValor;
            }
        }
        telaCalculadora.setText(String.valueOf(resultado));
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void botaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuatroActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "4");
    }//GEN-LAST:event_botaoQuatroActionPerformed

    private void botaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCincoActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "5");
    }//GEN-LAST:event_botaoCincoActionPerformed

    private void botaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeisActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "6");
    }//GEN-LAST:event_botaoSeisActionPerformed

    private void botaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicarActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "*");
        operacao = "*";
        if (Objects.isNull(primeiroValor)) {
            primeiroValor = Integer.valueOf(numeroEmTela);
        } 
    }//GEN-LAST:event_botaoMultiplicarActionPerformed

    private void botaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeteActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "7");
    }//GEN-LAST:event_botaoSeteActionPerformed

    private void botaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOitoActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "8");

    }//GEN-LAST:event_botaoOitoActionPerformed

    private void botaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNoveActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "9");
    }//GEN-LAST:event_botaoNoveActionPerformed

    private void botaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDividirActionPerformed
        // TODO add your handling code here:
        String numeroEmTela = telaCalculadora.getText();
        telaCalculadora.setText(numeroEmTela + "/");
        operacao = "/";
        if (Objects.isNull(primeiroValor)) {
            primeiroValor = Integer.valueOf(numeroEmTela);
        } 
    }//GEN-LAST:event_botaoDividirActionPerformed

    private void botaoLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpaActionPerformed
        // TODO add your handling code here:
        telaCalculadora.setText("");
    }//GEN-LAST:event_botaoLimpaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCinco;
    private javax.swing.JButton botaoDividir;
    private javax.swing.JButton botaoDois;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoLimpa;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoMultiplicar;
    private javax.swing.JButton botaoNove;
    private javax.swing.JButton botaoOito;
    private javax.swing.JButton botaoPorcento;
    private javax.swing.JButton botaoQuatro;
    private javax.swing.JButton botaoSeis;
    private javax.swing.JButton botaoSete;
    private javax.swing.JButton botaoTres;
    private javax.swing.JButton botaoUm;
    private javax.swing.JButton botaoVirgula;
    private javax.swing.JButton botaoZero;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField telaCalculadora;
    // End of variables declaration//GEN-END:variables
}
