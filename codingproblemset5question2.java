public class codingproblemset5question2{
    public static void main(String[] args){
        class Rectangle{
            double length;
            double width;

            Rectangle(double l, double w){
                length=l;
                width=w;

            }

            int area (){
                return (int) (length * width);
            
            }
        }

        Rectangle r1= new Rectangle(10, 6);
        System.out.println("Area:"+ r1.area());
    }
}