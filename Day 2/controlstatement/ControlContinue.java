//Day 2 Assignment 2 ii
class ControlContinue {
    public static void main(String[] args) {
        boolean bool = true;
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                System.out.print(j +"\t");
                if(j>5){
                    System.out.println();
                    continue;
                }
            }
            System.out.println("Outer Loop");
        }
        System.out.println("End");
    }
}
   
