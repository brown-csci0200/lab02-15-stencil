package sol;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.IBST;

public class BSTTest {
    private IBST t1;
    // TODO: declare more test BSTs

    @Before
    public void testSetup() {
        this.t1 = new NodeTree(5, new NodeTree(2, new EmptyTree(),
                new EmptyTree()), new EmptyTree());
        // TODO: initialize the test BSTs you declared
    }

    // TODO: write more tests

    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }
}
