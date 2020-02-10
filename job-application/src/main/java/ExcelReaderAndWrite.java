import com.google.common.collect.ImmutableList;
import com.poiji.bind.Poiji;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcelReaderAndWrite {
    public static final String JOBS_FILE_PATH = "C:\\Users\\Pc\\IdeaProjects\\job-application\\src\\main\\resources\\jobs.xlsx";
    public static final String CANDIDATES_FILE_PATH = "C:\\Users\\Pc\\IdeaProjects\\job-application\\src\\main\\resources\\candidates.xlsx";

    public static void main(String[] args) throws IOException {


        List<Job> extractedJobs = Poiji.fromExcel(new File(JOBS_FILE_PATH), Job.class);
        ImmutableList<Job> jobs = ImmutableList.copyOf(extractedJobs);

        List<Candidate> extractedCandidates = Poiji.fromExcel(new File(CANDIDATES_FILE_PATH), Candidate.class);
        ImmutableList<Candidate> candidates = ImmutableList.copyOf(extractedCandidates);


        List<Employee> employees = new ArrayList<>();

        jobs.forEach(j -> {
            for (int i = 0; i < candidates.size(); i++) {
                if (candidates.get(i).getYearsOfExperience() >= j.getYearsOfExperiance()
                        && candidates.get(i).getJobCategory().equals(j.getCategory())
                        && candidates.get(i).getProfession().equals(j.getProfession())) {
                    employees.add(new Employee(j.getCompanyName(), j.getProfession(), candidates.get(i).getName(), candidates.get(i).getFamilyName(), candidates.get(i).getPhoneNumber(), new Date()));
                }
            }
        });


        String[] columns = {"Company", "Profession", "Name", "Family Name", "Phone Number", "Date of Contact"};

        XSSFWorkbook workbook = new XSSFWorkbook();

        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        XSSFSheet sheet = workbook.createSheet("Employee");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.BLUE.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-MM-dd"));

        // Create Other rows and cells with employees data
        int rowNum = 1;
        for(Employee employee: employees) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(employee.getCompany());

            row.createCell(1)
                    .setCellValue(employee.getProfession());

            row.createCell(2)
                    .setCellValue(employee.getName());

            row.createCell(3)
                    .setCellValue(employee.getFamilyName());

            row.createCell(4)
                    .setCellValue(employee.getPhoneNumber());

            Cell dateOfBirthCell = row.createCell(5);
            dateOfBirthCell.setCellValue(employee.getJobStartDate());
            dateOfBirthCell.setCellStyle(dateCellStyle);


        }

        // Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }


        FileOutputStream fileOut = new FileOutputStream("employees.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();

    }
}