package classwork24;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Создаем объект StringBuilder
        StringBuilder shoppingList = new StringBuilder();

        // Добавляем пункты в список покупок
        shoppingList.append("Молоко");
        shoppingList.append(", Яйца");
        shoppingList.append(", Хлеб");
        shoppingList.append(", Шоколад");

        // Выведем итоговый список покупок
        System.out.println(
                "Список покупок: " + shoppingList.toString()
        );
    }
}



