package algorithm.legoBlocks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LegoBlocksTest {
    private LegoBlocks legoBlocks;

    @Before
    private void init() {
        legoBlocks = new LegoBlocks();
    }

    @Test
    public void legoBlocksTest1() {
        int output1 = legoBlocks.legoBlocks(2, 2);
        int expected1 = 3;
        assertThat(output1, is(expected1));
    }

    @Test
    public void legoBlocksTest2() {
        int output2 = legoBlocks.legoBlocks(3, 2);
        int expected2 = 7;
        assertThat(output2, is(expected2));
    }


    @Test
    public void legoBlocksTest3() {
        int output3 = legoBlocks.legoBlocks(2, 3);
        int expected3 = 9;
        assertThat(output3, is(expected3));
    }

    @Test
    public void legoBlocksTest4() {
        int output4 = legoBlocks.legoBlocks(2, 2);
        int expected4 = 3375;
        assertThat(output4, is(expected4));
    }
}
