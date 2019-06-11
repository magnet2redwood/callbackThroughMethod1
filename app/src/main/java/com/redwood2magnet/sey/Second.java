package com.redwood2magnet.sey;

public class Second{
    myInterface myInterface;
    int mul;

    public void getInterface(myInterface myInterface){
        myInterface =myInterface;





    }
    public void sendResult(int a, int b){
        mul = a*b;

        if(myInterface!= null){
            myInterface.getSumResult(mul);
        }


    }
    public void kucho(){
        myInterface=null;
    }


        }