package za.ac.cput.adp_capstone_project.factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.adp_capstone_project.domain.HairLength;

import static org.junit.jupiter.api.Assertions.*;

class HairLengthFactoryTest {
    private HairLength L1;
    private HairLength L2;
    private HairLength L3;
    private HairLength L4;

    @BeforeEach
    void setUp() {
        L1 = new HairLength.Builder()
                .setHairlengthID(1)
                .setHairLengthValue(10)
                .setLengthDescription("Short hair length")
                .build();

        L2 = new HairLength.Builder()
                .setHairlengthID(2)
                .setHairLengthValue(20)
                .setLengthDescription("Medium hair length")
                .build();

        L3 = new HairLength.Builder()
                .setHairlengthID(3)
                .setHairLengthValue(30)
                .setLengthDescription("Long hair length")
                .build();
        L4 = new HairLength.Builder()
                .setHairlengthID(1)
                .setHairLengthValue(10)
                .setLengthDescription("Short hair length")
                .build();
    }

    @Test
    void buildHairLenth() {
        assertNotNull(  L1);
        System.out.println(L1.toString());
    }

    @Test
    void identityTest(){
        assertNotSame(L1, L4);
        System.out.println("not same");
    }

}
