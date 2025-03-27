package CB04;

import java.util.List;
public class Library {
    private Inventory<Book> inventory;
    public Library(){
        this.inventory = new Inventory<>();
    }

    public void addBook(Book book){
        inventory.addItem(book);
    }
    public void removeBook(Book book){
        if (inventory.getItem().contains(book)){
            inventory.removeItem(book);
            System.out.println("Buku "+book.getTitle()+" berhasil dihapus!");
        }else{
            System.out.println("Buku "+book.getTitle()+" sudah tidak tersedia!");
        }
    }
    public void searchBooks(String keyword){
        List<Book> result = inventory.searchItems(keyword);
        if (result.isEmpty()) {
            System.out.println("Buku dengan kata kunci \""+ keyword +"\" tidak ditemukan.");
        } else {
            System.out.println("Hasil pencarian untuk: "+ keyword);
            for (Book book : result) {
                System.out.println(book);
            }
        }
    }
    public void updateStock(Book book, int quantity){
        if(quantity < 0){
            System.out.println("Gagal mengupdate buku. Kuantitas tidak valid!");
        } else {
            if (inventory.getItem().contains(book)){
                book.setStock(quantity);
                System.out.println("Stok buku "+book.getTitle()+" berhasil diupdate!");
            }
            else{
                System.out. println("Buku "+book.getTitle()+" tidak tersedia!");
            }
        }
    }
    public void displayStock(){
        inventory.displayItems();
    }   
}
