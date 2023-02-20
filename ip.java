/**
 * ip
 */
public class ip {

    public static void main(String[] args) {
        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));
    }

    public static long ipsBetween(String start, String end) {
        int s = 0;
        int f = 0;
        String[] str1 = start.split("\\.");
        int[] nums = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            nums[i] = Integer.parseInt(str1[i]);
            s += nums[i] * Math.pow(256, 3 - i);
        }
    
        String[] str2 = end.split("\\.");
        int[] nums2 = new int[str2.length];
        for (int i = 0; i < str2.length; i++) {
            nums2[i] = Integer.parseInt(str2[i]);
            f += nums2[i] * Math.pow(256, 3 - i);
        }
    
        return f - s;
    }
    
}