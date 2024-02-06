package unit10;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> test1= Optional.of("fanu");
        System.out.println(test1.get());
        MealRecipe recipe= new MealRecipe();
        recipe.setDough(20);
        recipe.setSauce(11);
        //recipe.setPizzaOpt(new BigDecimal(01.989));
        System.out.println(recipe.toString());
        //getting access to the optinal value and handling the null value
        BigDecimal gettingthepriceofoptional= recipe.getPizzaOpt()
                                                    .map(cost->cost)
                                                     .orElse(new BigDecimal(0));
        /* older or longer version of handling the null exception
        if (recipe.getPizzaOpt().isPresent()){
            BigDecimal gettingthepriceofoptional= recipe.getPizzaOpt().get();
        } */
        recipe.getPizzaOpt().ifPresent(MealService::pizzaservice);
        // the same version as above but more texting
        //recipe.getPizzaOpt().ifPresent(BB->MealService.pizzaservice(BB));
    }
}
