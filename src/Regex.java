

    public class Regex {
        public static void main(String[] args) {
            String email = "p.nwankwo@native.semicolon.africa";

            System.out.println(isValidEmail(email));

        }

        public static boolean isValidEmail(String email) {
            if(email == null){
                return false;
            }

            if(email.trim().isEmpty()){
                return false;
            }

            String regex = "[A-Za-z0-9._%+-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,}";
            return email.matches(regex);
        }

    }


