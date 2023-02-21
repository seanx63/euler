// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
class q2 {
    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;
        int sum = 0;
        while (curr < 4000000) {
            if (curr % 2 == 0) {
                sum += curr;
            }
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        System.out.println(sum); // 4613732
    }
}
