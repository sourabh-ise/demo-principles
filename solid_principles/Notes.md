#SOLID Principles<br>
* ####S : Single Responsibility
     "Every software component should have one and only one ~~responsibility~~ reason to change." 
                                                                        <sub>-Robert Cecil Martin(Author Clean code)</sub>

        - "Cohesion is the degree to which various parts of the software are realted"
        - "Coupling is the level of interdependency between software components"
    * Always aim for high cohesion
        * Square.java has methods for calculating various aspects of square.
        * SquareUI.java has methods only related to rendering the image. 
    
* ####O : Open-Closed Principle (OCP)
      "Software components should be closed for modification, but oipen for extension"
     * Advantages
        * Ease of adding new features
        * Leads to minimal development cost
        * OCP often requires de-coupling, which in turn follows the single responsiblity pronciple.
        
* ####L : Liskov Substitution Principle (LSP)
        "Objects should be replaceable with their subtypes without effecting the correctness of the Program"
    * Change the __Is A__ way of thinking.<br>
     __eg.__ Ostrich - isA(Extends) ->Bird, and overrides method fly() but leave it unimplemented since Ostrich can't fly.
    This is a violation if the Liskov Principle.<br>
    __eg.__  If it looks like a duck & Quacks like a duck but needs batteries, you must have the wrong abstraction.<br>
    [Solution - "Tell, Dont't Ask" approach](src/org/learning/liskov/product/AskDontTell.md)<br>
    [Solution - "Breaking The Heirarchy" approach](src/org/learning/liskov/vehicle/BreakingTheHeirarchy.md)

* ####I : Interface Segregation Principle (ISP)
        "No client should be forced to depend on methods it does not use"
    * Techniques to identify violations of ISP
        * Fat interfaces
        * Interface with low cohesion.
        * Empty implementations of methods

* ####I : Dependency Inversion Principle (DIP)
        - "High-level modules should not depend on Low-level modules, Both should depend on Abstractions.
        - "Abstraction should not depend on details, Details should depend on Abstraction"
     __eg.__ Example of a Product catalog is implemented
     [Dependency Injection example](src/org/learning/dependency_inversion/correct_injection/DependencyInjection.md)      
