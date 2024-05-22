package keluarga;

public class Orang_Tua extends Manusia {
    public Orang_Tua(String nama, String tempat_lahir, String tanggal_lahir, String pekerjaan, String alamat, String no_hp, int umur) {
        super(nama, tempat_lahir, tanggal_lahir, pekerjaan, alamat, no_hp);
    }

    @Override
public String getDetails() {
    return String.format(
        "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
        "|                  Data Orang_Tua                         |\n" +
        "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
        "|----------------------------------------------------|\n" +
           "| Nama          : %s |\n" +
    "| Tempat Lahir  : %s |\n" +
    "| Tanggal Lahir : %s |\n" +
    "| Pekerjaan     : %s |\n" +
    "| Tempat Tinggal: %s |\n" +
    "| Nomor HP      : %s |\n" +
    "| Umur          : %d |\n" +
        "|----------------------------------------------------|\n",
        getNama(), getTempat_Lahir(), getTanggal_Lahir(), getPekerjaan(), getAlamat(), getNo_hp(), getUmur()
    );
}

}
