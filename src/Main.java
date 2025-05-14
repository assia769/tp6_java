 public class Main {
    public static void main(String[] args) {
        Boite<String> b1 = new Boite<>();
        b1.set("Bonjour");

        Boite<Integer> b2 = new Boite<>();
        b2.set(42);

        Utils.afficherContenu(b1);
        Utils.afficherContenu(b2);

        afficherBoiteInconnue(b1);
        afficherBoiteInconnue(b2);
    }

    // 4. Wildcard
    public static void afficherBoiteInconnue(Boite<?> b) {
        System.out.println("Boîte de type inconnu : " + b.get());
    }
}
 
