class Employee{
    float Salary=50000;
}

class JavaProgrammer extends Employee{
    int bonus=50000;

    public static void main(String[] args) {
        JavaProgrammer nilkshi = new JavaProgrammer();

        System.out.println("JavaProgrammer Salary is: "+nilkshi.Salary);
        System.out.println("JavaProgrammer Salary is: "+nilkshi.bonus);
        System.out.println("JavaProgrammer Gross Salary is: "+(nilkshi.bonus+nilkshi.Salary));
    }
}