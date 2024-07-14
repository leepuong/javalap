package lap4;

public class App {
    public static void main(String[] args) {
        StringApp testString1App = new StringApp();

        // ----check String (bai1)----//
        // testString1App.CheckSubString("nhan ra minh dang o quan ba dinh", "bon
        // dinh");

        // ----check char (bai2)----//
        // int ktu = testString1App.CountCharInString("ji jay", 'j');
        // System.out.println("so lan xuat hien cua ki tu la: " + ktu);

        // ----upper case----//
        // String upperStr = testString1App.UpperCaseToString("ji jay");
        // System.out.println("chuoi dc in hoa thanh: " + upperStr);

        // ----check Palinderome----//
        testString1App.isPalindrome("ji jay");
    }
}
