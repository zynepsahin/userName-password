import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String userName, password;
        int select;

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika"))
            if (password.equals("java123"))
                System.out.println("Giriş yaptınız!");
            else {
                System.out.println("Yanlış şifre girdiniz. Şifrenizi sıfırlamak istiyor musunuz?\n1-Evet\t2-Hayır");
                select = inp.nextInt();
                switch (select) {
                    case 1:
                        createPassword(password);
                        break;

                    case 2:
                        System.out.println("Tekrar deneyiniz");
                        break;
                }
            }
        else
            System.out.print("Kullanıcı adı veya şifre yanlış");

    }

    public static void createPassword(String newPassword) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Yeni şifre:");
        newPassword = inp.nextLine();

        while (newPassword.equals("java123")) {
            System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
            newPassword = inp.nextLine();
        }
        System.out.println("Şifre oluşturuldu");
    }

}