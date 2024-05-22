/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keluarga;

/**
 *
 * @author user
 */
public class Anak extends Manusia {
    public Anak(String nama, String tempat_lahir, String tanggal_lahir, String pekerjaan, String alamat, String no_hp, int umur) {
        super(nama, tempat_lahir, tanggal_lahir, pekerjaan, alamat, no_hp);
    }

    @Override
    public String getDetails() {
        return String.format(
           
        "======================================================\n" +
        "|                      DATA ANAK ANAK KITA                          |\n" +
        "======================================================\n" +
        "|----------------------------------------------------|\n" +
        "| Nama          : %-34s |\n" +
        "| Tempat Lahir  : %-34s |\n" +
        "| Tanggal Lahir : %-34s |\n" +
        "| Pekerjaan     : %-34s |\n" +
        "| Tempat Tinggal: %-34s |\n" +
        "| Nomor HP      : %-34s |\n" +
        "| Umur          : %-34d |\n" +
        "|----------------------------------------------------|\n",
            getNama(), getTempat_Lahir(), getTanggal_Lahir(), getPekerjaan(), getAlamat(), getNo_hp(), getUmur()
        );
    }
}
