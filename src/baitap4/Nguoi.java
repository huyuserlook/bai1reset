package baitap4;

public class Nguoi {
	private String hoten;
    private String namSinh;
	public Nguoi(String hoten, String namSinh) {
		super();
		this.hoten = hoten;
		this.namSinh = namSinh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	@Override
	public String toString() {
		return "Nguoi [hoten=" + hoten + ", namSinh=" + namSinh + "]";
	}
    

}
