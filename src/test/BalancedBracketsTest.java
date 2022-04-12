package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void iOBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void curlyParenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{)"));
    }

    @Test
    public void iOCurlyParenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}("));
    }

    @Test
    public void parenCurlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("(}"));
    }

    @Test
    public void iOParenCurlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("){"));
    }

    @Test
    public void parenthesesReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void iOParenthesesReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(")("));
    }

    @Test
    public void curlySquareReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }

    @Test
    public void iOCurlySquareReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}["));
    }

    @Test
    public void squareCurlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
    }

    @Test
    public void iOSquareCurlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]{"));
    }

    @Test
    public void parenSquareReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("(]"));
    }

    @Test
    public void iOParenSquareReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(")["));
    }

    @Test
    public void squareParenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[)"));
    }

    @Test
    public void iOSquareParenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]("));
    }
}
