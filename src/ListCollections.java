import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCollections {
    public static void main(String[] args) {
        //a. List Nama makanan minimal 10 data
        ArrayList<String> food = new ArrayList<>();
        food.add("Nasi Goreng");
        food.add("Soto");
        food.add("Ketoprak");
        food.add("Nasi Uduk");
        food.add("Bubur Ayam");
        food.add("Pecel Ayam");
        food.add("Bakso");
        food.add("Mie Ayam");
        food.add("Lontong Sayur");
        food.add("Sop Buntut");
        System.out.println(food);

        //b. List Tahun Piala Dunia minimal 3 data
        List<Integer> wordCup = Arrays.asList(2010,2014,2018);
        System.out.println(wordCup);

        //c. Implement sort pada list nama provinsi minimal 10 data secara descending
        ArrayList<String> province = new ArrayList<>();
        province.add("DKI Jakarta");
        province.add("Jawa Barat");
        province.add("Jawa Tengah");
        province.add("Daerah Istimewa Yogyakarta");
        province.add("Jawa Timur");
        province.add("Bali");
        province.add("Nusa Tengara Timur");
        province.add("Sumatra Selatan");
        province.add("Kalimantan Selatan");
        province.add("Sulawesi Selatan");
        province.sort(Collections.reverseOrder());
        System.out.println(province);

        //d. Implement penghapusan data untuk 5 data yang berbeda dari list bahasa pemograman yang berisikan 12 data
        ArrayList<String> language = new ArrayList<>();
        language.add("JAVA");
        language.add("PHP");
        language.add("Python");
        language.add("Go");
        language.add("Ruby");
        language.add("C++");
        language.add("TypeScript");
        language.add("JavaScript");
        language.add("Kotlin");
        language.add("Swift");
        language.add("Dart");
        language.add("C#");
        System.out.println(language);

        System.out.println("SETELAH DI REMOVE");
        language.remove(1);
        language.remove(0);
        language.remove(5);
        language.remove(7);// remove parameter index
        language.remove("Dart");// remove parameter value

        for(String output : language){
            System.out.println(output);
        }
    }
}