public class Lote {
    public String ID;
    public Produto produto;
    public int quantidade;

    @Override
    public String toString() {
        return "Lote" + "\n" +
                "ID do lote:" + ID + '\n' +
                "produto do lote:" + produto +
                "Quantidade do produto" + quantidade + '\n';
    }

    public Lote(String ID, Produto produto, int quantidade) {
        this.ID = ID;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
