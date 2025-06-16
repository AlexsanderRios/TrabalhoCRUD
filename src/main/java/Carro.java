public class Carro {
    private int id;
    private String nome;
    private String marca;
    private int ano;
    private double preco;

    public Carro(String nome, String marca, int ano, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public Carro(int id, String nome, String marca, int ano, double preco) {
        this(nome, marca, ano, preco);
        this.id = id;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
    public double getPreco() { return preco; }
}