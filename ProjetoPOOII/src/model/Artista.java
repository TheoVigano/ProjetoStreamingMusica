
package model;


public class Artista {
    private int pkartista;
    private String nome;
    private String genero;
    private String pais_origem;

    public Artista() {
    }

    // Getters e Setters para todos os atributos
    public int getPkartista() {
        return pkartista;
    }

    public void setPkartista(int pkartista) {
        this.pkartista = pkartista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais_origem() {
        return pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }
    
    @Override
    public String toString() {
        return nome;
    }
}


