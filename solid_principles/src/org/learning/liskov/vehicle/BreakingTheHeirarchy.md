## Liskov Substitution Principle
#### "Breaking the Hierarchy" Approach
Example  
>__Problem__: A race car appears to be of type car, class car has a method called getCabinWidth, 
>where as cabin with is not applicable for race car, instead race has has a cockpit width

>__Incorrect Approach__: Race car extends car but leaves the getCabinWith unimplemented, Instead create a new method called getCockpitWidth().

>__Correct Approach__: Race car and car implement a common interface called vehicle, 
>it has method signature getInternalWidth. Both car and race cars implements it in its own way.


[Home](../../../../../../Notes.md) 
