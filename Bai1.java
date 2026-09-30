// Bai1
class Student {
    private String mssv;
    private String name;
    private double diemCC; 
    private double diemGK; 
    private double diemCK;
    public Student(String mssv, String name, double diemCC, double diemGK, double diemCK) {
        this.mssv = mssv;
        this.name = name;
        this.setDiemCC(diemCC);
        this.setDiemGK(diemGK);
        this.setDiemCK(diemCK);
    }
    public String getMssv() { return mssv; }
    public String getName() { return name; }
    public double getDiemCC() { return diemCC; }
    public double getDiemGK() { return diemGK; }
    public double getDiemCK() { return diemCK; }
    public void setDiemCC(double diemCC) {
        if (diemCC >= 0 && diemCC <= 10) {
            this.diemCC = diemCC;
        } else {
            System.out.println("Lỗi: Điểm chuyên cần không hợp lệ (phải từ 0-10). Đã chặn cập nhật.");
        }
    }
    public void setDiemGK(double diemGK) {
        if (diemGK >= 0 && diemGK <= 10) {
            this.diemGK = diemGK;
        } else {
            System.out.println("Lỗi: Điểm giữa kỳ (" + diemGK + ") không hợp lệ. Đã chặn cập nhật.");
        }
    }
    public void setDiemCK(double diemCK) {
        if (diemCK >= 0 && diemCK <= 10) {
            this.diemCK = diemCK;
        } else {
            System.out.println("Lỗi: Điểm cuối kỳ không hợp lệ (phải từ 0-10). Đã chặn cập nhật.");
        }
    }
    public double diemTrungBinh() {
        return (this.diemCC * 0.1) + (this.diemGK * 0.3) + (this.diemCK * 0.6);
    }
}
public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Văn A", 9.0, 8.0, 7.5);
        Student sv2 = new Student("SV002", "Trần Thị B", 10.0, 9.0, 9.0);
        Student sv3 = new Student("SV003", "Lê Văn C", 7.0, 6.5, 8.0);
        System.out.println("--- THÔNG TIN SINH VIÊN BAN ĐẦU ---");
        inThongTin(sv1);
        inThongTin(sv2);
        inThongTin(sv3);

        System.out.println("\n KIỂM TRA RÀNG BUỘC SETTER ");
        
        sv1.setDiemGK(-1); 
        sv1.setDiemGK(11);

        System.out.println("\n THÔNG TIN SV1 SAU KHI CỐ GẮNG SET ĐIỂM SAI");
        inThongTin(sv1); 

        System.out.println("\n KIỂM TRA TÍNH ĐỘC LẬP GIỮA CÁC SINH VIÊN ");

        sv2.setDiemCK(5.0); 
        System.out.println("Đã đổi điểm cuối kỳ của SV002 thành 5.0.");
        
        inThongTin(sv1); 
        inThongTin(sv2);
        inThongTin(sv3);
    }
    private static void inThongTin(Student sv) {
        System.out.println("MSSV: " + sv.getMssv() + " | Tên: " + sv.getName() + " | ĐTB: " + sv.diemTrungBinh());
    }
}