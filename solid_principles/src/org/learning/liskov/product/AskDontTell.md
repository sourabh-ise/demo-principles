## Liskov Substitution Principle
#### "Tell, Dont't Ask" Approach
Example  
>__Scenario__: An store has two types of products, __Generic products__ and __In house Products__.<br>
>A discount of 20% is applied by default on all products<br>
>If the product is an In-House porduct an additional discount of 1.5 times is applied

>__Incorrect Approach__: In-HouseProduct extends Product, and at the runtime the Instacne of the product is determined to apply the additional discount.

>__Correct Approach__: In-HouseProduct extends Product, and overrides the getDiscount method to apply the additional discount.


This way In-HouseProduct which is a subtype of Product does not effect the correctness of the Program.

[Home](../../../../../Notes.md) 
