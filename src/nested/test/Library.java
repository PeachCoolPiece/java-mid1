package nested.test;

public class Library {
    
    
    private Book[] books;
    
    public Library(int arr) {
        books = new Book[arr];
    }
    
    public void addBook(String title , String author) {
        for (int i = 0; i <books.length ; i++) {
            if(books[books.length -1] != null) {
                System.out.println("도서관 저장 공간이 부족합니다.");
                break;
            }
            if (books[i] == null) {
                books[i] = new Book(title, author);
                break;
            }
        }
      
    }
    public void showBooks() {
        for (Book book : books) {
            String format = String.format("제목 :%s , 저자 : %s", book.title, book.author);
            System.out.println(format);
        }
    }
    
    
    private static class Book {
        private String title;
        private String author;
        
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
