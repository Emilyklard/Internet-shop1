import java.util.ArrayList;
import java.util.Scanner;

public class Goods {

    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<String>();
        goods.add("Ice");
        goods.add("Cola");
        goods.add("Burger");
        goods.add("Jelly");
        goods.add("Cheese");
        System.out.println("Добро пожаловать в магазин!");
        printMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите подходящий Bам номер :");
        int numMenu = sc.nextInt();
        while (true) {
            if (numMenu == 1) {
                printGoods(goods);

            } else if (numMenu == 2) {
 buyGood(sc, goods);
            } else if (numMenu == 3) {
                addGood(sc, goods);
            }
            System.out.println("Что еще желаете?");
            numMenu = sc.nextInt();
        }
    }

    private static void addGood(Scanner sc, ArrayList<String> goods) {
        System.out.println("Наименование добавляемого товара:");
        goods.add(sc.next());
    }

    private static void printGoods(ArrayList<String> goods) {
        for (int i = 0; i < goods.size(); i++) {
            System.out.print(goods.get(i) + " ");}
            System.out.println();
        }


    private static void buyGood(Scanner sc, ArrayList<String> goods) {
        System.out.println("Введите название товара:");
        String inputGood = sc.next();
        for (int i = 0; i < goods.size(); i++) {
            if (inputGood.equals(goods.get(i))) {
                goods.remove(i);
            }
        }
        if(!goods.contains(inputGood)) {
            System.out.println("Данного товара нет в наличии.");
        }
    }

    private static void printMenu () {
            System.out.println("Меню:\n" +
                    "1.Посмотреть все товары.\n" +
                    "2.Купить товар.\n" +
                    "3.Добавить товар.\n");
        }

    }

