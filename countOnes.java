
  public static int countOnes(int value) {
      String text = (String.valueOf(value));
      int count = 0;
      String ones = "13579";
      for (int i = 0; i < text.length(); i++) {
          if (ones.contains(String.valueOf(text.charAt(i)))) {
              count++;
          }
      }
      return count;
  }
