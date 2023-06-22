public class DogTriathlonParticipant2 {

//    private static and or final fields
//    each object created from a class to contain its own final value, you would declare the field to be final
        private final int NUM_EVENTS;
//    a field that all instantiations of the class can access, but the field value can change,
        private static int totalCumulativeScore = 0;

//    private fields passed into the public DogTriathlonParticipant()
        private String name;
        private int obedienceScore;
        private int conformationScore;
        private int agilityScore;
        private int total;
        private double avg;
        private boolean doScoresAgree;
// method used to calculate and store values when called
    public DogTriathlonParticipant2(String name, int numEvents, int score1, int score2, int score3)
        {
            this.name = name;
            NUM_EVENTS = numEvents;
            int totalNot0 = 0;
            if(score1 != 0)
                totalNot0 += 1;
            if(score2 != 0)
                totalNot0 += 1;
            if(score3 != 0)
                totalNot0 += 1;
            if(numEvents == totalNot0)
                doScoresAgree = true;
            else
                doScoresAgree = false;
            if(doScoresAgree){
                obedienceScore = score1;
                conformationScore = score2;
                agilityScore = score3;
            } else {
                obedienceScore = 0;
                conformationScore = 0;
                agilityScore = 0;
            }
            total = obedienceScore + conformationScore + agilityScore;
            if(NUM_EVENTS == 0) {
                avg = 0;
            } else {
                avg = (double) total / NUM_EVENTS;
            }
            totalCumulativeScore = totalCumulativeScore + total;
        }
//    method used to display values when called
        public void display()
        {
            if(!doScoresAgree)
                System.out.println("\nNotice! Number of events for " +
                        name + " does not agree with scores reported.");
            System.out.println(name + " participated in " +
                    NUM_EVENTS + " events and has an average score of " + avg);
            System.out.println(" " + name + " has a total score of " +
                    total + " bringing the total cumulative score to " +
                    totalCumulativeScore);
        }


}
