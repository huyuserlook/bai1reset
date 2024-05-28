package baitap4;

public class SinhVien extends Nguoi {
	private String masoSV;
    private String nganhhoc;
	public SinhVien(String hoten, String namSinh, String masoSV, String nganhhoc) {
		super(hoten, namSinh);
		this.masoSV = masoSV;
		this.nganhhoc = nganhhoc;
	}
    
    
}
