package keluarga;

public class Keluarga {

    public static void main(String[] args) {
        
     Manusia ayah = new Orang_Tua("Suroto", "Magelang", "1974-02-06", "Wiraswasta", "Salaman,Magelang", "081234567890", 0);
Manusia ibu = new Orang_Tua("Sri Sulastri", "Purworejo", "1981-01-02", "Ibu Rumah Tangga", "Salaman,Magelang", "081234567891", 0);
Manusia anak1 = new Anak("Azha Salsabela Febrian", "Magelang", "2002-10-10", "Perawat", "Salaman Magelang", "081234567893", 0);
Manusia anak2 = new Anak("Farhan Azidan", "Magelang", "2004-03-23", "Mahasiswa", "Salaman,Magelang", "085713668051", 0);

       
        System.out.println(ayah.getDetails());
        System.out.println(ibu.getDetails());
        System.out.println(anak1.getDetails());
        System.out.println(anak2.getDetails());
    }  
}
