# PROBLEM1_CARLSON
Wedding Planning System HW1 problem

## RESOURCES
I did not use any outside resources for this problem other than the 
- Factory slides
- Week5/Factory,
- Talking to the professor

## EXPLANATION OF DESIGN CHOICES
- **Singleton** was used for the wedding planner, as we wanted to ensure there was only one instance of it.
- **Factory** was used to handle the instantiation of the weddings, as it makes extensibility easier because you don't need to modify client code to add a new wedding package.
- **Builder** was used to customize the weddings, because we wanted to customize the weddings instantiated by the wedding factory depending on the selected wedding package before returning them to the client. 
