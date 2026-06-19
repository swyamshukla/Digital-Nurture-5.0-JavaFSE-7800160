public class Library {
    Book[] books = { 
new Book(1, "Clean Code", "Robert C. Martin"),
new Book(2, "Effective Java", "Joshua Bloch"),
new Book(3, "Design Patterns", "Erich Gamma"),
new Book(4, "Head First Java", "Kathy Sierra"),
new Book(5, "Spring in Action", "Craig Walls"),
new Book(6, "Java Concurrency in Practice", "Brian Goetz"),
new Book(7, "The Pragmatic Programmer", "Andrew Hunt"),
new Book(8, "Introduction to Algorithms", "Thomas H. Cormen")
    };

    public void displayBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void linearSearch(int id){
        for(Book book : books){
            if(book.getId() == id){
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void binarySearch(int id){
        int start = 0, end = books.length-1;

        while(start<end){
            int mid = (start+end)/2;

            if(books[mid].getId() == id){
                System.out.println(books[mid]);
                return;
            }else if(books[mid].getId()>id){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        System.out.println("Book not found");
    }
}
