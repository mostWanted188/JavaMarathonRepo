package day11;

public class Warehouse {
    private int countOrder; // кол-во собранных заказов
    private int balance; // доход от доставленных заказов

    public int getCountOrder() { return countOrder; }
    public int getBalance() { return balance; }

    public void setCountOrder(int countOrder) { this.countOrder = countOrder; }
    public void setBalance(int balance) { this.balance = balance; }

    public String toString(){
        return "количество собранных заказов: " + countOrder +
                " доход от доставленных заказов: " + balance;
    };

}
