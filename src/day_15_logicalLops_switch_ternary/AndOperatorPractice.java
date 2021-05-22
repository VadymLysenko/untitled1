package day_15_logicalLops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "usb c adapter";

        if (onSale && freeShipping){
            System.out.println("Add item " + itemName + " to cart");
        }else{
            System.out.println("It's not on sale and no free shipping " + itemName);
        }
        // add to cart when it is freeshipping
        if (freeShipping && onSale && itemName.equals("usb c adapter") ){
            System.out.println("Add to cart - " + itemName);
        }else{
            System.out.println("Continue shopping for good deals on-" + itemName);
        }

    }
}
