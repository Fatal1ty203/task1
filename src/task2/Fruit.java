package task2;

import java.util.Comparator;
import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
    String name;
    int profit;
    int price;

    public Fruit(String name, int profit, int price) {
        this.name = name;
        this.profit = profit;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        Fruit fruit = (Fruit) o;
        return price == fruit.price &&
                name.equals(fruit.name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", profit=" + profit +
                ", price=" + price +
                '}';
    }

    public static class ProfitSort implements Comparator<Fruit> {

        public int compare(Fruit o1, Fruit o2) {
            return o1.profit - o2.profit;
        }
    }

    public static class PriceSort implements Comparator<Fruit> {

        public int compare(Fruit o1, Fruit o2) {
            return o1.price - o2.price;
        }
    }


    @Override
    public int compareTo(Fruit o) {
        return (this.profit - o.profit);
    }


}

