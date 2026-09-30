class Student {
    private static int counter = 0;
    private String mssv;
    private String name;
    private double diemcc;
    private double diemgk;
    private double diemck;
    private String email;
    private String sdt;
    public Student(String name, double diemcc, double diemgk, double diemck) {
        counter++;
        this.mssv = String.format("B21DCCN%03d", counter);
        this.name = name;
        setdiemcc(diemcc);
        setdiemgk(diemgk);
        setdiemck(diemck);
    }
    public Student capnhatemail(String email) {
        this.email = email;
        return this;
    }
    public Student capnhatsdt(String sdt) {
        this.sdt = sdt;
        return this;
    }
    public static int gettotalstudents() {
        return counter;
    }
    public String getmssv() {
        return mssv;
    }
    public String getname() {
        return name;
    }
    public String getemail() {
        return email;
    }
    public String getsdt() {
        return sdt;
    }
    public double getdiemcc() {
        return diemcc;
    }
    public double getdiemgk() {
        return diemgk;
    }
    public double getdiemck() {
        return diemck;
    }
    public void setdiemcc(double diemcc) {
        if (diemcc >= 0 && diemcc <= 10) this.diemcc = diemcc;
    }
    public void setdiemgk(double diemgk) {
        if (diemgk >= 0 && diemgk <= 10) this.diemgk = diemgk;
    }
    public void setdiemck(double diemck) {
        if (diemck >= 0 && diemck <= 10) this.diemck = diemck;
    }
    public double diemtrungbinh() {
        return (this.diemcc * 0.1) + (this.diemgk * 0.3) + (this.diemck * 0.6);
    }
}