class RetanguloArredondado extends Retangulo {
    public RetanguloArredondado(int largura, int altura, String texto) {
        super(largura, altura, texto);
    }

    @Override
    public void desenhar() {
        System.out.println(" ." + "-".repeat(largura) + ". ");
        for (int i = 0; i < altura - 2; i++) {
            if (i == (altura - 2) / 2) {
                int espacos = (largura - texto.length()) / 2;
                System.out.println("(" + " ".repeat(espacos) + texto + " ".repeat(largura - texto.length() - espacos) + ")");
            } else {
                System.out.println("(" + " ".repeat(largura) + ")");
            }
        }
        System.out.println(" '" + "-".repeat(largura) + "' ");
    }
}
