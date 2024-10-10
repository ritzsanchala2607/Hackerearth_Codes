import java.io.BufferedReader;
import java.io.InputStreamReader;

class Maximum_Border {

    public static int maxBorder(char[][] arr, int rows, int cols) {
        int max = 0;

        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == '#') {
                    count++;
                } else {
                    count = 0;  
                }
                max = Math.max(max, count);
            }
        }

        for (int j = 0; j < cols; j++) {
            int count = 0;
            for (int i = 0; i < rows; i++) {
                if (arr[i][j] == '#') {
                    count++;
                } else {
                    count = 0;  
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] dimensions = br.readLine().split(" ");
            int rows = Integer.parseInt(dimensions[0]);
            int cols = Integer.parseInt(dimensions[1]);

            char[][] arr = new char[rows][cols];

            for (int i = 0; i < rows; i++) {
                String row = br.readLine();
                arr[i] = row.toCharArray();  
            }

            int result = maxBorder(arr, rows, cols);
            System.out.println(result);
        }
    }
}
