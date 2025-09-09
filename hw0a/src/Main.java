public class Main {
    public static void main(String[] args){
//        starTriangle();
    }

    public static void starTriangle(){
        for(int i=0; i<5; i++){
            String line = "";
            for(int j=0; j<i+1; j++){
                line += '*';
            }
            System.out.println(line);
        }
    }

    public static void printIndexed(){
        
    }
}