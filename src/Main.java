public class Main {
    public static void main(String[] args) {
        String str = "wssw";
        System.out.println(readTwo(str));
    }
    public static boolean readTwo (String args){
        return args.equals(new StringBuilder(args).reverse().toString());
    }

}