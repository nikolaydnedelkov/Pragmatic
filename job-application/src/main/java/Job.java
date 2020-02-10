import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("jobs")
public class Job {

    @ExcelRow
    private int rowIndex;

    @ExcelCell(0)
    private String profession;

    @ExcelCell(1)
    private String category;

    @ExcelCell(2)
    private String companyName;

    @ExcelCell(3)
    private int yearsOfExperiance;

    public int getRowIndex() {
        return rowIndex;
    }

    public String getProfession() {
        return profession;
    }

    public String getCategory() {
        return category;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    @Override
    public String toString() {
        return "Job{" +
                "rowIndex=" + rowIndex +
                ", profession='" + profession + '\'' +
                ", category='" + category + '\'' +
                ", companyName='" + companyName + '\'' +
                ", yearsOfExperiance=" + yearsOfExperiance +
                '}';
    }
}
