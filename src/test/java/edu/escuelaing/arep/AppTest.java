package edu.escuelaing.arep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testDesviacion() {

        Calculardora ans = new Calculardora(new String[]{"100","130","138","155","180","104","110","115"});
        Calculardora ans1 = new Calculardora(new String[]{"186", "699", "132", "272", "291", "331", "199", "1890", "788", "1601"});
        Double res = ans.desviacionEstandar();
        Double res1 = ans1.desviacionEstandar();

        assertEquals(res, new Double(27.728273347923107));
        assertEquals(res1, new Double(625.6339806770231));

    }
    @Test
    public void testMedia(){

        Calculardora ans=new Calculardora(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14"});
        Calculardora ans1=new Calculardora(new String[]{"0.0000000005","0.0000005","0.000005","0.005"});
        Double res=ans.media();
        Double res1= ans1.media();
        assertEquals(res,new Double(7.5));
        assertEquals(res1,new Double(0.001251375125));

    }
}