import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
      
      //definisi variable
      String kalimat1 = "Mufti";
      String kalimat2 = "77Android";
      String kalimat3 = "Java345";
      String kalimat4 = "12345";
      String kalimat5 = "Belajar";

      //Jika imput'kalimat1 adalah Mufti atau mufti = true
      System.out.println(Pattern.matches("[Mm]ufti",kalimat1));

      //Jika nilai input di awal angka maka = false
      System.out.println(Pattern.matches("^[^\\d].*",kalimat2));

      //Sebaliknya jika nilai input di awal bukan angka maka = true
      System.out.println(Pattern.matches("^[^\\d].*",kalimat3));

      /*
      Mengecek input jika lebih dari 2 maka = false
      sebaliknya jika sesuai 2 maka = true
        */
      System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z]","ai"));
      System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z]","mobil"));

      //jika input nilai berupa angka digit, maka = true,
      //jika tidak = false
      System.out.println(Pattern.matches("\\d",kalimat4));

      /*
Akan menampilkan output = true jika kata Belajar merupakan awalan dan akhiran dari input data nilai
      */
      System.out.println(Pattern.matches("^Belajar$",kalimat5));
    }
}