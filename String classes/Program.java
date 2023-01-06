public class Program {
    public static void main(String[] args) {
        String data = "ab&(*%$%*gsb%7bhas81vy54as54b*";

        String newData = data.replaceAll("[^a-z]", "  ").trim();


    }
}
