package day8.Task1;

public class Task1 {
    public static void main(String[] args) {
        String digits = "";
// для String
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++){
            digits = digits + i + "";
        }

        long endTime = System.currentTimeMillis();
        long time1 = endTime - startTime;
        System.out.println(digits);
        System.out.println("для String: " + time1 + "ms");

// для StringBuilder
        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 20000; i++){
            sb.append(i).append("");
        }

        endTime = System.currentTimeMillis();
        long time2 = endTime - startTime;
        System.out.println(sb);
        System.out.println("для StringBuilder: "+ time2 + "ms");
    }
}
