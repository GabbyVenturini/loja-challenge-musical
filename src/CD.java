public class CD extends ItemMusical {
    String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String tocar(){

        return "Tocando musica do: ";
    }
}
