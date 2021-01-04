public class Word {
        public static void main(String[] args) {

            char[] word = {'k', 'a', 'r', 'a', 'm','b','a'};

            for (int i = word.length - 1; i > 0; i--) {
                if (word[i] == 'a') {
                    System.out.println("indeks ostatniej litery 'a' to " + i);
                    break;
                }
            }
        }
    }
