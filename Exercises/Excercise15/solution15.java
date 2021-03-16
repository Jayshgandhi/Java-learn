import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

class Sage{
    int ascii;
    public String predictPersonality(String name,Integer number) {

        for(int i=0;i<name.length();i++){
            char d = name.charAt(i);
            ascii =(int)d;
        }
        int l = (ascii+number)%16;
        switch (l) {
            case 0: {
                return "ARCHITECT";
            }
            case 1: {
                return "Logician";
            }
            case 2: {
                return "COMMANDER";
            }
            case 3: {
                return "DEBATER";
            }
            case 4: {
                return "ADVOCATE";
            }
            case 5: {
                return "MEDIATOR";
            }
            case 6: {
                return "PROTAGONIST";
            }
            case 7: {
                return "CAMPAIGNER";
            }
            case 8: {
                return "LOGISTICIAN";
            }
            case 9: {
                return "DEFENDER";
            }
            case 10: {
                return "EXECUTIVE";
            }
            case 11: {
                return "CONSUL";
            }
            case 12: {
                return "VIRTUOSO";
            }
            case 13: {
                return "ADVENTURER";
            }
            case 14: {
                return "ENTREPRENEUR";
            }
            case 15: {
                return "ENTERTAINER";
            }
        }
        return "default";
    }
}

public class solution15 {
    public static void main(String[] args) {
        Sage s = new Sage();
        String h;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your name:");
            String n = sc.nextLine();
            System.out.println("Enter your favourite number");
            int r = Integer.parseInt(sc.nextLine());

            System.out.println(s.predictPersonality(n,r));
            System.out.println("Do you want to continue?");
            h=sc.nextLine();

        }while(h.equals("yes"));

    }

}
