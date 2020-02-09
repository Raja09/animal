# Singtel Animal Assessment
Animal assessment using SOLID principles

######A1. Can you implement the sing() method for the bird?
Ans:- No, sing() method is not defined in both Animal and Bird class. So when we call sing() method using above code it will return undefined compailation error. To avoid this error should define and implement in either Animal or Bird class 

######A1b. How did you optimize the code for maintainability?
Ans:- we know that not all of the subclasses should not have flying and singing behaviour so inheritance is not the correct solution when its come to maintenance. we could take out fly and sing methods from Bird class and make separate interfaces for fly() and sing(). That the way, the birds that are supposed to fly will implement that interface.

######A2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
Ans:- Execute following **TestA2.java** file to get special sounds from Duck and Chicken
		A duck says : Quack, quack
		A duck can swim
		A chicken says: Cluck, cluck
		A chicken cannot fly			


######A3. Now how would you model a rooster?
Ans:- Execute following **TestA3.java** file to test the given functionality.

######A4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
Ans:- We can keep parrtot maintainable using Composition (Has-A relationship) with abstraction(implementing interfaces). Here the parrot has a relationship with cat, dog, duck, rooster and phone.

###B: Model fish as well as other swimming animals
####1. In addition to the birds, can you model a fish?
Ans:- Execute following **TestB1.java** file

####2. Can you specialize the fish as a Shark and as a Clownfish?
Ans:- Execute following **TestB2.java** file

####3. Dolphins are not exactly fish, yet, they are good swimmers
Ans:- Execute following **TestB3.java** file

##D. Model animals that change their behaviour over time
#####1. Can you model a butterfly?
Ans:- Execute the following **TestD2.java** to get the desired result

#####2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
Ans: We can model caterpillar and butterfly using Composition/Aggregation - there is a relationship between caterpillar and butterfly since Caterpillar is transforming to butterfly and execute the following **TestD2.java** to get the desired result

##E. Can you share the code to count: a. how many of these animals can fly? b. how many of these animals can walk? c. how many of these animals can sing? d. how many of these animals can swim?
Ans:- Complie and run the following **TestE1.java** file to get the fly, walk, sing and swim animal count.


Note:- Run the test cases from test package (Positive and negative test cases are implemented)