package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1. Написать программу, которая выведет все элементы листа.

        List<String> box = new ArrayList<>();
        box.add("1");
        box.add("4");
        box.add("8");
        box.add("22");
        for (String str : box) {
            System.out.println(str);
        }

//      2. Даны числа от 1 до 100 (цикл).
//      Необходимо создать список и добавить в него все числа, которые не кратны 3 и 5.

        List<Integer> num = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                num.add(i);
            }
        }
        System.out.println(num);
//    3. Элементы целочисленного массива записать в очередь.
//    Написать функцию извлечения элементов из очереди до тех пор,
//    пока первый элемент очереди не станет четным.

        int[] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        Queue<Integer> queue = new LinkedList<>();
        for (Integer j : arr) {
            queue.add(j);
        }
        for (int m : queue) {
            if (m % 2 != 0) {
                queue.poll();
            } else {
                break;
            }
            System.out.println(queue);
        }

//        4. Дан List, который содержит дубликаты, необходимо избавиться от них.

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("8");
        list.add("22");

        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

//        5. Дан Set слов, необходимо вывести все слова, содержащие 5 букв.

        Set<String> words = new HashSet<>();
        words.add("cat");
        words.add("dogs");
        words.add("animal");
        words.add("panda");
        words.add("tiger");
        words.add("mouse");

        System.out.println(words);

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
        //6.
        str();
    }

    // 6. Написать метод, который принимает строку и возвращает коллекцию, содержащую уникальные буквы в слове.
    public static void str() {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Set<String> sList = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    sList.add(String.valueOf(s.charAt(i)));
                }
            }
        }
        System.out.println(sList);
    }
}



