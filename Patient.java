public class Patient {
    private String name;
    private String sex;
    private int age;
    private double weight;
    private String allergies;
    public Patient() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getAllergies() {
        return allergies;
    }
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    @Override
    public String toString() {
        return "姓名：" + name +
                "，性别：" + sex +
                "，年龄：" + age +
                "，过敏史：" + allergies;
    }
}
