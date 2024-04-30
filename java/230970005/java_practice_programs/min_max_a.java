public class min_max_a {
    public static void main(String[] args) {
        String s1 = "abcbcadghacbdmnbabb";
        int mina1 = -1, mina2 = -1, maxa1 = -1, maxa2 = -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; // Initialize min and max distances

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                if (mina1 == -1) {
                    mina1 = i; // First occurrence of 'a'
                } else {
                    mina2 = i; // Second occurrence of 'a'
                    int distance = mina2 - mina1;
                    if (distance < min) {
                        min = distance; // Update min distance
                        mina1 = mina2; // Update the first occurrence
                    }
                    if (distance > max) {
                        max = distance; // Update max distance
                        maxa1 = mina1; // Update the first occurrence
                        maxa2 = mina2; // Update the second occurrence
                    }
                    mina1 = mina2;
                }
            }
        }

        // Print results
        if (mina1 != -1 && mina2 != -1) {
            System.out.println("Minimum distance between 'a's: " + min);
            System.out.println("Maximum distance between 'a's: " + max);
            System.out.println("First occurrence of 'a' for maximum distance: " + maxa1);
            System.out.println("Second occurrence of 'a' for maximum distance: " + maxa2);
        } else {
            System.out.println("No occurrences of 'a' found.");
        }
    }
}