import java.util.Random;
class Password{
   public static void main(String[] args) {
      System.out.println(generatePassword(8));
   }

   private static char[] generatePassword(int length) {
      String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
      String specialChar = "!@#$";
      String num = "1234567890";
      String combined = upperCase + lowerCase + specialChar + num;
      Random random = new Random();
      char[] password = new char[length];
      password[0] = lowerCase.charAt(random.nextInt(lowerCase.length()));
      password[1] = upperCase.charAt(random.nextInt(upperCase.length()));
      password[2] = specialChar.charAt(random.nextInt(specialChar.length()));
      password[3] = num.charAt(random.nextInt(num.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combined.charAt(random.nextInt(combined.length()));
      }
      return password;
   }
}