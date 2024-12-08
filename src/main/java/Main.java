import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog1 = null;

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
                if (!Catalog.isCatalog()) { //Если каталога не существует, то создать новый
                    HashMap<Integer, Product> newCatalog = new HashMap<>();
                    System.out.println("Заполните каталог товарами");
                    int i = 0;
                    do {
                        newCatalog.put(i, Product.getProductAfterScanner(scanner, i));
                        i++;
                        System.out.println("Для добавления следующей позиции в каталог введите '+'");
                    } while (Objects.equals(scanner.nextLine(), "+"));

                    catalog1 = new Catalog(newCatalog);


                } else {                    //Если существует, то не создаем новый
                    System.out.println("Каталог уже создан, добавь в него новый товар.");

                }

            } else if (Objects.equals(actionNumber, 2)) {
                //Добавление нового товара в каталог
                if (Catalog.isCatalog()) {
                    System.out.println("Введите данные для нового товара");
                    int i = catalog1.getCatalog().size();
                    do {
                        catalog1.getCatalog().put(i, Product.getProductAfterScanner(scanner, i));
                        i++;
                        System.out.println("Для добавления следующей позиции в каталог введите '+'");
                    } while (Objects.equals(scanner.nextLine(), "+"));
                } else {
                    System.out.println("Каталога не существует");
                }
            } else if (Objects.equals(actionNumber, 3)) {
                //Вывод каталога на экран
                if (Catalog.isCatalog()) {
                    System.out.println("Текущий каталог:");
                    for (int j = 0; j < catalog1.getCatalog().size(); j++) {
                        System.out.printf("%d %s (Страна: %s, Остаток: %.2f)%n",
                                catalog1.getCatalog().get(j).getId(),
                                catalog1.getCatalog().get(j).getName(),
                                catalog1.getCatalog().get(j).getCountry(),
                                catalog1.getCatalog().get(j).getBalance());
                        }
                    } else {
                    System.out.println("Каталога не существует");
                    }

            } else if (Objects.equals(actionNumber, 4)) { //Добавление товара в корзину
                System.out.println("добавление нового товара в корзину");

            } else if (Objects.equals(actionNumber, 5)) { //Просмотр корзины
                System.out.println("содержимое корзины");
            }

            System.out.println("Для выбора следующего действия введите 'next'");

        } while (Objects.equals(scanner.nextLine(), "next"));


        //Заполнение каталога
//        HashMap<Integer, Product> catalog = new HashMap<>();
//        System.out.println("Заполните каталог товарами");
//        int i = 0;
//        do {
//            catalog.put(i, Product.getProductAfterScanner(scanner, i));
//            i++;
//            System.out.println("Для добавления следующей позиции в каталог введите '+'");
//        } while (Objects.equals(scanner.nextLine(), "+"));

        //Вывод каталога на экран


        System.out.println("Для добавления товара в корзину введи его номер из каталога: ");



    }




}


