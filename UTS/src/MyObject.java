//PG19

import java.util.ArrayList;
public class MyObject {
    static int total = 0;
    public static void main(String[] args) {

    ArrayList <Integer> number = new ArrayList<>();
    number.add(9);
    number.add(19);
    number.add(2);
    number.add(31);
    for(int i=0;i<number.size();i++){
        total += number.get(i);
        if(i == 1){
        continue;
        }
    }
    System.out.println(total);
    }
}

