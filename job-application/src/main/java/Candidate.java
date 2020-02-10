
import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("candidates")
public class Candidate {

    @ExcelRow
    private int rowIndex;

    @ExcelCell(0)
    private String name;

    @ExcelCell(1)
    private String familyName;

    @ExcelCell(2)
    private int age;

    @ExcelCell(3)
    private long phoneNumber;

    @ExcelCell(4)
    private String profession;

    @ExcelCell(5)
    private String jobCategory;

    @ExcelCell(6)
    private int yearsOfExperience;

    public int getRowIndex() {
        return rowIndex;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "rowIndex=" + rowIndex +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", profession='" + profession + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
