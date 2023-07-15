// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        CD cd = new CD();
        cd.tocar();
        cd.setTitulo("I Want to Break Free");
        cd.setArtista("Banda Queen.");
        cd.setPreco(30);

        System.out.println(cd.tocar());

        System.out.println(cd.getTitulo());
        System.out.println(cd.getArtista());
        System.out.println(cd.getPreco());

        System.out.println("_________________________________________________________________________________________");

        DVD dvd = new DVD();
        dvd.tocar();
        dvd.setTitulo("Harry Potter - E a Pedra Filosofal");
        dvd.setDiretor("Diretor: Chris Columbus");
        dvd.setPreco(50);

        System.out.println(dvd.tocar());

        System.out.println(dvd.getTitulo());
        System.out.println(dvd.getDiretor());
        System.out.println(dvd.getPreco());

        System.out.println("_________________________________________________________________________________________");

        InstrumentoMusical instrumentoMusical = new InstrumentoMusical();
        instrumentoMusical.Alugando();
        System.out.println(instrumentoMusical.Alugando());

        instrumentoMusical.setIntrumento("Violao");
        instrumentoMusical.setPreco(150);

        System.out.println(instrumentoMusical.getIntrumento());
        System.out.println(instrumentoMusical.getPreco());

        instrumentoMusical.Devolvendo();
        System.out.println(instrumentoMusical.Devolvendo());
        System.out.println(instrumentoMusical.getIntrumento());

        System.out.println("_________________________________________________________________________________________");

        instrumentoMusical.Alugando();
        System.out.println(instrumentoMusical.Alugando());

        instrumentoMusical.setIntrumento("Guitarra");
        instrumentoMusical.setPreco(200);

        System.out.println(instrumentoMusical.getIntrumento());
        System.out.println(instrumentoMusical.getPreco());

        instrumentoMusical.Devolvendo();
        System.out.println(instrumentoMusical.Devolvendo());
        System.out.println(instrumentoMusical.getIntrumento());

        System.out.println("_________________________________________________________________________________________");

        instrumentoMusical.Alugando();
        System.out.println(instrumentoMusical.Alugando());

        instrumentoMusical.setIntrumento("Teclado");
        instrumentoMusical.setPreco(120);

        System.out.println(instrumentoMusical.getIntrumento());
        System.out.println(instrumentoMusical.getPreco());

        instrumentoMusical.Devolvendo();
        System.out.println(instrumentoMusical.Devolvendo());
        System.out.println(instrumentoMusical.getIntrumento());




    }
}