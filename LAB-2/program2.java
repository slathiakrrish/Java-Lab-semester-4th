public class program2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        try {
            System.out.println(arr[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index is out of range");
        }

        System.out.println("Program continues...");
    }
}