package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-----------------------");
        //Test Metotları
        testIsPalindrome();
        testIsPerfectNumber();
        testNumberToWords();
    }
    public static boolean isPalindrome(int number) {
        // Negatif sayıları pozitif yapmak için işaretini ters çeviriyoruz
        int onlyNumber = Math.abs(number);
        int reversedNumber = 0;
        int temporaryNumber = onlyNumber;
        // Sayıyı ters çevirmek için döngü
        while (temporaryNumber > 0) {
            int lastDigit = temporaryNumber % 10; // Son basamağı al
            reversedNumber = (reversedNumber * 10) + lastDigit; // Tersine ekle
            temporaryNumber /= 10; // Son basamağı at
        }
        // Ters çevrilmiş sayı ile orijinal sayıyı karşılaştır
        return onlyNumber == reversedNumber;
    }
    public static void testIsPalindrome(){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-----------------------");
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false; // Negatif sayılar için false döner.
        }
        int total = 1; // 1 her sayının böleni olduğu için toplama baştan ekliyoruz.

        // Döngüyü sadece √number'a kadar çalıştırıyoruz.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { // Eğer i, bölense
                total += i; // i'yi ekle
                if (i != number / i) { // Aynı böleni tekrar eklememek için kontrol
                    total += number / i;
                }
            }
        }
        return number == total; // Toplam, sayıya eşitse true döner.
    }
    public static void testIsPerfectNumber(){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-----------------------");
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value"; // Negatif sayılar için geçersiz değer döndürülür.
        }

        String result = ""; // Sonuç için boş bir string oluşturuyoruz.

        // Sayıyı string'e dönüştürüp her rakama karşılık gelen kelimeleri yazdırıyoruz.
        while (number > 0) {
            int digit = number % 10; // Son basamağı alıyoruz.
            switch (digit) {
                case 0: result = "Zero " + result; break;
                case 1: result = "One " + result; break;
                case 2: result = "Two " + result; break;
                case 3: result = "Three " + result; break;
                case 4: result = "Four " + result; break;
                case 5: result = "Five " + result; break;
                case 6: result = "Six " + result; break;
                case 7: result = "Seven " + result; break;
                case 8: result = "Eight " + result; break;
                case 9: result = "Nine " + result; break;
            }
            number = number / 10; // Son basamağı sayılardan çıkarıyoruz.
        }

        return result.trim(); // Sonuçta fazla boşlukları temizliyoruz ve döndürüyoruz.
    }


    public static void testNumberToWords() {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }


}
