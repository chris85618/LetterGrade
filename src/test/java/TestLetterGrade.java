package letterGrade.src.test.java;

import junit.framework.Assert;
import org.junit.Test;
import static com.example.letterGrade.letterGrade;

public class TestLetterGrade {
    @Test
    public void TestLetterGradeWithScoreMinus1GetX() {
        Assert.assertEquals('X', letterGrade(-1));
    }

    @Test
    public void TestLetterGradeWithScore0GetF() {
        Assert.assertEquals('F', letterGrade(0));
    }

    @Test
    public void TestLetterGradeWithScore30GetF() {
        Assert.assertEquals('F', letterGrade(30));
    }

    @Test
    public void TestLetterGradeWithScore59GetF() {
        Assert.assertEquals('F', letterGrade(59));
    }

    @Test
    public void TestLetterGradeWithScore60GetD() {
        Assert.assertEquals('D', letterGrade(60));
    }

    @Test
    public void TestLetterGradeWithScore65GetD() {
        Assert.assertEquals('D', letterGrade(65));
    }

    @Test
    public void TestLetterGradeWithScore69GetD() {
        Assert.assertEquals('D', letterGrade(69));
    }

    @Test
    public void TestLetterGradeWithScore70GetC() {
        Assert.assertEquals('C', letterGrade(70));
    }

    @Test
    public void TestLetterGradeWithScore75GetC() {
        Assert.assertEquals('C', letterGrade(75));
    }

    @Test
    public void TestLetterGradeWithScore79GetC() {
        Assert.assertEquals('C', letterGrade(79));
    }

    @Test
    public void TestLetterGradeWithScore80GetB() {
        Assert.assertEquals('B', letterGrade(80));
    }

    @Test
    public void TestLetterGradeWithScore85GetB() {
        Assert.assertEquals('B', letterGrade(85));
    }

    @Test
    public void TestLetterGradeWithScore89GetB() {
        Assert.assertEquals('B', letterGrade(89));
    }

    @Test
    public void TestLetterGradeWithScore90GetA() {
        Assert.assertEquals('A', letterGrade(90));
    }

    @Test
    public void TestLetterGradeWithScore95GetA() {
        Assert.assertEquals('A', letterGrade(95));
    }

    @Test
    public void TestLetterGradeWithScore100GetA() {
        Assert.assertEquals('A', letterGrade(100));
    }

    @Test
    public void TestLetterGradeWithScore101GetX() {
        Assert.assertEquals('X', letterGrade(101));
    }
}
