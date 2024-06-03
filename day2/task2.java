package day2;

public class task2 {
    /**
     * @param marks
     * @param fullmark
     * @return
     */
            
        public static double calcBMI(double marks, double fullmark) {
                return (marks / fullmark)*100;
                
        }
                    public static String getStatus(double marks) {
                        if (marks< 85) {
                            return "EXCLENT";
                        } else if (marks < 75) {
                            return "v.good";
                        } else if (marks < 50) {
                            return "pass";
                        } else {
                            return "fail";
                        }
                    }
        
    }
       
        
    
    


