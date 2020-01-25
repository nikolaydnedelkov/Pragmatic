package lecture.two.homework;

public class CTO implements IDeveloper, IQA, IManager, ISystemAdmin {
    @Override
    public void buildSoftware() {
        System.out.println("CTO is building Software");
    }

    @Override
    public void makeCodeReview() {
        System.out.println("CTO is making code review");
    }

    @Override
    public void menagePeople() {
        System.out.println("CTO is managing people");
    }

    @Override
    public void drinkCoffeeAllDay() {
        System.out.println("CTO refuses to drink coffee all day and works his ass off");
    }

    @Override
    public void verifySoftwareQuality() {
        System.out.println("CTO is verifying software quality");
    }

    @Override
    public void configureMachine() {
        System.out.println("CTO is configuring the machine");
    }

    @Override
    public void supportSoftware() {
        System.out.println("CTO is supporting software");
    }
}
