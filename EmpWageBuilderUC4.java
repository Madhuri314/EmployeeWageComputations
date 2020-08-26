public class EmpWageBuilderUC4{
        public static final int isPartTime=1;
        public static final int isFullTime=2;
        public static final int ratePerHour=20;

        public static void main(String args[]){
                int empHours=0;
                int empWagesPerDay=0;

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

                empWagesPerDay=empHours*ratePerHour;
                System.out.println("Employee Wage for a day: "+empWagesPerDay);
        }
}
