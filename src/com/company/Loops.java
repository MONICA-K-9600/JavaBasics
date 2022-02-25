package com.company;

public class Loops {
    public void doWhile() {
        int i = 1;
        do {
            System.out.println("Loops: "+i);
            i++;
        }
        while (i <= 5);
    }
    public void ForLoop(){
        for(int k=0;k<=10;k++){
            System.out.println(k);
        }
    }
    public void Patterns(){
        int n=5;
        for(int a=0; a<=n; a++){
            for(int j=n-a;j>1;j--){
                System.out.print("");
            }
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
    public void Break(){
        int x=10;
        for(int z=0;z<=x;z++){
            if(z==5){break;
        }
            System.out.println(z);

    }

   }
    public void SwitchCase(){
        String hero="ak";
        switch(hero){
            case "vj":
                System.out.println("vj");break;
            case "ak":
                System.out.println("ak");break;
            default:
                System.out.println("SJ");

        }
}
}