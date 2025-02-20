package company;
public class Employee {
    
    private int empid;
    private String empname;
    private String empdob;
    private String emppod;
    private String empaddress;
    private String empphone;
    private String empemail;

    public void setEmpInfo(int empid, String empname, String empdob, String emppod, String empaddress, String empphone, String empemail) {
        this.empid = empid;
        this.empname = empname;
        this.empdob = empdob;
        this.emppod = emppod;
        this.empaddress = empaddress;
        this.empphone = empphone;
        this.empemail = empemail;
    }

    public int getEmpid() {
        return empid;
    }
    public String getEmpname() {
        return empname;
    }
    public String getEmpdob() {
        return empdob;
    }
    public String getEmppod() {
        return emppod;
    }
    public String getEmpaddress() {
        return empaddress;
    }
    public String getEmpphone() {
        return empphone;
    }
    public String getEmpemail() {
        return empemail;
    }
}
