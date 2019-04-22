package main.java.builder;

public class CarPlanBuilder implements CarPlan {
    
    private String type;
    private String part;
    
    public void setCarType(String type) {
        this.setType(type);
    }
    
    public void setCarPart(String part) {
        this.setPart(part);
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
