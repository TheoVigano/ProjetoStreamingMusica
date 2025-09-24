package model;

public class Musica {

    private int pkmusica;
    private String titulo;
    private String duracao;
    private String genero;
    private int ano;
    private Artista artista;
    private String artistas;

    public Musica() {
    }

    public int getPkmusica() {
        return pkmusica;
    }

    public void setPkmusica(int pkmusica) {
        this.pkmusica = pkmusica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return titulo; // ou: return titulo + " - " + artista;
    }
}
