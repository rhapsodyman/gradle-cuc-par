package gradle.cuc.parallel;

public class JustAClass {

    public static void main(String[] args) {
        System.out.println("Inside the JustAClass");

        System.out.println("Args count is" + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(">>>>>>>>>>>>>>>" + args[i]);

        }

        String val = System.getProperty("syst", "default");
        System.out.println(val);

    }
}
