package enums;

import practise.enums.EnumsOuterClass;

public class EnumsMain {
    public static void main(String[] args) {
        EnumsOuterClass.Enums enums = EnumsOuterClass.Enums.newBuilder()
                // .setEyeColorValue(3)
                .setEyeColor(EnumsOuterClass.EyeColor.BLUE)
                .build();

        System.out.println(enums);
    }


}
