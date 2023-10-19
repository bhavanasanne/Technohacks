import java.util.Scanner;
class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = 0;
        String[] ques = {
            "The Artificial Sun is an ambitious project of which country?",
            "In October 2023, which of the following countries won the South Asian Football Federation (SAFF) Under-19 Championship 2023?",
            "What is the largest mammal in the world?"
        };
        String[] options = {
            "A) Russia B) USA C) China D) India",
            "A) India  B) China  C) Veitnam  D) Indonesia",
            "A) Elephant  B) Giraffe  C) Blue Whale  D) Dolphin"
        };
        char[] answers = {'C', 'A', 'C'};
        for (int i = 0; i < ques.length; i++) 
		{
            System.out.println("Question " + (i + 1) + ": " + ques[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = s.next().toUpperCase().charAt(0);
            if (userAnswer == answers[i]) 
			{
                System.out.println("Correct!\n");
                score++;
            } else 
			{
                System.out.println("Incorrect. The correct answer is " + answers[i] + ".\n");
            }
        }
        System.out.println("Quiz completed! Your score: " + score + " out of " + ques.length);
        s.close();
    }
}
