import com.engeto.computers.Computer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { // static == neni vazane ke konkretnimu objektu (== spolecne pro celou tridu)
        Computer frantuvLaptop; // variable of Computer type
        Computer computer2, computer3;

        // Object creation
        frantuvLaptop = new Computer(); // construct object and assign it to the variable of the same type
        computer2 = new Computer();
        computer3 = frantuvLaptop;

        computer3 = computer2;

        computer2.setModel("ABC SuperComps");
        System.out.println(computer2.getModel());

        String model = computer3.getModel();
        System.out.println(model);

        System.out.println(computer2.getWeight());

        Computer computer4 = new Computer("YZ DeltaGamma", 2.5,
                            12.5, true);
        System.out.println(computer4.getModel());

        Computer computer5 = new Computer("YZ DeltaGammaOmega", 1.5);
        System.out.println(computer5.getModel());

        // druhy kolekci: array list, mapy, pole, ...
        // ArrayList<data_type_in_the_list> - data structure for objects (NOT primitive types) of the same type (in <>)
        ArrayList<Computer> listOfComputers = new ArrayList<>();  // Java8+: the second <> is empty, just safer convention
        listOfComputers.add(frantuvLaptop);
        listOfComputers.add(computer4);
        listOfComputers.add(new Computer("model-X", 1));

        for (int i = 0; i<100; i++) {
            listOfComputers.add(new Computer());
        }

        // 50th computer in the list
        System.out.println(
                "50-ty pocitac v seznamu je typu: " + listOfComputers.get(49).getModel());

        listOfComputers.remove(14);  // remove 15th comp
        listOfComputers.add(14, new Computer());  // insert new Computer at position 14
        listOfComputers.set(14, new Computer());  // overwrite item on position 14 by new Computer

        for (Computer computer : listOfComputers) {
            System.out.println(computer.getModel() + "(" + computer.getWeight() + "kg)");
        }

        System.out.println(listOfComputers.size());  // return number of items in the ArrayList
        listOfComputers.clear();  // clear all elements in the collection
    }
}
