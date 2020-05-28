package academy.learnprogramming;

import java.util.Objects;

public class Program{

    public static void main(String[] args) {

        Account<Integer> acc1 = new Account<Integer>(2334, 5000); // id - число
        Integer acc1Id = acc1.getId();
        System.out.println(acc1.hashCode());
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2334, 5000);    // id - строка
        System.out.println(acc2.getId());
        System.out.println(acc2.hashCode());
        System.out.println(acc1.equals(acc2));
        System.out.println(acc1.getClass());
        System.out.println(acc1.toString());
    }
}
class Account<K>{

    private K id;
    private int sum;

    Account(K id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public K getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

    // по умолчанию equls сравнивает: ссылается ли на два объекта на лжну ячейку памяти
    // переопределяем метод equls для того, чтобы сравнивать поочердно поля
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account<?> account = (Account<?>) o;
        return sum == account.sum && Objects.equals(id, account.id);
    }

    // по хэш коду JVM определет адрес в системе памяти.
     // хэш код переопределяется, чтобы оптимизировать хранение в памяти
    @Override
    public int hashCode() {
        return Objects.hash(id, sum);
    }

    @Override
    public String toString() {
        return "Аккаунт{" + "id=" + id + ", sum=" + sum + '}';
    }
}