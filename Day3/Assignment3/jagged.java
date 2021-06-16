public class jagged {
    public static void main(String[] args) {
        String[][] arr = {{"Tony","Java", "C", "C++"},
                {"Thomas","Java","UNIX"},
                {"Dinil", "Linux", "Oracle"},
                {"Delvin", "RDBMS", "C#","ORACLE"
                }
        }  ;
        int i,j=0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i][j]=="Delvin"){
            for ( j =0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j]+" ");}

                }
                  }
                System.out.println();
            }
        }


