

Feature: Add to cart
This faeture will test functionality to add different products to the user basket from different flow


  Background: User is logged in
  Scenario: Search the product and add the first result/product to the User Basket
    Given USer searched for Lenovo Laptop
   
    When The first laptop that appears in search is result to the basket 
 
    Then USer Basket should display with one object


