# TDD Live Session - workshop

## *BargainMaestro* - an application for searching the cheapest shop 

### Application description

#### General requirements

As a consumer I would like to know which shops gives the best price for provided shopping list.
To avoid a time waste, I want to buy everything in one shop. I don't care best price for each single
merchandise, instead I want to know the best price for the whole basket.

#### Architecture

Application will be developed as a library to be used from external application. This indicates no UI, 
but functionality should be covered by unit tests. The application should allow:
* to define a list of shops
* to add new merchandise into the stock
* to search merchandise within the shop
* to create shopping list
* to calculate the amount to be paid in particular shop
 

### Workshop plan

#### Etap 1. Merchandise definition, shop definition and shop stocking

There are `Merchandize` and `Shop` classes provided repectively, to store data. 

`Merchandise` stores the **name** of goods and it's **base price**. Amount of goods is not taken into
consideration.

The `Shop` allows to add merchandise to add it into the shop's stock. Once the merchanise is in stock, it 
persist there for ever (there is no way to take it out).

There are also according *unit tests* to cover required functionality.

The task is to implement functionality of `Merchandise` and `Shop` to make unit tests green then 
to add another test cases with related production code.