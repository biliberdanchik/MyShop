import java.util.*;
import java.util.Scanner;


public class Main {
    //Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf(
                    "1. Заполнить каталог товаров%n" +
                    "2. Добавить новый товар в каталог%n" +
                    "3. Вывести каталог на экран%n" +
                    "4. Добавить товар в корзину%n" +
                    "5. Показать содержимое корзины%n" +
                    "Введите номер действия для выполнения:%n");

            int actionNumber = Integer.parseInt(scanner.nextLine());

            if (Objects.equals(actionNumber, 1)) {
                System.out.println("тут заполнение каталога");

            } else if (Objects.equals(actionNumber, 2)) {
                //Добавление нового товара в каталог
                System.out.println("тут добавляем новый товар в каталог");

            } else if (Objects.equals(actionNumber, 3)) {
                //Вывод каталога на экран
                System.out.println("вывести каталог на экран");

            } else if (Objects.equals(actionNumber, 4)) { //Добавление товара в корзину
                System.out.println("добавление нового товара в корзину");

            } else if (Objects.equals(actionNumber, 5)) { //Просмотр корзины
                System.out.println("содержимое корзины");
            }

            System.out.println("Для выбора следующего действия введите 'next'");

        } while (Objects.equals(scanner.nextLine(), "next"));


        //Заполнение каталога
        HashMap<Integer, Product> catalog = new HashMap<>();
        System.out.println("Заполните каталог товарами");
        int i = 0;
        do {
            catalog.put(i, Product.getProductAfterScanner(scanner, i));
            i++;
            System.out.println("Для добавления следующей позиции в каталог введите '+'");
        } while (Objects.equals(scanner.nextLine(), "+"));

        //Вывод каталога на экран
        System.out.println("Текущий каталог:");
        for (int j = 0; j < catalog.size(); j++) {
            System.out.printf("%d %s (Страна: %s, Остаток: %.2f)%n",
                    catalog.get(j).getId(),
                    catalog.get(j).getName(),
                    catalog.get(j).getCountry(),
                    catalog.get(j).getBalance());
        }

        System.out.println("Для добавления товара в корзину введи его номер из каталога: ");



    }




}


