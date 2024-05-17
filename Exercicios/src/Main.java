public class Main {
    public static void main(String[] args) {
        Retangulo retSimples = new RetanguloSimples(20, 5, "Hello");
        retSimples.desenhar();

        Retangulo retArredondado = new RetanguloArredondado(20, 5, "Hello");
        retArredondado.desenhar();

        Retangulo retLinhaDupla = new RetanguloLinhaDupla(20, 5, "Hello");
        retLinhaDupla.desenhar();

        Retangulo retAsciiArt = new RetanguloAsciiArt(20, 5, "Hello");
        retAsciiArt.desenhar();
    }
}
