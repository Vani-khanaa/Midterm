/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
class StausUser {
    public enum Value {
        ZERO, ONE, TWO, ThREE
    };

    private Value v;

    public void statusUser(Value v, String code) {
        this.v = v;
        switch (code.toUpperCase()) {
            
            case "ZERO":
                System.out.println("REJECTED");
                break;
            case "ONE":
                System.out.println("PENDING");
                break;
            case "TWO":
                System.out.println("PROCESSING");
                break;
            case "THREE":
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
    public void statusDetail(String code){
        
        String myvar = code.toUpperCase();
        Value v;
        v = Value.ZERO;
        switch (v) {
            
            case ZERO:
                System.out.println("REJECTED");
                break;
            case ONE:
                System.out.println("PENDING");
                break;
            case TWO:
                System.out.println("PROCESSING");
                break;
            case ThREE:
                System.out.println("APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
        

    }

}

public class StatusUser {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (zero,one,two,three) in string");
        String code = in.next();
        StausUser t = new StausUser();
        t.statusDetail(code);
    }

}