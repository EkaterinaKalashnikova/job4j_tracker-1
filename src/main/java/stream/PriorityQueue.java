package stream;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList <Task> tasks = new LinkedList <>();
    private int element;

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        if (!tasks.isEmpty()) {//если коллекция существут, то
            for (Task element : tasks) {//перебираем элементы в списке
                if(element.getPriority() <= task.getPriority()){
                    //if(element.getPriority() <= tasks.get(index).getPriority()){
                    //сравниваем данные списка с приоритетными по всему списку
                    index++; //и сдвигаем вправо
                    break;
                }
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
