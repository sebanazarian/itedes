public abstract class Animal{
    private Integer age;
    private Double weight;
    private String name;

    //Constructor
    public Animal(Integer age, Double weight, String name) {
        this.age = 0;
        this.weight = weight;
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public Double getWeight(){
        return weight;
    }
    public String getName(){
        return  name;
    }

    public void getOlder(){
        age++;
    }

    public void eat(Double food){
        weight+=food;
    }

    public void poop(Double shit){
        weight-=shit;
    }

    public abstract void talk();
}