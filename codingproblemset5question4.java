public class codingproblemset5question4 {

    static class Book {

        String title;
        double price;
        Book() {
            title = "Unknown Book";
            price = 0;
        }

        
        Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        
        void display() {
            System.out.println("Book Title: " + title);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book(); 
        Book b2 = new Book("Java Programming", 450);

        b1.display();
        b2.display();
    }
}