public class Patient {
    private  int id;
    private  String name;
    private  int birthYear;
    private  double height;
    private  double weight;

    private  String bloodGroup;
    private  String phoneNumber;
    public Patient(int id, String name,int birthYear, double height,double weight,String bloodGroup,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        if(birthYear > 0){
            this.birthYear = birthYear;
        }else {
            System.out.println("error");
        }
        if(height > 0.0){
            this.height = height;
        }else {
            this.height = -1*height;
        }
        if(weight > 0.0){
            this.weight = weight;
        }else {
            this.weight = -1*weight;
        }
        if(bloodGroup.equals("O") || bloodGroup.equals("A") || bloodGroup.equals("B")){
            this.bloodGroup = bloodGroup;
        }else {
            System.out.println("error");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge(int currentYear){
        return currentYear-this.birthYear;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
    public String phoneNumber() {
        return phoneNumber;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BloodGroup: " + bloodGroup);
        System.out.println("Patient PhoneNumber: " + phoneNumber);
        System.out.println("BMI: " + getBMI());
    }

    public double getBMI(){
        return weight/(height*height*0.0001);
    }

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "O", "0958675025");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "A", "0897594444");
        invalidPatient.displayDetails(currentYear);
    }
}