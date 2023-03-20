import org.junit.jupiter.api.Test;

public class ExceptionOefening {

    @Test
    void Oefening() {
        int[] getallen = {1,2,3};
        try {
            System.out.println(getallen[5]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("code die sowieso is uitgevoerd");
        }




    }

}
