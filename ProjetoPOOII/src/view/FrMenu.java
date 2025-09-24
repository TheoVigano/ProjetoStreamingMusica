/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import javax.swing.ImageIcon;
import utils.Util;

public class FrMenu extends javax.swing.JFrame {

    public FrMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnbPrincipal = new javax.swing.JMenu();
        miUsuario = new javax.swing.JMenuItem();
        miMusica = new javax.swing.JMenuItem();
        miArtista = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mnConsultar = new javax.swing.JMenu();
        miConUsuario = new javax.swing.JMenuItem();
        miConMusica = new javax.swing.JMenuItem();
        miConArtista = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();
        mnPlaylist = new javax.swing.JMenu();
        miCriarPlaylist = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Projeto POOII");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(48, 48, 48));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(670, 430));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/musica.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pnlPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seja Bem-Vindo(a)!");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 400, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vinyl.png"))); // NOI18N
        pnlPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(34, 33, 33));

        mnbPrincipal.setBackground(new java.awt.Color(34, 33, 33));
        mnbPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        mnbPrincipal.setText("Cadastros");
        mnbPrincipal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        miUsuario.setBackground(new java.awt.Color(34, 33, 33));
        miUsuario.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miUsuario.setForeground(new java.awt.Color(255, 255, 255));
        miUsuario.setText("Usuário");
        miUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioActionPerformed(evt);
            }
        });
        mnbPrincipal.add(miUsuario);

        miMusica.setBackground(new java.awt.Color(34, 33, 33));
        miMusica.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miMusica.setForeground(new java.awt.Color(255, 255, 255));
        miMusica.setText("Música");
        miMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMusicaActionPerformed(evt);
            }
        });
        mnbPrincipal.add(miMusica);

        miArtista.setBackground(new java.awt.Color(34, 33, 33));
        miArtista.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miArtista.setForeground(new java.awt.Color(255, 255, 255));
        miArtista.setText("Artista");
        miArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miArtistaActionPerformed(evt);
            }
        });
        mnbPrincipal.add(miArtista);

        miSair.setBackground(new java.awt.Color(34, 33, 33));
        miSair.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miSair.setForeground(new java.awt.Color(255, 255, 255));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mnbPrincipal.add(miSair);

        jMenuBar1.add(mnbPrincipal);

        mnConsultar.setBackground(new java.awt.Color(34, 33, 33));
        mnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        mnConsultar.setText("Consultar");
        mnConsultar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        miConUsuario.setBackground(new java.awt.Color(34, 33, 33));
        miConUsuario.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miConUsuario.setForeground(new java.awt.Color(255, 255, 255));
        miConUsuario.setText("Usuário");
        miConUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConUsuarioActionPerformed(evt);
            }
        });
        mnConsultar.add(miConUsuario);

        miConMusica.setBackground(new java.awt.Color(34, 33, 33));
        miConMusica.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miConMusica.setForeground(new java.awt.Color(255, 255, 255));
        miConMusica.setText("Música");
        miConMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConMusicaActionPerformed(evt);
            }
        });
        mnConsultar.add(miConMusica);

        miConArtista.setBackground(new java.awt.Color(34, 33, 33));
        miConArtista.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miConArtista.setForeground(new java.awt.Color(255, 255, 255));
        miConArtista.setText("Artista");
        miConArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConArtistaActionPerformed(evt);
            }
        });
        mnConsultar.add(miConArtista);

        jMenuBar1.add(mnConsultar);

        mnSobre.setBackground(new java.awt.Color(34, 33, 33));
        mnSobre.setForeground(new java.awt.Color(255, 255, 255));
        mnSobre.setText("Sobre");
        mnSobre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jMenuBar1.add(mnSobre);

        mnPlaylist.setBackground(new java.awt.Color(34, 33, 33));
        mnPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        mnPlaylist.setText("Playlist");
        mnPlaylist.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        miCriarPlaylist.setBackground(new java.awt.Color(34, 33, 33));
        miCriarPlaylist.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        miCriarPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        miCriarPlaylist.setText("Criar");
        miCriarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCriarPlaylistActionPerformed(evt);
            }
        });
        mnPlaylist.add(miCriarPlaylist);

        jMenuItem1.setBackground(new java.awt.Color(34, 33, 33));
        jMenuItem1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Acessar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnPlaylist.add(jMenuItem1);

        jMenuBar1.add(mnPlaylist);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 764, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_miSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Util objeto = new Util();
       this.setIconImage(Util.getIcone());
    }//GEN-LAST:event_formWindowOpened

    private void miUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioActionPerformed
        FrCadUsuario telaCadUsuario = new FrCadUsuario(this, rootPaneCheckingEnabled);
        telaCadUsuario.setVisible(true);
    }//GEN-LAST:event_miUsuarioActionPerformed

    private void miConUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConUsuarioActionPerformed
        FrConUsuario telaConUsuario = new FrConUsuario(this, rootPaneCheckingEnabled);
        telaConUsuario.setVisible(true);
    }//GEN-LAST:event_miConUsuarioActionPerformed

    private void miArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miArtistaActionPerformed
        FrCadArtista telaCadArtista = new FrCadArtista(this, rootPaneCheckingEnabled);
        telaCadArtista.setVisible(true);
    }//GEN-LAST:event_miArtistaActionPerformed

    private void miMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMusicaActionPerformed
        FrCadMusica telaCadMusica = new FrCadMusica(this, rootPaneCheckingEnabled);
        telaCadMusica.setVisible(true);
    }//GEN-LAST:event_miMusicaActionPerformed

    private void miConMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConMusicaActionPerformed
        FrConMusica telaConMusica = new FrConMusica(this, rootPaneCheckingEnabled);
        telaConMusica.setVisible(true);
    }//GEN-LAST:event_miConMusicaActionPerformed

    private void miConArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConArtistaActionPerformed
        FrConArtista telaConArtista = new FrConArtista(this, rootPaneCheckingEnabled);
        telaConArtista.setVisible(true);
    }//GEN-LAST:event_miConArtistaActionPerformed

    private void miCriarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCriarPlaylistActionPerformed
        FrCadPlaylist telaCadPlaylist = new FrCadPlaylist(this, rootPaneCheckingEnabled);
        telaCadPlaylist.setVisible(true);
    }//GEN-LAST:event_miCriarPlaylistActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrAcePlaylist telaAcePlaylist = new FrAcePlaylist(this, rootPaneCheckingEnabled);
        telaAcePlaylist.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miArtista;
    private javax.swing.JMenuItem miConArtista;
    private javax.swing.JMenuItem miConMusica;
    private javax.swing.JMenuItem miConUsuario;
    private javax.swing.JMenuItem miCriarPlaylist;
    private javax.swing.JMenuItem miMusica;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miUsuario;
    private javax.swing.JMenu mnConsultar;
    private javax.swing.JMenu mnPlaylist;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenu mnbPrincipal;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
