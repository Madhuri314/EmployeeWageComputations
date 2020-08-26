public class EmpWageBuilderUC2{
        public static final int isPresent=1;
        public static final int ratePerHour=20;

        public static void main(String args[]){
                int empHours=0;
                int empWagesPerDay=0;

                double randomCheck=Math.floor(Math.random()*10)%2;

                if(randomCheck==isPresent){
                        System.out.println("Employee is present");
                        empHours=8;
                }
                else{
                        System.out.println("Employee is absent");
								empHours=0;
                }

                empWagesPerDay=empHours*ratePerHour;
                System.out.println("Employee Wage for a day: "+empWagesPerDay);
        }
}
