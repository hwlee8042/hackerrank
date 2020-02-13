package algorithm.encryptionTest;

import algorithm.encryption.Encryption;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EncryptionTest {

    private Encryption encryption;

    @Before
    public void init() {
        encryption = new Encryption();
    }

    @Test
    public void encryptionTest01() {
        String input01 = "haveaniceday";
        String expected01 = "hae and via ecy";
        String result = encryption.solve(input01);
        assertThat(result, is(expected01));
    }

    @Test
    public void encryptionTest02() {
        String input02 = "feedthedog";
        String expected02 = "fto ehg ee dd";
        String result = encryption.solve(input02);
        assertThat(result, is(expected02));
    }

    @Test
    public void encryptionTest03() {
        String input03 = "chillout";
        String expected03 = "clu hlt io";
        String result = encryption.solve(input03);
        assertThat(result, is(expected03));
    }
}
