package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.HairLength;
import za.ac.cput.adp_capstone_project.util.Helper;

public class HairLengthFactory {
    public static HairLength buildHairlength(int hairlengthID, int hairLengthValue, String lengthDescription) {
        if (Helper.isIntNullOrEmpty(hairlengthID) || Helper.isIntNullOrEmpty(hairLengthValue) ||
                Helper.isNullOrEmpty(lengthDescription)) {

            return null;
        }

        return new HairLength.Builder()
                .setHairlengthID(hairlengthID)
                .setHairLengthValue(hairLengthValue)
                .setLengthDescription(lengthDescription)
                .build();
    }
}

