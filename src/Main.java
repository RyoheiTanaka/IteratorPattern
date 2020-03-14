public class Main {
    public static void main (String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Java入門"));
        bookShelf.appendBook(new Book("リーダブルコード"));
        bookShelf.appendBook(new Book("オブジェクト指向でなぜ作るのか"));
        bookShelf.appendBook(new Book("Clean Architecture"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
