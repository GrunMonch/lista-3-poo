public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco[] endereco;

    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        endereco = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for(int i = 0;i<endereco.length;i++){
            if(endereco[i] == null){
                endereco[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        for(int i=1;i<=endereco.length;i++){
            Endereco end = endereco[i-1];
            if(end != null){
                System.out.println("Endereço " + i + ": ");
                System.out.println("Rua " + end.rua + ", Bairro: " + end.bairro + ", Numero: " + end.num);
            }
        }
    }

}
