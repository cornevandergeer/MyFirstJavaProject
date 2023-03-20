import org.junit.jupiter.api.Test;

public class ArrayOpdrachtEen {

    @Test
    void arrayTest() {
        int[] getallenArray = {RandomCijfer(10,100),RandomCijfer(10,100),RandomCijfer(10,100),RandomCijfer(10,100),RandomCijfer(10,100)};
        int laagsteCijfer = getallenArray[3];
        int hoogsteCijfer = 0;
        int somCijfers = 0;

        int cijfer1 = RandomCijfer(10,100);
        System.out.println(cijfer1);

        for (int i = 0; i < getallenArray.length; i++) {
            System.out.println("Het " + (i+1) + "e Cijfer is: " + getallenArray[i]);
            somCijfers += getallenArray[i];

            if (getallenArray[i] < laagsteCijfer) {
                laagsteCijfer = getallenArray[i];
            }
            if (getallenArray[i] > hoogsteCijfer) {
                hoogsteCijfer = getallenArray[i];
            }
            if (getallenArray[i] > 100 || getallenArray[i] < 10) {
                System.out.println("index " + i + " Valt buiten de range met de waarde: " + getallenArray[i]);
            }

        }
        System.out.println("Het laagste cijfer is: " + laagsteCijfer);
        System.out.println("Het hoogste cijfer is: " + hoogsteCijfer);
        System.out.println("Het gemiddelde cijfer is: " + ((double)somCijfers / getallenArray.length));

    }

    public int RandomCijfer(int min, int max) {
        double random = Math.random()*100;
        while (random < min || random > max) {
            random = Math.random()*100;
        }
        return (int)random;
    }

}
