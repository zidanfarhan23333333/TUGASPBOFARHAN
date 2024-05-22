package keluarga;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public abstract class Manusia {
    private String nama;
    private String tempat_Lahir;
    private String pekerjaan;
    private String no_hp;
    private String alamat;
    private String tanggal_Lahir;
    protected static int umur;

    public Manusia(String nama, String tempat_Lahir, String tanggal_Lahir, String pekerjaan, String alamat, String no_hp) {
        this.nama = nama;
        this.tempat_Lahir = tempat_Lahir;
        this.tanggal_Lahir = formatTanggal(tanggal_Lahir);  
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.no_hp = no_hp;
        
         
        Manusia.umur = hitungUmur();
    }

    public String getNama() {
        return nama;
    }

    public String getTanggal_Lahir() {
        return tanggal_Lahir;
    }

    public String getTempat_Lahir() {
        return tempat_Lahir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public abstract String getDetails();

    private int hitungUmur() {
        LocalDate now = LocalDate.now();
        LocalDate tanggalLahir = LocalDate.parse(tanggal_Lahir); 
        return Period.between(tanggalLahir, now).getYears();
    }

    private String formatTanggal(String tanggal) {
        
        if (tanggal.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return tanggal; 
        } else {
            
            return LocalDate.parse(tanggal, DateTimeFormatter.ofPattern("dd MMMM yyyy")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
    }
}
