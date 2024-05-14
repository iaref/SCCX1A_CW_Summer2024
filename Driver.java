public class Driver {
    
    public static void main(String[] args) {
        String[] nameMain = {"aa", "bb", "cc", "dd", "ee", "ff", "gg"};
        int[] ageMain = {1,2,3,4,5,6,7};
        float[] speedMain = {1.10f, 1.20f, 1.30f , 1.40f, 1.50f, 1.60f, 1.70f};
        float[] ramMain = {2.10f ,2.20f , 2.30f , 2.4f , 2.50f, 2.60f, 2.70f};

        ComputersTop[] objs = new ComputersTop[7]; 


        //System.out.println("BEFORE LOOP \n");
        for(int i=0; i<7; i++)
        {
          //  System.out.println("Start Iterations \n"); 
        objs[i] = new ComputersTop(nameMain[i], ageMain[i], speedMain[i], ramMain[i]);
        objs[i].display();
        //System.out.println("End Iterations \n");
        }

        //System.out.println("END LOOP\n");
        // hhhhhhhh
        //kkkkkk
    }
}