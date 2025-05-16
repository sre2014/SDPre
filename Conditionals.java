public class FoodSuggestions {
    public static void main(String[] args) {
        boolean hasSpoon, isHotOutside, isColdOutside, likesSpicyFoods;

        hasSpoon = true;
        isHotOutside = false;
        isColdOutside = true;
        likesSpicyFoods = true;

        if (hasSpoon) {
            if (isHotOutside) {
                System.out.println("Go get some ice cream!");
            } else if (isColdOutside) {
                if (likesSpicyFoods) {
                    System.out.println("Get some spicy chili!");
                } else {
                    System.out.println("Get some tomato soup!");
                }
            }
        } else {
            System.out.println("...why do you have a spoon?");
        }
    }
}
