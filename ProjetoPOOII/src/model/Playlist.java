package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int pkplaylist;
    private String nome;
    private int fkusuario; // dono da playlist
    private List<Musica> musicas;

    public Playlist() {
        musicas = new ArrayList<>();
    }

    public int getPkplaylist() {
        return pkplaylist;
    }

    public void setPkplaylist(int pkplaylist) {
        this.pkplaylist = pkplaylist;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFkusuario() {
        return fkusuario;
    }

    public void setFkusuario(int fkusuario) {
        this.fkusuario = fkusuario;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return nome;
    }
}
