import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> boxers = List.of("幕之内一歩", "宮田一郎", "千堂武士", "鷹村守", "間柴了");

        /*名前に"一"を含むもののみをフィルタリング*/
        List<String> result1 = boxers.stream()
                .filter(name -> name.contains("一"))
                .collect(Collectors.toList());

        System.out.println(result1);

        /*名前を並べ替え(自然順序)*/
        List<String> result2 = boxers.stream().sorted().toList();

        System.out.println(result2);

        /*名前が"鷹"から始まるものだけを数えてフィルタリング*/
        long count = boxers.stream().filter(name -> name.startsWith("鷹")).count();

        System.out.println(count);

        /*名前が"幕之内"と一致するものだけをフィルタリング*/
        boolean hasMakunouchi = boxers.stream().anyMatch(name -> name.equals("幕之内"));
        
        System.out.println(hasMakunouchi);

        /*メソッド参照：Listに格納されているものを一つずつ標準出力*/
        boxers.forEach(System.out::println);
    }
}
