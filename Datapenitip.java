
public class Datapenitip extends Penitip {
    private int no, id;
    private String nama, alamat, jenis, plat;

    @Override
    public void setData() {
        System.out.println("-------------------------------------");
        System.out.println("|      PROGRAM PENITIPAN MOTOR       |");
        System.out.println("---------------------------------------");
        System.out.print("MASUKAN NAMA CUSTOMER        = ");
        this.nama = st.nextLine();
        System.out.print("MASUKAN ALAMAT               = ");
        this.alamat = st.nextLine();
        System.out.print("MASUKAN JENIS MOTOR          = ");
        this.jenis = st.nextLine();
        System.out.print("MASUKAN NO POLISI            = ");
        this.plat = st.nextLine();
        System.out.print("MASUKAN NO HP                = ");
        this.no = in.nextInt();
        System.out.print("MASUKAN NO ANTRIAN PENITIPAN =");
        this.id = in.nextInt();
    }
    @Override
    public void tampilData(){
        System.out.println("-------------------------------------");
        System.out.println("|     STRUK PENGAMBILAN MOTOR        |");
        System.out.println("-------------------------------------");
        System.out.println(" NAMA CUSTOMER        = "+this.nama);
        System.out.println(" ALAMAT               = "+this.alamat);
        System.out.println(" JENIS MOTOR          = "+this.jenis);
        System.out.println(" NO POLISI            = "+this.plat);
        System.out.println(" NO HP                = "+this.no);
        System.out.println(" NO ANTRIAN PENITIPAN ="+this.id);
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId() {

    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}