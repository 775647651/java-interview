package main.java;

public class Supermarket {
    private static final double APPLE_PRICE = 8.0;
    private static final double STRAWBERRY_PRICE = 13.0;
    private static final double MANGO_PRICE = 20.0;

    // 1. 计算顾客A购买的苹果和草莓的总价
    public double calculateTotalPriceForCustomerA(int appleWeight, int strawberryWeight) {
        double totalPrice = (appleWeight * APPLE_PRICE) + (strawberryWeight * STRAWBERRY_PRICE);
        return totalPrice;
    }

    // 2. 计算顾客B购买的苹果、草莓和芒果的总价
    public double calculateTotalPriceForCustomerB(int appleWeight, int strawberryWeight, int mangoWeight) {
        double totalPrice = (appleWeight * APPLE_PRICE) + (strawberryWeight * STRAWBERRY_PRICE) + (mangoWeight * MANGO_PRICE);
        return totalPrice;
    }

    // 3. 计算顾客C购买的苹果、草莓和芒果的总价（草莓打8折）
    public double calculateTotalPriceForCustomerC(int appleWeight, int strawberryWeight, int mangoWeight) {
        double totalPrice = (appleWeight * APPLE_PRICE) + (strawberryWeight * STRAWBERRY_PRICE * 0.8) + (mangoWeight * MANGO_PRICE);
        return totalPrice;
    }

    // 4. 计算顾客D购买的苹果、草莓和芒果的总价（购物满100减10）
    public double calculateTotalPriceForCustomerD(int appleWeight, int strawberryWeight, int mangoWeight) {
        double totalPrice = (appleWeight * APPLE_PRICE) + (strawberryWeight * STRAWBERRY_PRICE) + (mangoWeight * MANGO_PRICE);
        if (totalPrice >= 100) {
            totalPrice -= 10;
        }
        return totalPrice;
    }

    // 测试
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        // 测试顾客A购买情况
        double totalPriceA = supermarket.calculateTotalPriceForCustomerA(5, 3);
        System.out.println("顾客A购买的总价为：" + totalPriceA);

        // 测试顾客B购买情况
        double totalPriceB = supermarket.calculateTotalPriceForCustomerB(5, 3, 2);
        System.out.println("顾客B购买的总价为：" + totalPriceB);

        // 测试顾客C购买情况
        double totalPriceC = supermarket.calculateTotalPriceForCustomerC(5, 3, 2);
        System.out.println("顾客C购买的总价为：" + totalPriceC);

        // 测试顾客D购买情况
        double totalPriceD = supermarket.calculateTotalPriceForCustomerD(5, 3, 2);
        System.out.println("顾客D购买的总价为：" + totalPriceD);
    }
}
