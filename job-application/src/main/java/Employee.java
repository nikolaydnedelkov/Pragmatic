import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String name;
    private String familyName;
    private long phoneNumber;
    private String profession;
    private String company;
    private Date jobStartDate;


    public Employee(String company, String profession, String name, String familyName, long phoneNumber, Date jobStartDate) {
        this.name = name;
        this.familyName = familyName;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.company = company;
        this.jobStartDate = jobStartDate;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public String getCompany() {
        return company;
    }

    public Date getJobStartDate() {
        return jobStartDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", profession='" + profession + '\'' +
                ", company='" + company + '\'' +
                ", jobStartDate=" + jobStartDate +
                '}';
    }
}
