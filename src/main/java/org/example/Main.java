package org.example;
import java.util.Stack;


public class Main {


    // String alıp boolean döndüren method
    public static boolean checkForPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Boş veya null ise false döndür
        }

        // 1. Harfleri küçült ve sadece harfleri içeren bir string oluştur
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Stack kullanarak ters string oluştur
        Stack<Character> stack = new Stack<>();
        for (char ch : cleanStr.toCharArray()) {
            stack.push(ch);
        }
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);

/*        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        // 3. Orijinal işlenmiş string ile tersini karşılaştır
        return cleanStr.equals(reversedStr.toString());*/


    }
//Convert Decimal Numbers To Binary*******************************

    public static String convertDecimalToBinary(int number){
        if (number == 0) {
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2); // Kalanları stack içine ekle
            number /= 2;
        }
        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop()); // Stack'ten çekerek binary dizisini oluştur
        }
        return binaryString.toString();

    }

    public static void main(String[] args) {
        // Kullanıcıdan input alma
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String input = scanner.nextLine();
        scanner.close();

        // Metodun çağrılması ve sonucu ekrana yazdırma
        if (checkForPalindrome(input)) {
            System.out.println("Girilen metin bir palindromdur.");
        } else {
            System.out.println("Girilen metin bir palindrom değildir.");
        }


        System.out.println("Veri Yapıları Challenge II ***********************************");

        WorkintechList<String> myList = new WorkintechList<>();

        // Elemanları ekleme
        myList.add("Zebra");
        myList.add("Apple");
        myList.add("Monkey");
        myList.add("Banana");
        myList.add("Apple"); // Aynı eleman eklenmeyecek!

        System.out.println("Eklenenler: " + myList);

        // Sıralama
        myList.sort();
        System.out.println("Sıralı Liste: " + myList);

        // Silme ve tekrar sıralama
        myList.remove("Monkey");
        System.out.println("Silindikten sonra sıralı liste: " + myList);



        System.out.println("Convert Decimal Numbers To Binary ***********************************");

        System.out.println(convertDecimalToBinary(5));  // 101
        System.out.println(convertDecimalToBinary(6));  // 110
        System.out.println(convertDecimalToBinary(13)); // 1101
        System.out.println(convertDecimalToBinary(0));  // 0
        System.out.println(convertDecimalToBinary(42)); // 101010

    }

}