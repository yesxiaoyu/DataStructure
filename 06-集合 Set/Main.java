import java.util.ArrayList;

public class Main {

    private static double testSet(Set<String> set, String filename){

        long startTime = System.nanoTime();

        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words)
                set.add(word);
            System.out.println("Total different words: " + set.getSize());
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        String filename1 = "pride-and-prejudice.txt";
        String filename2 = "a-tale-of-two-cities.txt";

        BSTSet<String> bstSet = new BSTSet<>();
        double time1 = testSet(bstSet, filename1);
        System.out.println("BST Set: " + time1 + " s");

        System.out.println();

        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time2 = testSet(linkedListSet, filename1);
        System.out.println("Linked List Set: " + time2 + " s");

        System.out.println();

        double time3 = testSet(bstSet, filename2);
        System.out.println("BST Set: " + time3 + " s");

        System.out.println();

        double time4 = testSet(linkedListSet, filename2);
        System.out.println("Linked List Set: " + time4 + " s");
    }
}
