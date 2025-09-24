package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Artista;
import model.Musica;

public class MusicaController {

    public boolean inserir(Musica musica) {
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            String sqlMusica = "INSERT INTO tbmusica (titulo, duracao, genero, ano) VALUES (?, ?, ?, ?)";
            comando = gerenciador.prepararComando(sqlMusica);
            comando.setString(1, musica.getTitulo());
            comando.setString(2, musica.getDuracao());
            comando.setString(3, musica.getGenero());
            comando.setInt(4, musica.getAno());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir música: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, null);
        }

        return false;
    }

    public List<Musica> consultar(int opcaoFiltro, String filtro) {
        String sql = "SELECT m.*, "
                + " (SELECT GROUP_CONCAT(a.nome SEPARATOR ', ') "
                + "  FROM tbartista a "
                + "  JOIN tbcolaboracao c ON a.pkartista = c.fk_artista "
                + "  WHERE c.fk_musica = m.pkmusica) AS artistas "
                + "FROM tbmusica m ";

        if (!filtro.isEmpty()) {
            switch (opcaoFiltro) {
                case 0: // filtra pelo título da música
                    sql += " WHERE m.titulo LIKE '%" + filtro + "%'";
                    break;
                case 1: // filtra pelo artista
                    sql += " WHERE a.nome LIKE '%" + filtro + "%'";
                    break;
                case 2: // filtra pelo ano
                    sql += " WHERE m.ano = " + filtro;
                    break;
            }
        }

        sql += " ORDER BY m.pkmusica";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;
        List<Musica> lista = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Musica m = new Musica();
                m.setPkmusica(resultado.getInt("pkmusica"));
                m.setTitulo(resultado.getString("titulo"));
                m.setDuracao(resultado.getString("duracao"));
                m.setGenero(resultado.getString("genero"));
                m.setAno(resultado.getInt("ano"));

                String artistas = resultado.getString("artistas");
                m.setArtistas(artistas);

                lista.add(m);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar músicas: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }

    public boolean adicionarColaboracao(int pkMusica, int pkArtista) {
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            String sql = "INSERT INTO tbcolaboracao (fk_musica, fk_artista) VALUES (?, ?)";
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, pkMusica);
            comando.setInt(2, pkArtista);
            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar artista à música: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, null);
        }
        return false;
    }
    
    public List<Musica> buscarTodas() {
        List<Musica> musicas = new ArrayList<>();
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            String sql = "SELECT * FROM tbmusica";
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Musica m = new Musica();
                m.setPkmusica(resultado.getInt("pkmusica"));
                m.setTitulo(resultado.getString("titulo"));
                m.setDuracao(resultado.getString("duracao"));
                m.setGenero(resultado.getString("genero"));
                m.setAno(resultado.getInt("ano"));
                musicas.add(m);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar músicas: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return musicas;
    }

}
