public class TestDog2 {
    public static void main(String[] args)
    {
//        calls to DogTriathlonParticipant class' methods and input of data per object
        DogTriathlonParticipant2 dog1 =
                new DogTriathlonParticipant2("Bowser", 2, 85, 89, 0);
        dog1.display();
        DogTriathlonParticipant2 dog2 =
                new DogTriathlonParticipant2("Rush", 2, 78, 72, 80);
        dog2.display();
        DogTriathlonParticipant2 dog3 =
                new DogTriathlonParticipant2("Ginger", 2, 90, 72, 12);
        dog3.display();
    }
}
