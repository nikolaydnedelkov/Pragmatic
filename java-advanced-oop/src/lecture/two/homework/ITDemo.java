package lecture.two.homework;

public class ITDemo {
    public static void main(String[] args) {
        CTO cto = new CTO();
        AutomationQA automationqa = new AutomationQA();
        DevOps devops = new DevOps();
        SoftwareDeveloper softdev = new SoftwareDeveloper();

        cto.buildSoftware();
        cto.drinkCoffeeAllDay();
        cto.menagePeople();

        System.out.println("<------------------------------------>");

        automationqa.verifySoftwareQuality();
        automationqa.writeAutomationTests();

        System.out.println("<------------------------------------>");

        devops.buildSoftware();
        devops.supportSoftware();

        System.out.println("<------------------------------------>");

        softdev.buildSoftware();
        softdev.makeCodeReview();

    }

}
