package ManageStudentAWT;
public class Sinhvien {
    String mssv,hoten,diachi,gioitinh,quequan,email;
    float diem1,diem2,diem3;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }
    public String gioitinh(){
        gioitinh="Nam";
        gioitinh="Nu";
        return gioitinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    public float Diemtb()
    {
        return ((diem1+diem2+diem3)/3);
    }

    public Sinhvien(String mssv, String hoten, String diachi, String gioitinh, String quequan, String email, float diem1, float diem2, float diem3) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.email = email;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public Sinhvien() {
    }
    
}
