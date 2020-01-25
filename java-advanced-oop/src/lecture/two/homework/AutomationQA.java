package lecture.two.homework;

public class AutomationQA implements IQA {
    @Override
    public void verifySoftwareQuality() {
        System.out.println("AutomationQA verifying software");
    }

    public void writeAutomationTests(){
        System.out.println("AutomationQA is writing automation tests");
    }
}
