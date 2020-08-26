public class EmpWageBuilderUC6{
        public static final int isPartTime=1;
        public static final int isFullTime=2;
        public static final int ratePerHour=20;
        public static final int numberofWorkingDays=20;
        public static final int maxHour=100;

        public static void main(String args[]){
                int empHours=0;
                int totalEmpHour=0;
                int totalWorkingDays=0;
                int totalSalary=0;

                while(totalEmpHour <= maxHour && totalWorkingDays < numberofWorkingDays){
                        totalWorkingDays++;
                        int randomCheck=(int)Math.floor(Math.random()*10)%3;

                        switch(randomCheck){
                                case isFullTime:
                                        System.out.println("Employee is fulltime present");
                                        empHours=8;
                                        break;
                                case isPartTime:
                                        System.out.println("Employee is present parttime");
                                        empHours=4;
                                        break;
                                default:
                                        System.out.println("Employee is absent");
                                        empHours=0;
                                        break;
                        }

                        totalEmpHour+=empHours;
                        System.out.println("Day:"+totalWorkingDays+" Emp Hours:"+ empHours);
                }
                totalSalary=totalEmpHour*ratePerHour;
                System.out.println("Salary of employee: "+totalSalary);
        }
}
