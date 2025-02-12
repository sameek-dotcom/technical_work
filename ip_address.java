import java.util.regex.Pattern;
public class ip_address {
    public static boolean isValid_IP(String ip) {
        String address= "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                        +"(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                        +"(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                        +"(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
                        return Pattern.matches(address,ip);
    }

    public static void main(String[] args) {
        System.out.println(isValid_IP("222.111.111.111"));
        System.out.println(isValid_IP("5555..555"));
        System.out.println(isValid_IP("0.0.0.255"));
        System.out.println(isValid_IP("190.0.0.255"));
    }
}
