import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<Notebook>();
        set.add(new Notebook("Notebook 1", "dell", "black", "Windows", "intel i3", 4, 4, 250, 15, 50000));
        set.add(new Notebook("Notebook 2", "hp", "white", "Windows", "intel i5", 6, 8, 500, 14, 150000));
        set.add(new Notebook("Notebook 3", "lenovo", "black", "Linux", "intel i7", 8, 12, 750, 13, 150000));
        set.add(new Notebook("Notebook 4", "dell", "white", "Windows", "amd 5200", 4, 4, 250, 17, 85000));
        set.add(new Notebook("Notebook 5", "hp", "black", "Windows", "amd 7300", 6, 8, 500, 12, 65000));
        set.add(new Notebook("Notebook 6", "lenovo", "white", "Linux", "amd 3200", 8, 12, 750, 16, 95000));
        set.add(new Notebook("Notebook 7", "dell", "black", "Windows", "intel i3", 4, 4, 250, 14, 85000));
        set.add(new Notebook("Notebook 8", "hp", "white", "Linux", "intel i5", 6, 4, 1000, 15, 75000));
        set.add(new Notebook("Notebook 9", "dell", "black", "Windows", "intel i7", 8, 4, 1250, 13, 55000));
        set.add(new Notebook("Notebook 10", "lenovo", "white", "Linux", "intel i9", 12, 16, 2500, 12, 500000));

        filterBy(set);
    }

    public static void filterBy(Set<Notebook> data) {
        Map<Integer, Object> searchNotebook = new HashMap<>();

        Integer inputValueI;
        String inputValueS;

        Scanner inputData = new Scanner(System.in);

        Map<Integer, String> filterParamName = new HashMap<>();
        filterParamName.put(1, "Модель");
        filterParamName.put(2, "Бренд");
        filterParamName.put(3, "Цвет");
        filterParamName.put(4, "ОС");
        filterParamName.put(5, "Процессор");
        filterParamName.put(6, "Количетво ядер");
        filterParamName.put(7, "Объем RAM");
        filterParamName.put(8, "Объем HDD");
        filterParamName.put(9, "Диагональ");
        filterParamName.put(10, "Цена");
        filterParamName.put(0, "Выход");

        System.out.println("\n Все ноутбуки что есть в магазине:");

        for (Notebook row : data) {
            row.list();
        }

        while (true) {
            System.out.println("Введите номер параметра для фильтрации:");
            for (Map.Entry<Integer, String> paramKey : filterParamName.entrySet()) {
                System.out.printf("%d -> %s\n", paramKey.getKey(), paramKey.getValue());
            }

            Integer input_filterName = inputData.nextInt();
            inputData.nextLine();

            if (input_filterName == 0) {
                System.out.println("Выход");
                break;
            } else {

            }
            switch (input_filterName) {
                case 1:
                    System.out.println("Модель:");
                    inputValueS = inputData.nextLine();
                    searchNotebook.put(input_filterName, inputValueS);
                    break;
                case 2:
                    System.out.println("Бренд:");
                    inputValueS = inputData.nextLine();
                    searchNotebook.put(input_filterName, inputValueS);
                    break;
                case 3:
                    System.out.println("Цвет:");
                    inputValueS = inputData.nextLine();
                    searchNotebook.put(input_filterName, inputValueS);
                    break;
                case 4:
                    System.out.println("ОС:");
                    inputValueS = inputData.nextLine();
                    searchNotebook.put(input_filterName, inputValueS);
                    break;
                case 5:
                    System.out.println("Процессор:");
                    inputValueS = inputData.nextLine();
                    searchNotebook.put(input_filterName, inputValueS);
                    break;
                case 6:
                    System.out.println("Количество ядер:");
                    inputValueI = inputData.nextInt();
                    searchNotebook.put(input_filterName, inputValueI);
                    break;
                case 7:
                    System.out.println("Объем RAM GB:");
                    inputValueI = inputData.nextInt();
                    searchNotebook.put(input_filterName, inputValueI);
                    break;
                case 8:
                    System.out.println("Объем HDD GB:");
                    inputValueI = inputData.nextInt();
                    searchNotebook.put(input_filterName, inputValueI);
                    break;
                case 9:
                    System.out.println("Диагональ экрана:");
                    inputValueI = inputData.nextInt();
                    searchNotebook.put(input_filterName, inputValueI);
                    break;
                case 10:
                    System.out.println("Цена:");
                    inputValueI = inputData.nextInt();
                    searchNotebook.put(input_filterName, inputValueI);
                    break;

                default:
                    System.out.println("Ведите корректный номер фильтра");
                    break;
            }

            Set<Notebook> results = new HashSet<>();

            for (Notebook row : data) {

                for (Map.Entry<Integer, Object> item : searchNotebook.entrySet()) {
                    int key = item.getKey();
                    Object value = item.getValue();

                    switch (key) {
                        case 1:
                            if (row.getModel().equalsIgnoreCase((String) value)) {
                                results.add(row);
                            }
                            break;
                        case 2:
                            if (row.getBrand().equalsIgnoreCase((String) value)) {
                                results.add(row);
                            }
                            break;
                        case 3:
                            if (row.getColor().equalsIgnoreCase((String) value)) {
                                results.add(row);
                            }
                            break;
                        case 4:
                            if (row.getOs().equalsIgnoreCase((String) value)) {
                                results.add(row);
                            }
                            break;
                        case 5:
                            if (row.getCpu().equalsIgnoreCase((String) value)) {
                                results.add(row);
                            }
                            break;
                        case 6:
                            if (row.getCpu_cores() == (int) value) {
                                results.add(row);
                            }
                            break;
                        case 7:
                            if (row.getRam_gb() >= (int) value) {
                                results.add(row);
                            }
                            break;
                        case 8:
                            if (row.getHdd_gb() >= (int) value) {
                                results.add(row);
                            }
                            break;
                        case 9:
                            if (row.getScreen_diagonal_inches() == (int) value) {
                                results.add(row);
                            }
                            break;
                        case 10:
                            if (row.getPrice() <= (int) value) {
                                results.add(row);
                            }
                            break;
                    }

                }

            }

            if (results.isEmpty()) {
                System.out.println("Нет ноутбуков, удовлетворяющих условиям фильтрации.");
            } else {
                for (Notebook notebooks : results)
                    notebooks.list();
            }
            results.clear();
            searchNotebook.clear();

        }
        inputData.close();
    }

}