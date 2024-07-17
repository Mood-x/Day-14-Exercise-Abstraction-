//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Learn Java");
        book.setAuthor("Tuwaiq academy");
        book.setPrice(100);
        System.out.println(book + " After discount: " +  book.getDiscount(30));

        System.out.println();

        Movie movie = new Movie();
        movie.setName("Movie 1");
        movie.setDirector("Mohammed");
        movie.setPrice(70);
        System.out.println(movie + " After discount: " +  movie.getDiscount(10));
        System.out.println();
        System.out.println("----------------------------------------------------");


//        ==============================================================================
//        ==============================================================================


        MovablePoint movablePoint = new MovablePoint(0, 0, 6, 8);
        System.out.println(movablePoint);
        System.out.println();

        movablePoint.moveUp();
        System.out.println("moveUp: " + movablePoint);

        movablePoint.moveDown();
        System.out.println("moveDown: " + movablePoint);

        movablePoint.moveLeft();
        System.out.println("moveLeft: " + movablePoint);

        movablePoint.moveRight();
        System.out.println("moveRight: " + movablePoint);

    }
}