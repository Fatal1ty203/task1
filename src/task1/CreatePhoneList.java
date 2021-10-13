package task1;

import java.util.ArrayList;
import java.util.List;

public class  CreatePhoneList {

    public static List<Phone> PH(){

        List<Phone> phoneList = new ArrayList<>();

        phoneList.add(new Phone("Sony", 3,"black", 1500));
        phoneList.add(new Phone("Nokia",4,"green",1600));
        phoneList.add(new Phone("Apple",4,"red",1500));
        phoneList.add(new Phone("Sony", 3,"black",1500));
        phoneList.add(new Phone("sd",3,"asd",4));
        return phoneList;
    }


}
