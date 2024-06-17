package homework_28;

public class CarArrayList implements ArrayList<Car> {
    private Car[] items;
    private int size;

    public CarArrayList() {
        this.items = new Car[0];
        this.size = 0;
    }

    @Override
    public void add(Car value) {
        if (size == items.length) {
            resize();
        }
        items[size] = value;
        size++;
    }

    @Override
    public Car get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return items[index];
    }

    @Override
    public Car remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Car removedCar = items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size--;
        return removedCar;
    }

    private void resize() {
        Car[] newItems = new Car[size * 2];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

}
