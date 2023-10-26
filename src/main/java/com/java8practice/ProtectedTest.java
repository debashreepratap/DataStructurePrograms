package com.java8practice;

import com.interview.ProtectedMember;

public class ProtectedTest extends ProtectedMember{

    public int getI(){
        return 30;
    }

    public static void main(String[] args) {
        ProtectedMember protectedMember =new ProtectedMember();
        //System.out.println(protectedMember.getI());

    }

}
