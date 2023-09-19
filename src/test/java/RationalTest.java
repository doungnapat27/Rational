import org.junit.Assert;
import org.junit.Test;

public class RationalTest {       
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testAdd2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 7;
        x.add(y);
        Assert.assertEquals(5, x.numerator);
    }
    @Test
    public void testAdd3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = -1;
        y.denominator = 2;
        x.add(y);
        Assert.assertEquals(-5, x.numerator);
    }
    @Test
    public void testAdd4() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 1;
        x.add(y);
        Assert.assertEquals(5, x.numerator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testSubtract2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
    }
    @Test
    public void testSubtract3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = -1;
        y.denominator = 2;
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
    }
    @Test
    public void testSubtract4() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 2;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
    }
    @Test
    public void testMultiply2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(0, x.numerator);
    }
    @Test
    public void testMultiply3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = -1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testMultiply4() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(0, x.numerator);
    }
    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
    }
    @Test
    public void testDivide2() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(0, x.numerator);
    }
    @Test
    public void testDivide3() {
        Rational x = new Rational();
        x.numerator = -3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(-6, x.numerator);
    }
    @Test
    public void testEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertTrue(x.equals(y));
    }
    @Test
    public void testEquals2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertFalse(x.equals(y));
    }
    @Test
    public void testEquals3() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertFalse(x.equals(y));
    }
    @Test
    public void testEquals4() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Assert.assertFalse(x.equals(null));
    }

    @Test
    public void testCompareTo(){
        Rational x = new Rational();
        x.numerator =1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testCompareTo2(){
        Rational x = new Rational();
        x.numerator =1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertEquals(0, x.compareTo(y));
    }
    @Test
    public void testCompareTo3(){
        Rational x = new Rational();
        x.numerator =0;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testCompareTo4(){
        Rational x = new Rational();
        x.numerator =3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 0;
        y.denominator = 2;
        Assert.assertEquals(1, x.compareTo(y));
    }
    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 10;
        Assert.assertEquals("1/5", x.toString());
    }
    @Test
    public void testToString2() {
        Rational x = new Rational();
        x.numerator = -1;
        x.denominator = 2;
        Assert.assertEquals("-1/2", x.toString());
    }
    @Test
    public void testToString3() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 1;
        Assert.assertEquals("2", x.toString());
    }
    @Test
    public void testToString4() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 2;
        Assert.assertEquals("1", x.toString());
    }
    @Test
    public void testToString5() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 2;
        Assert.assertEquals("0", x.toString());
    }
    @Test
    public void testToString6() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 0;
        Assert.assertEquals("Invalid Rational", x.toString());
    }
    @Test
    public void testToString7() {
        Rational x = new Rational();
        x.numerator = 0;
        x.denominator = 0;
        Assert.assertEquals("Invalid Rational", x.toString());
    }
    @Test
    public void testToString8() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = -2;
        Assert.assertEquals("1/-2", x.toString());
    }
    @Test
    public void testToString9() {
        Rational x = new Rational();
        x.numerator = -1;
        x.denominator = -2;
        Assert.assertEquals("1/2", x.toString());
    }
    @Test
    public void testToString10() {
        Rational x = new Rational();
        x.numerator = -2;
        x.denominator = 2;
        Assert.assertEquals("-1", x.toString());
    }
    @Test
    public void testToString11() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = -1;
        Assert.assertEquals("-5", x.toString());
    }
    @Test
    public void testToString12() {
        Rational x = new Rational();
        x.numerator = -2;
        x.denominator = -2;
        Assert.assertEquals("1", x.toString());
    }
}
