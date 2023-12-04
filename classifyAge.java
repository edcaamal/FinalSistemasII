
public static String classifyAge(int age) {
    if (age >= 0 && age <= 5) {
        return "Baby";
    } else if (age >= 6 && age <= 10) {
        return "Child";
    } else if (age >= 11 && age <= 17) {
        return "Puberto";
    } else if (age >= 18 && age <= 30) {
        return "Adult";
    } else if (age >= 31 && age <= 50) {
        return "Veteran";
    } else if (age >= 51 && age <= 60) {
        return "Senior Adult";
    } else if (age >= 61 && age <= 70) {
        return "Old Age";
    } else {
        return "Unknown age classification";
    }
}
  
