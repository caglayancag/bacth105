package ders39_abstractClass;

public class CHondaCivic extends BHonda{


    @Override
    public void motor() {
        System.out.println("Honda Civic araçlar ctec teknolojili çevreci motorlar kullanır");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araçlar sedan yada hactback kasa kullanır");

    }

    @Override
    public void teker() {
        System.out.println("Civic araçlar 205 55 16  teker kullanır");

    }

    @Override
    public void yakit() {
        System.out.println("Civic araçlar benzinlidir.");

    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araçlar güvenlik standardına uyar.");

    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart olarak klima kullanır.");
    }

    public static void main(String[] args) {
        /*
        Abstract parent class'lardaki abstract method'lar
        concrete child class'lar tarafından mecburen override edilir

        Ancak abstract parent'lardaki concrate method'ları override etmek mecburi değildir
        Eger Chıld class'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent classs'daki haliyle kullanabilirsiniz.
         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs(); // Civic
        civic1.klima(); // Civic
        civic1.marka(); // Honda
        civic1.ozelTeknoloji(); // Honda
    }
}
