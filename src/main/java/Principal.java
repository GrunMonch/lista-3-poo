public class Principal {
    public static void main(String[] args) {
        Pessoa pe = new Pessoa("Irineu",235312,3);

        Endereco end1 = new Endereco("Alta","Limoeiro",123);
        pe.addEndereco(end1);
        Endereco end2 = new Endereco("Baixa","Macieira",129);
        pe.addEndereco(end2);
        Endereco end3 = new Endereco("Central","Pereira",257);
        pe.addEndereco(end3);

        pe.mostraInfo();
    }
}
