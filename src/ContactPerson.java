
public class ContactPerson {
    private int id;
    private String nama;
    private String telpon;
    private String kategori;
    
    public ContactPerson() {}
    
    public ContactPerson(String nama, String telpon, String kategori) {
        this.nama = nama;
        this.telpon = telpon;
        this.kategori = kategori;
    }
    
    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getTelpon() { return telpon; }
    public void setTelpon(String telpon) { this.telpon = telpon; }
    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }
}