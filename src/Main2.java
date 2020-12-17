import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int num = 1;
        while (!list.isEmpty()) {
            if (!stack.isEmpty() && (stack.peek().equals(list.get(0)))) {
                stack.pop();
                list.remove(0);
                sb.append('-');
                sb.append('\n');
            } else {
                stack.push(num++);
                sb.append('+');
                sb.append('\n');
            }
            if (num > n + 1) {
                System.out.println("NO");
                break;
            }
        }
        if (list.isEmpty()) {
            System.out.println(sb.toString());
        }

    }
}


