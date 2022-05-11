public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("222", "Leite Momoca", "Fazenda Momoca");
        Lote l1 = new Lote("001",p,20);
        System.out.println(p.toString());
        System.out.println(l1.toString());
    }
}