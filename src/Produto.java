public class Produto {
    public String ID;
    public String name;
    public String fabricante;

    @Override
    public String toString() {
        return "Produto" + '\n'+
                "ID do produto:" + ID + '\n' +
                "Nome:" + name + '\n' +
                "Fabricante:" + fabricante + '\n';
    }

    public Produto(String ID, String name, String fabricante) {
        this.ID = ID;
        this.name = name;
        this.fabricante = fabricante;
    }
}
