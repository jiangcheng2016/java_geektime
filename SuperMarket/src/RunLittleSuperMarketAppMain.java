import Person.Customer;
import SuperMarket.LittleSuperMarket;
import SuperMarket.Merchandise;
import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;

import java.util.Random;
import java.util.Scanner;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        //初始化超市信息
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "简易小超市";
        littleSuperMarket.address = "北京路23号";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
        littleSuperMarket.incomingSum = 0;

        //填充商品信息
        Merchandise[] all = littleSuperMarket.merchandises;
        for(int i = 0; i < all.length; i ++)
        {
            Merchandise m = new Merchandise();
            m.name = "商品" + i;
            m.id = "id" + i;
            m.count = 200;
            m.purchasePrice = Math.random()*200;
            m.soldPrice = (1 + Math.random() )* 200;
            all[i] = m;
        }

        //开始进入售卖
        System.out.println("超市开门啦！");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);
        while(open)
        {
            System.out.println("超市的名字是:" + littleSuperMarket.superMarketName);
            System.out.println("超市的地址是:" + littleSuperMarket.address);
            System.out.println("超市的车位数量是:" + littleSuperMarket.parkingCount + "个");
            System.out.println("超市的营业额是:" + littleSuperMarket.incomingSum);
            System.out.println("超市的商品数量为：" + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + (int)(1 + Math.random())* 1000;
            customer.money = 2000;
            customer.isBrivingCar = Math.random() < 0.5;

            if(customer.isBrivingCar) {
                if (littleSuperMarket.parkingCount < 0) {
                    System.out.println("对不起！本店车位已满，欢迎您下次光临!");
                    continue;
                } else {
                    System.out.println("欢迎" + customer.name + "来到本超市!本店为您安排了车位，车位编号："+littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount --;
                }
            }
            else {
                System.out.println("欢迎" + customer.name + "来到本超市");
            }
            double totalCost = 0.0;
            while(true)
            {
                System.out.println("本店提供" + littleSuperMarket.merchandises.length + "种商品");
                System.out.println("请选择你要购买的商品序号");
                int index = scanner.nextInt();

                if(index < 0)
                    break;
                if(index >= littleSuperMarket.merchandises.length)
                {
                    System.out.println("本店没有这种商品，请选择编号在0~" + (all.length - 1) + "之内的商品编号");
                    continue;
                }

                System.out.println("您选择的商品序号为:" + index + ",单价为:" + littleSuperMarket.merchandises[index].soldPrice
                        + "，您需要购买几个？");
                int count = scanner.nextInt();

                if(count <= 0)
                {
                    System.out.println("不买也没关系，请继续挑选!");
                    continue;
                }
                if(count > littleSuperMarket.merchandises[index].count){
                    System.out.println("本店暂时没有这么多库存，请选择0~" + littleSuperMarket.merchandises[index].count + "之间的数");
                    continue;
                }
                if(littleSuperMarket.merchandises[index].soldPrice * count + totalCost > customer.money){
                    System.out.println("您带的钱不够，欢迎继续挑选");
                    continue;
                }

                //当购买商品时影响的其他字段变化
                littleSuperMarket.merchandises[index].count -= count;
                littleSuperMarket.merchandiseSold[index] += count;
                littleSuperMarket.merchandises[index].count --;
                totalCost += littleSuperMarket.merchandises[index].soldPrice * count;
            }
            //顾客剩余金额
            customer.money -= totalCost;

            if(customer.isBrivingCar)
            {
                littleSuperMarket.parkingCount ++;
            }
            System.out.println("顾客" + customer.name + "共消费了" + totalCost);
            littleSuperMarket.incomingSum += totalCost;


            System.out.println("您还继续营业嘛?");
            open = scanner.nextBoolean();

        }

        System.out.println("超市关门啦！");
        System.out.println("超市今天的营业额为" + littleSuperMarket.incomingSum + "。营业情况如下");
        for(int i = 0; i < all.length; i ++)
        {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if(numSold > 0)
            {
                double incoming = m.soldPrice * numSold;
                double netIncoming = (m.soldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name + "售出了" + numSold + "个。销售额为：" + incoming + ",净利润为:" + netIncoming);
            }
        }
    }
}
