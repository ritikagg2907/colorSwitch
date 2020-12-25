# Color_Switch_Game

Description:-
    In this java game project, we have tried to implement Color Switch Game using JavaFx, OOPs concepts and the concepts taught us in the classes. We have first design our project by making the whole game plan using UML and class Diagrams. 
In our project code, we have the  main menu class which allow the user to select either from a saved game or to start a fresh new screen.  In the main menu window, we have shown a animation in which color switch circles rotates. We designed our main menu, game play screen, and other such windows using javaFx  scene builder. All the obstacles and game character like ball and ball changer have been coded in seperate class. We have an abstract class “Obstacle” which is inherited by all the different types of obstacle, in this abstract class we have a n abstract method “createObstacle” which is implementated by all child class in order to create obstacle.
Design Patterns used - Template, Singleton, Factory, Iterator


Implementation:-
    One of the main event in the  game was to make the ball jump on pressing a  key on keyboard, we have achieved this by varying the y-position of the ball and also by using the “Animation timer” which we used to add gravity to the ball. We rotated all our obstacles using “RotateTransition” class. We have faced main difficulty in detecting the collision between the ball & obstacles or the ball with the stars. We have achieved to detect the collision using  intersect api provided by Shape class. On detecting any collision of the ball with a obstacle we compared the color of the ball and color of that  part of obstacle which get collided on collision using the getFill() method and if they have the same color then we allowed the ball to move forward and game over otherwise. We also had a label named “stars’ which shows the current score i.e the no. of stars collected by the player. On game over screen we have shown the final score of the player!


Bonus Component:-
    Instagram Account Linkage Button
    About Game Details
    Sound Effect on ball Bounce
