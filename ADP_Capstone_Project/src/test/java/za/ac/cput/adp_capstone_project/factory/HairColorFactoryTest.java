package za.ac.cput.adp_capstone_project.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.adp_capstone_project.domain.HairColor;

import static org.junit.jupiter.api.Assertions.*;

class HairColorFactoryTest {
private   HairColor C1;
private HairColor C2;
    private HairColor C3;
    private HairColor C4;

    @BeforeEach
    void setUp() {
        C1 = HairColorFactory.buildHairColor("pnk1","Pink","This color has different shades of pink");
        C2 = HairColorFactory.buildHairColor("pnk1",null,"This color has different shades of pink");
        C3 = HairColorFactory.buildHairColor("pnk1","pink","This color has different shades of pink");
        C4= C1;
    }

    @Test
    void buildHairColor() {
        assertNotNull(C1);
        System.out.println(C1.toString());
    }

    @Test
    void identityTest(){
        assertNotSame(C1, C3);
    }

    @Test
    void equalityTest(){
        assertEquals(C1,C4);
    }
}