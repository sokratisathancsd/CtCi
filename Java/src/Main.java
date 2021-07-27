import static org.junit.Assert.*;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {

        oneWay ow = new oneWay();
        assertEquals(ow.isOneWay("test","test"),true);
        assertEquals(ow.isOneWay("test","tes"),true);
        assertEquals(ow.isOneWay("tes","test"),true);
        assertEquals(ow.isOneWay("tost","test"),true);
        assertEquals(ow.isOneWay("test","best"),true);

        assertEquals(ow.isOneWay("test","test"),false);
    }


}
