import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for(int num : nums){
            if(num % 2 == 1){
                System.out.println(num);
            }
        }

        System.out.println();

        int uniqNum = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if(num% 2== 0 && num != uniqNum ){
                uniqNum=num;
                System.out.println(uniqNum);
            }
        }

        System.out.println();

        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.add("truck");
        uniqueWords.add("car");
        uniqueWords.add("truck");
        uniqueWords.add("bike");
        uniqueWords.add("car");

        System.out.println(uniqueWords);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> words1 = new HashSet<>(strings);
        System.out.println(strings.size() - words1.size());
        }
    }