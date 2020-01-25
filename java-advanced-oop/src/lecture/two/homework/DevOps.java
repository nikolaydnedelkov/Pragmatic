package lecture.two.homework;

public class DevOps implements IDeveloper,ISystemAdmin {
    @Override
    public void buildSoftware() {
        System.out.println("DevOps building sofware");
    }

    @Override
    public void makeCodeReview() {
        System.out.println("DevOps making code review");
    }

    @Override
    public void configureMachine() {
        System.out.println("DevOps configure Machine");
    }

    @Override
    public void supportSoftware() {
        System.out.println("DevOps supporting software");
    }
}
