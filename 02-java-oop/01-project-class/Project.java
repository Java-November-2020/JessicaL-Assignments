public class Project {
    private String name;
    private String description;
    private Double initCost;

    public Project(String projName, String projDesc){
        this.name = projName;
        this.description = projDesc;

    }
        //Constructor Methods
    public Project(){

    }
    public String Project(String name){
        this.name = name;
        return name;
    }

    public String Project(String name, String description){
        this.name = name;
        this.description = description;
        return name + description;
    }

        //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setInitCost(Double initCost){
        this.initCost = initCost;
    }

        //Getters
    public String getName(String name){
        return this.name;
    }

    public String getDescription(String description){
        return this.description;
    }

    public Double getInitCost(Double initCost){
        return this.initCost;
    }


        //instance methods
    public String elevatorPitch(String name, String description, Double initCost){
        return name + "(" + initCost + ") : " + description;

    }


}
