public class Compare {
    public static void main(String[] args) {
        if(args.length > 0){
            if(args.length == 2){
                int compare = args[0].compareTo(args[1]);
                if(compare == 0){
                    System.out.println("first equal than second one");
                }
                else if (compare > 0) {
                    System.out.println("first greater than second one");
                }
                else {
                    System.out.println("first less than second one");
                }
            }
        }
        else {
            System.out.println("There's no arugments\nplease enter 2 inputs");
        }
    }
}