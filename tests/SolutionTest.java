import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void solution1() {
        Solution s1 = new Solution();
        int[] A = new int[]{-1, 1, 1, 2, 2, 3, 6}; //4
        int[] B = new int[]{-25, -12, 2, 2, 2, 4, 6}; //3
        int[] C = new int[]{1, 1, 1, 2, 2, 3, 4}; //5
        int[] D = new int[]{5, 6, 7, 8}; //1
        int[] E = new int[]{-5, -6, -7, -8}; //1
        int[] F = new int[]{1, 3, 6, 4, 1, 2}; //5
        int[] G = new int[]{-1, -3, -6}; //1
        assertEquals(s1.solution1(A), 4);
        assertEquals(s1.solution1(B), 3);
        assertEquals(s1.solution1(C), 5);
        assertEquals(s1.solution1(D), 1);
        assertEquals(s1.solution1(E), 1);
        assertEquals(s1.solution1(F), 5);
        assertEquals(s1.solution1(G), 1);
    }

    @Test
    public void solution() {
        Solution s1 = new Solution();
        assertEquals(s1.solution("44 622- 481  -"), "446-224-81");
        assertEquals(s1.solution("44 622- 48  -"), "446-22-48");
    }
}