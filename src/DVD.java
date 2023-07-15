public class DVD extends ItemMusical{
    String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String tocar(){
        return "Reproduzindo DVD do: ";
    }
}
