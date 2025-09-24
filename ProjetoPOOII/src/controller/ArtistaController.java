package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Artista;

public class ArtistaController {

    public List<Artista> listar() {
        List<Artista> lista = new ArrayList<>();
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            String sql = "SELECT * FROM tbartista";
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Artista a = new Artista();
                a.setPkartista(resultado.getInt("pkartista"));
                a.setNome(resultado.getString("nome"));
                a.setGenero(resultado.getString("genero"));
                a.setPais_origem(resultado.getString("pais_origem"));
                lista.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar artistas: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }

    public List<Artista> consultar(int opcaoFiltro, String filtro) {
        List<Artista> lista = new ArrayList<>();
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            String sql = "SELECT * FROM tbartista";

            if (filtro != null && !filtro.isEmpty()) {
                switch (opcaoFiltro) {
                    case 0: // Nome
                        sql += " WHERE nome LIKE ?";
                        break;
                    case 1: // Gênero
                        sql += " WHERE genero LIKE ?";
                        break;
                    case 2: // País de origem
                        sql += " WHERE pais_origem LIKE ?";
                        break;
                }
            }

            comando = gerenciador.prepararComando(sql);

            if (filtro != null && !filtro.isEmpty()) {
                comando.setString(1, "%" + filtro + "%");
            }

            resultado = comando.executeQuery();

            while (resultado.next()) {
                Artista a = new Artista();
                a.setPkartista(resultado.getInt("pkartista"));
                a.setNome(resultado.getString("nome"));
                a.setGenero(resultado.getString("genero"));
                a.setPais_origem(resultado.getString("pais_origem"));
                lista.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar artistas: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }
    
    public boolean inserir(Artista artista) {
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            String sql = "INSERT INTO tbartista (nome, genero, pais_origem) VALUES (?, ?, ?)";
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, artista.getNome());
            comando.setString(2, artista.getGenero());
            comando.setString(3, artista.getPais_origem());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir artista: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, null);
        }

        return false;
    }
}
