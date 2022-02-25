package com.company;

public class CarArrays {
    public void Car(){
        int[][] mySpeed={{30,35,46},{40,45,50}};
        int d=mySpeed[0][1];
        System.out.println("Array");
        System.out.println(d);
        for(int i = 0; i< mySpeed.length; ++i){
            for(int j=0;j< mySpeed[i].length;++j){
                System.out.println(mySpeed[i][j]);

            }
        }

    }
}
