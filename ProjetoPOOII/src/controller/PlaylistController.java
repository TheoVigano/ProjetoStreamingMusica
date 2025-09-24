package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Musica;
import model.Playlist;

public class PlaylistController {

    // buscar playlist pelo nome
    public Playlist buscarPorNome(String nome) {
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;
        Playlist playlist = null;

        try {
            String sql = "SELECT * FROM tbplaylist WHERE nome LIKE ?";
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, "%" + nome + "%");
            resultado = comando.executeQuery();

            if (resultado.next()) {
                playlist = new Playlist();
                playlist.setPkplaylist(resultado.getInt("pkplaylist"));
                playlist.setNome(resultado.getString("nome"));
                playlist.setFkusuario(resultado.getInt("fkusuario"));
                playlist.setMusicas(buscarMusicasDaPlaylist(playlist.getPkplaylist()));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar playlist: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return playlist;
    }

    // buscar músicas da playlist
    public List<Musica> buscarMusicasDaPlaylist(int idPlaylist) {
    List<Musica> musicas = new ArrayList<>();
    String sql = "SELECT m.pkmusica, m.titulo, m.duracao, m.genero, m.ano, " +
                 "(SELECT GROUP_CONCAT(a.nome SEPARATOR ', ') FROM tbartista a " +
                 "JOIN tbcolaboracao c ON a.pkartista = c.fk_artista " +
                 "WHERE c.fk_musica = m.pkmusica) AS artistas " +
                 "FROM tbmusica m " +
                 "JOIN tbplaylist_item pi ON m.pkmusica = pi.fk_musica " +
                 "WHERE pi.fk_playlist = ?";

    GerenciadorConexao gc = new GerenciadorConexao();
    try {
        PreparedStatement ps = gc.prepararComando(sql);
        ps.setInt(1, idPlaylist);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Musica m = new Musica();
            m.setPkmusica(rs.getInt("pkmusica"));
            m.setTitulo(rs.getString("titulo"));
            m.setDuracao(rs.getString("duracao"));
            m.setGenero(rs.getString("genero"));
            m.setAno(rs.getInt("ano"));
            m.setArtistas(rs.getString("artistas"));
            musicas.add(m);
        }

        gc.fecharConexao(ps, rs);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar músicas da playlist: " + e.getMessage());
    }

    return musicas;
}


    // adicionar música na playlist
    public boolean adicionarMusicaNaPlaylist(int idPlaylist, int idMusica) {
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        boolean sucesso = false;

        try {
            String sql = "INSERT INTO tbplaylist_item (fk_playlist, fk_musica) VALUES (?, ?)";
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, idPlaylist);
            comando.setInt(2, idMusica);

            int linhas = comando.executeUpdate();
            sucesso = (linhas > 0);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar música: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return sucesso;
    }

    // remover música da playlist
    public boolean removerMusicaDaPlaylist(int idPlaylist, int idMusica) {
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        boolean sucesso = false;

        try {
            String sql = "DELETE FROM tbplaylist_item WHERE fk_playlist = ? AND fk_musica = ?";
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, idPlaylist);
            comando.setInt(2, idMusica);

            int linhas = comando.executeUpdate();
            sucesso = (linhas > 0);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover música: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return sucesso;
    }
    public boolean salvarPlaylist(Playlist playlist) {
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;
    boolean sucesso = false;

    try {
        String sql = "INSERT INTO tbplaylist (nome, fkusuario) VALUES (?, ?)";
        comando = gerenciador.prepararComando(sql);
        comando.setString(1, playlist.getNome());
        comando.setInt(2, playlist.getFkusuario());

        int linhas = comando.executeUpdate();
        sucesso = (linhas > 0);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar playlist: " + e.getMessage());
    } finally {
        gerenciador.fecharConexao(comando);
    }

    return sucesso;
}

}
