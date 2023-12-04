  public static int getAsciiValue(String cadena) {
    int suma = 0;
    for (int i = 0; i < cadena.length(); i++) {
      char character = cadena.charAt(i);
      suma += (int) character;
    }
    return suma;
  }
