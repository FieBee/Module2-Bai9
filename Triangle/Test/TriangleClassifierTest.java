import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    @DisplayName("Testing 2 2 2")
    void getTriangleOf2_2_2(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expacted = "Tam giac deu";

        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expacted,result);
    }

    @Test
    @DisplayName("Testing 2 2 3")
    void getTriangleOf2_2_3(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expacted = "Tam giac can";

        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expacted,result);
    }

    @Test
    @DisplayName("Testing 3 4 5")
    void getTriangleOf3_4_5(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expacted = "Tam giac thuong";

        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expacted,result);
    }


    @Test
    @DisplayName("Testing 8 2 3")
    void getTriangleOf8_2_3(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expacted = "Khong phai tam giac";

        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expacted,result);
    }

    @Test
    @DisplayName("Testing -1 2 1")
    void getTriangleOfAm1_2_1(){
        int a = -1;
        int b = 2;
        int c = 1;
        String expacted = "Khong phai tam giac";

        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expacted,result);
    }

    @Test
    @DisplayName("Testing 0 2 1")
    void getTriangleOf0_1_1(){
        int a = 0;
        int b = 1;
        int c = 1;
        String expacted = "Khong phai tam giac";

        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expacted,result);
    }
}