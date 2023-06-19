import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Author : hassan shalash
 * Date   : 20/6/2023   12:5  AM
 */
public class GirlOrBoy {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        String value1=scanner.next();

        Set<Character> distinct=new HashSet<>();
        for (int i=0 ;i < value1.length() ;i++) {
            distinct.add(value1.charAt(i));
                distinct.toString();
            }

                if (distinct.size() % 2 == 0) {
                    System.out.println("CHAT WITH HER!");
                    return;
                } else {
                    System.out.println("IGNORE HIM!");
                    return;
                }
            }
}

