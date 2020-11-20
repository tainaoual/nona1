package triangles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class TrianglesTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }
    @Test
    public void threeDifferentSidesIsAnRightTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 4, 5);
        assertThat(triangleType).isEqualTo("right triangle");
    }
    @Test
    public void towEqualSidesAndOneDifferentIsIsoscelesTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5, 5, 3);
        assertThat(triangleType).isEqualTo("isosceles");
    }

    @Test
    public void canOnlyBeJoinedIntoATriangleThatIsNotIsoscelesOrAnRightOrEquilateralTriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2, 3, 4);
        assertThat(triangleType).isEqualTo("Other type triangle");
    }
    @Test
    public void TriangleCannotBeMade (){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(1, 2, 3);
        assertThat(triangleType).isEqualTo("inequality triangle");

    }


}


