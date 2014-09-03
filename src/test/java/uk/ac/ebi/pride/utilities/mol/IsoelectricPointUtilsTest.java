package uk.ac.ebi.pride.utilities.mol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author ypriverol
 * @author rwang
 */
public class IsoelectricPointUtilsTest {

    private IsoelectricPointUtils.BjellpI bjellpI;

    @Before
    public void setUp() throws Exception {
        bjellpI = new IsoelectricPointUtils.BjellpI();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculate() throws Exception {
        String peptideSeq = "GGTAVILDIFR";
        peptideSeq = peptideSeq.replace("*","");
        peptideSeq = IsoelectricPointUtils.replaceSpecialAA(peptideSeq);
        double pi = bjellpI.calculate(peptideSeq);
        assertTrue(pi == 5.84);
    }
}
