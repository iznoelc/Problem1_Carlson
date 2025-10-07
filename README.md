# PROBLEM1_CARLSON
Wedding Planning System HW1 problem

## RESOURCES
- Factory slides, Builder slides, Singleton slides
- Week4/ThreadSafe-Singleton, Week5/Factory, Week5_2025/Builder_PizzaTopping, Week5_2025/Car_Builder (as reference)
- Talking to the professor
- Consulted with Esperanza Paulino to compare how we connected factory and builder after coding it up individually

## EXPLANATION OF DESIGN CHOICES
- **Singleton** was used for the wedding planner, as we wanted to ensure there was only one instance of it.
- **Factory** was used to handle the instantiation of the weddings, as it makes extensibility easier because you don't need to modify client code to add a new wedding package.
- **Builder** was used to customize the weddings, because we wanted to customize the weddings instantiated by the wedding factory depending on the selected wedding package before returning them to the client. 
