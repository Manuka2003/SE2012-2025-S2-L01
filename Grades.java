 public static String grade(int var0) {
        if (var0 >= 90) {
            return " Grade A";
        } else if (var0 >= 80) {
            return " Grade B";
        } else if (var0 >= 70) {
            return " Grade C";
        } else {
            return var0 >= 60 ? "Grade D" : "Fail";
        }
    }
		
		