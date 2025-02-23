//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        double balance;
//        boolean iS = false;
//
//
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        double cm_to_inh = 2.54;
//
//        System.out.println("inches     centimeters");
//        System.out.println("......................");
//
//        for (int inch = 1; inch <= 10; inch++) {
//            double cm = inch * cm_to_inh;
//            System.out.println(cm);
//
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("inch"+  "     centimeters");
//        double cm = 0;
//        int inches = 0;
//        for (int i = 0; i < 10; i++) {
//            cm= i * 2.54;
//            System.out.println("inch" +"   " + "cm");
//        }
//
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter you score: ");
//        int score = input.nextInt();
//        if (score >= 60) {
//            System.out.println("You pass the exam!");
//
//
//        }else
//            System.out.println("you do not pass the exam!");
//        input.close();
//
//
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int score;
//        boolean numbersEntered = false; // Track if at least one number was entered
//
//        while (true) {
//            System.out.print("Enter your score: ");
//            score = input.nextInt();
//
//            if (score == -1) {
//                break;
//            }
//
//            numbersEntered = true;
//
//            if (score >= 60) {
//                System.out.println("You pass the exam.");
//            } else {
//                System.out.println("You don't pass the exam.");
//            }
//        }
//
//
//        if (!numbersEntered) {
//            System.out.println("No numbers are entered except 0.");
//        }
//
//        input.close();
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int score;
//        boolean numbersEntered = false; // Track if at least one number was entered
//
//        while (true) {
//            System.out.print("Enter your score: ");
//            score = input.nextInt();
//
//            if (score == -1) {
//                break; // Stop if the input is -1
//            }
//
//            numbersEntered = false; // A number (except -1) was entered
//
//            if (score >= 60) {
//                System.out.println("You pass the exam.");
//            } else {
//                System.out.println("You don't pass the exam.");
//            }
//        }
//
//        // Display message if no valid numbers were entered before -1
//        if (!numbersEntered) {
//            System.out.println("No numbers are entered except 0.");
//        }
//
//        input.close();
//    }

//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int heads = 0;
//        int tails = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            if (random.nextBoolean()) {
//                System.out.println("Toss " + i + ": Heads");
//                heads++;
//            } else {
//                System.ou7t.println("Toss " + i + ": Tails");
//                tails++;
//            }
//        }
//        System.out.println("\nTotal Heads: " + heads);
//        System.out.println("Total Tails: " + tails);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//    //call
//        int c= add(10,30);
//        System.out.println("c = " + c);
//        int d = add (2, 12);
//        System.out.println("d = " + d);
//
//    }
//
//   //add method
//    public static  int add (int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int c = max(12, 10);
//        System.out.println("C = "+ c);
//
//    }
//    public static int max(int a, int b) {
//        int result;
//        if (a > b)
//            result = a;
//        else
//            result = b;
//        return result;
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(sum(1,10));
//        System.out.println(sum(20,30));
//        System.out.println(sum(35,45));
//
//    }
//    public static int sum(int i1, int i2) {
//        int sum = 0;
//        for (int i = i1; i <= i2; i++)
//            sum = sum + i;
//        return sum;
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//         int c = add(10,30);
//         int d = add(c,20);
//         int e = add(c,30);
//         System.out.println(c);
//         System.out.println(d);
//         System.out.println(e);
//
//
//
//    }
//    public static int add (int num1, int num2){
//        int sum =0;
//        sum = num1 + num2;
//        return sum;
//
//    }
//
//}
