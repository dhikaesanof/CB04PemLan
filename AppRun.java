package CB04;

public class AppRun {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Motivasi Hidup", "Budi Iswanto", 2019, 7);
        Book book2 = new Book("Resep Masakan Padang", "Fajar Ramadan", 2018, 10);
        Book book3 = new Book("Konsep Fisika Dasar", "Tedjo Karyono", 2020, 15);
        Book book4 = new Book("Manajemen Bisnis", "Rio Asmoro", 2021, 5);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);     
        
        System.out.println("Daftar buku setelah ditambahkan: ");
        library.displayStock();
        
        library.removeBook(book4);
        library.removeBook(book4);
        System.out.println("\nDaftar buku setelah buku "+book4.getTitle()+" dihapus: ");
        library.displayStock();

        library.searchBooks("Konsep Fisika Dasar");
        
        library.updateStock(book2, -4);
        library.updateStock(book4, 3);
        library.updateStock(book3, 9);
        
        System.out.println("\nStok buku terkini:");
        library.displayStock();
    }
}
