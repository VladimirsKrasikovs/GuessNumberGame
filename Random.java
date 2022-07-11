public class Random {
    public static void main(String[] args) {

        int number = (int) (Math.random()*20);
        System.out.println(number);
        while (true){
            Scanner sc =new Scanner(System.in);
            System.out.println("Please guess number");
            int gesNumber = sc.nextInt();
            if(gesNumber>number) {
                System.out.println("Your number is bigger");
            }else if (gesNumber<number){
                System.out.println("Your number is smaller");
            }else {
                System.out.println("Good");
            break;
            }

        }
    }
}
