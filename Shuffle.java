//oppposite of sort algo

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        //shuffle()
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

    }
}
