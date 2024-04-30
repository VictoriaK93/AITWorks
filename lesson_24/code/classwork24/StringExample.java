package classwork24;

public class StringExample {
    public static void main(String[] args) {
        // Создаем пустую строку
        String shoppingList = "";

        // Добавляем пункты в список покупок
        shoppingList = shoppingList + "Молоко";
        shoppingList = shoppingList + ", Яйца";
        shoppingList = shoppingList + ", Хлеб";
        shoppingList = shoppingList + ", Шоколад";

        // Выводим итоновый список покупок
        System.out.println(
                "Список покупок: " + shoppingList
        );
    }
}

