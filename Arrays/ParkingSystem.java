package CrackingCodingInterview.Arrays;
//https://leetcode.com/problems/design-parking-system/submissions/

import java.util.HashMap;
import java.util.Map;


//big --1
// medium -- 2
//small -- 3

//["ParkingSystem","addCar","addCar","addCar","addCar"]
//[[1,1,0],[1],[2],[3],[1]]
//[null,true,false,false,true]
class ParkingSystem {

    public Map< Integer, Integer> slots = new HashMap();

    public ParkingSystem(int big, int medium, int small) {
        slots.put(1,big);
        slots.put(2,medium);
        slots.put(3,small);

    }

    public static void main(String []args){


        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        boolean param_1 = obj.addCar(1);
        boolean param_2 = obj.addCar(2);
        boolean param_3 = obj.addCar(3);
        boolean param_4 = obj.addCar(1);


    }




    public boolean addCar(int carType) {
        Integer val = slots.get(carType);
        try {
            if (val > 0) {
                slots.put(carType, slots.get((carType) - 1));
                return true;
            }
        }catch (Exception exception){

        }
        return  false;
    }
}