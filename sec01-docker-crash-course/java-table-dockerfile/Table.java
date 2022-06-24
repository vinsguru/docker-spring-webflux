public class Table{

    public static void main(String[] args){

        String input = System.getenv("input");
        System.out.println("Received Input : " + input);

        if(null == input) return;

        int value = Integer.parseInt(input);
        for(int i = 1; i <= value; i++){
            System.out.printf("%d * %d = %d\n", i, value, (i * value));
        }

    }

}