class RetanguloSimples extends Retangulo {
    public RetanguloSimples(int largura, int altura, String texto) {
        super(largura, altura, texto);
    }

    @Override
    public void desenhar() {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.println("+" + "-".repeat(largura) + "+");
            } else if (i == altura / 2) {
                int espacos = (largura - texto.length()) / 2;
                System.out.println("|" + " ".repeat(espacos) + texto + " ".repeat(largura - texto.length() - espacos) + "|");
            } else {
                System.out.println("|" + " ".repeat(largura) + "|");
            }
        }
    }
}