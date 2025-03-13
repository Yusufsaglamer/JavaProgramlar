public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }




     double tax(){
        if (salary>1000){
          return  this.salary*0.03;
        }
        return 0.0;
        }

        double bonus(){
        if (workHours>40){
           return (workHours-40)*30;
        }
        return 0.0;
        }
        double raiseSalary(){
        if (2021-hireYear<10){
            return salary*0.05;
        }
        if (2021-hireYear>=10 && 2021-hireYear<20 ){
            return salary*0.10;
        }
        if (2021-hireYear>20){
           return salary*0.15;
        }
        return 0.0;
        }

       public  String toString(){
        double salarywithtaxnadbonus=this.salary+bonus()-tax();
        double totalSalary=this.salary+bonus()-tax()+raiseSalary();

        return "Name:"+this.name+"\n"+
                "Salary:"+this.salary+"\n"+
                "WorkHours:"+this.workHours+"\n"+
                "HireYear:"+this.hireYear+"\n"+
                "Tax:"+tax()+"\n"+
                "Bonus:"+bonus()+"\n"+
                "Salary Raise:"+raiseSalary()+"\n"+
                "Salary with tax and bonus:"+salarywithtaxnadbonus+"\n"+
                "Total Salary:"+totalSalary;


        }

    }
