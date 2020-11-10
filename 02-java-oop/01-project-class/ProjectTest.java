public class ProjectTest {
    public static void main(String[] args){
    
        Project proj = new Project();
            // single parameter method signature
            String justName = proj.Project("BestProject");
            System.out.println(justName);

            // double parameter method signature
            String both = proj.Project("My Project", "This is my project");
            System.out.println(both);

            String pitch = proj.elevatorPitch("Ace Project", "This is my elevator pitch", 450.00);
            System.out.println(pitch);
    }
}
