import java.util.Arrays;

public class main {
    public static void arr(String[] args) {

        String[] arr_in = { "secret", "3", "2", "checkout", "The" };
        int n = arr_in.length;
        int count = 0;
        int x = 0;

        for (int i = 0; i < n; i++) {
            if (arr_in[i].length() <= 3) {
                count++;
            }
        }
        String[] arr_out = new String[count];
        for (int j = 0; j < n; j++) {
            if (arr_in[j].length() <= 3) {
                arr_out[x] = arr_in[j];
                x++;
            }
        }
        System.out.println(Arrays.toString(arr_in));
        System.out.println(Arrays.toString(arr_out));

    }
}