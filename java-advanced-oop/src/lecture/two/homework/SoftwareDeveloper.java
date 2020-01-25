package lecture.two.homework;

public class SoftwareDeveloper implements IDeveloper{
    @Override
    public void buildSoftware() {
        System.out.println("Software Developer is building Software");
    }

    @Override
    public void makeCodeReview() {
        System.out.println("Software Developer is making code review");
    }
}

