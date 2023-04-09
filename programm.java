import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
//      1 - ОЗУ
//      2 - Объем ЖД
//      3 - Операционная система
//      4 - Цвет …
// 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class programm {
    public static void main(String[] args) {
        Set<Laptop> setLaptop = new HashSet<>();
        setLaptop.add(new Laptop("windows", 1111, 350, 128, 12, 1150, "grey"));
        setLaptop.add(new Laptop("macos", 2222, 450, 64, 8, 1050, "black"));
        setLaptop.add(new Laptop("windows", 33333, 500, 128, 12, 1150, "grey"));
        setLaptop.add(new Laptop("stratodesk", 44444, 450, 128, 12, 950, "black"));
        setLaptop.add(new Laptop("sindows", 555555, 500, 64, 8, 950, "red"));
        setLaptop.add(new Laptop("macos", 666666, 350, 32, 8, 750, "yellow"));

        for (Laptop laptop : setLaptop) {
            System.out.println(laptop);
        }

        System.out.println("Введите цифру, соответствующую необходимому критерию: \n1 - os \n2 - speed \n3 - ram \n4 - hd \n5 - price \n6 - color");
        Scanner iScanner = new Scanner(System.in);
        Integer search = iScanner.nextInt();
        switch (search) {
            case 1:
                Scanner iScanner1 = new Scanner(System.in);
                System.out.println("Введите название os (windows, macOS...): ");
                String searchOs = iScanner1.next();
                Set<Laptop> userOsLaptops = userOs (setLaptop, searchOs.toLowerCase());
                if (userOsLaptops.isEmpty()) 
                    System.out.println("По вашему запросу ничего не найдено.");
                else
                    viewFindLaptop(userOsLaptops);
                break;
            case 2:
                Scanner iScanner2 = new Scanner(System.in);
                System.out.println("Введите минимальные значение speed (350, 450, 500...): ");
                Integer searchSpeed = iScanner2.nextInt();
                Set<Laptop> userSpeedLaptops = userSpeed (setLaptop, searchSpeed);
                if (userSpeedLaptops.isEmpty()) 
                    System.out.println("По вашему запросу ничего не найдено.");
                else
                    viewFindLaptop(userSpeedLaptops);
                break;
            case 3:
                Scanner iScanner3 = new Scanner(System.in);
                System.out.println("Введите минимальные значение ram (32, 64, 128...): ");
                Integer searchRam = iScanner3.nextInt();
                Set<Laptop> userRamLaptops = userRam (setLaptop, searchRam);
                if (userRamLaptops.isEmpty()) 
                    System.out.println("По вашему запросу ничего не найдено.");
                else
                    viewFindLaptop(userRamLaptops);
                break;
            case 4:
                Scanner iScanner4 = new Scanner(System.in);
                System.out.println("Введите минимальные значение hd (8, 12...): ");
                Integer searchHd = iScanner4.nextInt();
                Set<Laptop> userHdLaptops = userHd (setLaptop, searchHd);
                if (userHdLaptops.isEmpty()) 
                    System.out.println("По вашему запросу ничего не найдено.");
                else
                    viewFindLaptop(userHdLaptops);
                break;
            case 5:
                Scanner iScanner5 = new Scanner(System.in);
                System.out.println("Введите максимальное значение price (750, 950 ...): ");
                Integer searchPrice = iScanner5.nextInt();
                Set<Laptop> userPriceLaptops = userPrice (setLaptop, searchPrice);
                if (userPriceLaptops.isEmpty()) 
                    System.out.println("По вашему запросу ничего не найдено.");
                else
                    viewFindLaptop(userPriceLaptops);
                break;
            case 6:
                Scanner iScanner6 = new Scanner(System.in);
                System.out.println("Введите название color (grey, red, black...): ");
                String searchColor = iScanner6.next();
                Set<Laptop> userColorLaptops = userColor (setLaptop, searchColor.toLowerCase());
                if (userColorLaptops.isEmpty()) 
                    System.out.println("По вашему запросу ничего не найдено.");
                else
                    viewFindLaptop(userColorLaptops);
                break;
        }
        
        iScanner.close();
    }

    private static Set<Laptop> userOs (Set<Laptop> setLaptop, String searchOs) {
        Set<Laptop> searchLaptop = new HashSet<>();
        for (Laptop laptop : setLaptop) {
            if (laptop.getOs().equals(searchOs)) {
                searchLaptop.add(laptop);
            }
        }
        return searchLaptop;
    }

    private static Set<Laptop> userSpeed (Set<Laptop> setLaptop, Integer searchSpeed) {
        Set<Laptop> searchLaptop = new HashSet<>();
        for (Laptop laptop : setLaptop) {
            if (laptop.getSpeed() >= searchSpeed) {
                searchLaptop.add(laptop);
            }
        }
        return searchLaptop;
    }

    private static Set<Laptop> userRam (Set<Laptop> setLaptop, Integer searchRam) {
        Set<Laptop> searchLaptop = new HashSet<>();
        for (Laptop laptop : setLaptop) {
            if (laptop.getRam() >= searchRam) {
                searchLaptop.add(laptop);
            }
        }
        return searchLaptop;
    }

    private static Set<Laptop> userHd (Set<Laptop> setLaptop, Integer searchHd) {
        Set<Laptop> searchLaptop = new HashSet<>();
        for (Laptop laptop : setLaptop) {
            if (laptop.getHd() >= searchHd) {
                searchLaptop.add(laptop);
            }
        }
        return searchLaptop;
    }

    private static Set<Laptop> userPrice (Set<Laptop> setLaptop, Integer searchPrice) {
        Set<Laptop> searchLaptop = new HashSet<>();
        for (Laptop laptop : setLaptop) {
            if (laptop.getPrice() <= searchPrice) {
                searchLaptop.add(laptop);
            }
        }
        return searchLaptop;
    }

    private static Set<Laptop> userColor (Set<Laptop> setLaptop, String searchColor) {
        Set<Laptop> searchLaptop = new HashSet<>();
        for (Laptop laptop : setLaptop) {
            if (laptop.getColor().equals(searchColor)) {
                searchLaptop.add(laptop);
            }
        }
        return searchLaptop;
    }

    private static void viewFindLaptop(Set<Laptop> userLaptops) {
        for (Laptop laptop : userLaptops) {
            System.out.println(laptop);
        }
    }
}