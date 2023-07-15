public class InstrumentoMusical extends ItemMusical implements Alugavel {
    String intrumento;

    public String getIntrumento() {
        return intrumento;
    }

    public void setIntrumento(String intrumento) {
        this.intrumento = intrumento;
    }

    @Override
    public String Alugando() {
        return "Alugando: ";
    }

    @Override
    public String Devolvendo() {
        return "Devolvendo: ";
    }


}
