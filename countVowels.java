
public static int countVowels(String text) {
    int count = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < text.length(); i++) {
        if (vowels.contains(String.valueOf(text.charAt(i)))) {
            count++;
        }
    }
    return count;
}
