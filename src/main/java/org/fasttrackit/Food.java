package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    String foodName;
    double price;
    double quantity;
    LocalDate expirationDate = LocalDate.now() .plusMonths(4);
    boolean stock;

}
