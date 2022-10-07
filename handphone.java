// membuat nama class
public class handphone {
    // membuat variabel umum dan private
    String jenis_hp;
    private Integer tahun_hp;
    // membuat conscutor
    public void setData(String jenis_hp, Integer tahun_hp) {
        this.jenis_hp = jenis_hp;
        this.tahun_hp = tahun_hp;
    }
    // membuat method untuk jenis HP
    public String get_jenis_hp() {
        return (jenis_hp);
    }

    // membuat method untuk Tahun Hp
    public Integer get_tahun_hp() {
        return (tahun_hp);
    }

    // membuat fungsi main untuk menjalankan program
    public static void main(String[] args) {
        // membuat variable baru untuk memanggil class di atas
        handphone hp1 = new handphone();
        // proses set data atau pengisian data di kedua method di atas
        hp1.setData("OPPO A95", 2022);
        // proses print
        System.out.println("Nama Merk Hp : " + hp1.get_jenis_hp());
        System.out.println("Tahun Pembuatan Hp : " + hp1.get_tahun_hp());
    }
}
