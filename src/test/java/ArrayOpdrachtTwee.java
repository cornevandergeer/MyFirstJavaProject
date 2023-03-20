import org.junit.jupiter.api.Test;

public class ArrayOpdrachtTwee {

    @Test
    void arrayTest() {
        String[] namen = {"Leon", "Daniel", "Derk", "Juul", "Sander", "Asjer", "Stan", "Tim", "Luca"};

        System.out.println("Kortste naam is: " + kortsteNaamFunctie(namen));
    }

    public String kortsteNaamFunctie(String[] namen) {
        String kortsteNaam = namen[0];
        for (int i = 0; i < namen.length ; i++) {
            if (namen[i].length() < kortsteNaam.length()) {
                kortsteNaam = namen[i];
            }
        }
        return kortsteNaam;
    }

}
