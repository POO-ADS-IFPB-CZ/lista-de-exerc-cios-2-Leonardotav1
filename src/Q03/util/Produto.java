package Q03.util;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    //Construtor
    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        if(preco >= 0) {
            this.preco = preco;
        }
        this.estoque = estoque;
    }

    //Getters para todos os atributos
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    //Setter de preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Metodo de informaçoes
    public void exibirInfo(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Estoque: " + getEstoque());
    }
}