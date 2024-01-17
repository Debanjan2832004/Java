import java.util.Arrays;

public class sorted_name{
    public static void main(String[] args) {
        String[] names = {"Ram","Shyam","Abhi"};

        // Sort names alphabetically
        Arrays.sort(names);

        // Print the sorted names
        System.out.println("Sorted Names:");
        for (int i=0;i<names.length;i++) {
            System.out.println(names[i]);
 }
}
}