public class PavelJanicekExcercise {
    private static String getOutput(int i){

        if (i % 3 == 0 && i % 5 ==0){
            return new String("Testing");
        }
        if (i %3 ==0){
            return  new String("Software");
        }

        if (i % 5 == 0){
            return new String("Agile");
        }

        return String.valueOf(i);
    }

    public static void main(String[] args) {

        for (int i =100;i>0;i--){
            System.out.println(getOutput(i));
        }

    }
}
