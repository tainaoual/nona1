package triangles;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class TriangleSorter {
    String type = "";
    public String analyze(int... sides) {
        ArrayList<Integer> sidesToSort = new ArrayList<>(List.of(sides[0], sides[1], sides[2]));
        Collections.sort(sidesToSort);
        int sideA = sidesToSort.get(0);
        int sideB = sidesToSort.get(1);
        int sideC = sidesToSort.get(2);
        if (sideA == sideB & sideB == sideC)
            type = "Equilateral";
        else if ((Math.abs(sideA * sideA + sideB * sideB - sideC * sideC) < 0.2)
                || (Math.abs(sideA * sideA + sideC * sideC - sideB * sideB) < 0.2)
                || (Math.abs(sideC * sideC + sideB * sideB - sideA * sideA) < 0.2))
            type = "right triangle";
        else if ((sideA == sideB & sideB != sideC)
                || (sideA != sideB & sideC == sideA)
                || (sideC == sideB & sideC != sideA))
            type = "isosceles";
        else if (sideA +sideB <=sideC )
            type = "inequality triangle";
        else {
            type = "Other type triangle";
    }
        return type;
    }}