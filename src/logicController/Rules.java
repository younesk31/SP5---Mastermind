package logicController;

public class Rules {

    public String toString() {
        return "The computer picks a sequence of colors. The number of colors is the code length. The default code length is 4 but it can be changed when starting a new game.\n" +
                "\n" +
                "The objective of the game is to guess the exact positions of the colors in the computer's sequence.\n" +
                "\n" +
                "By default, a color can be used only once in a code sequence. If you start a new game with the 'Allow duplicates' checked, then any color can be used any number of times in the code sequence.\n" +
                "\n" +
                "After filling a line with your guesses and clicking on the 'Submit' button, the computer responses with the result of your guess.\n" +
                "\n" +
                "For each color in your guess that is in the correct color and correct position in the code sequence, the computer display a small red color on the right side of the current guess.\n" +
                "\n" +
                "For each color in your guess that is in the correct color but is NOT in the correct position in the code sequence, the computer display a small white color on the right side of the current guess.\n" +
                "\n" +
                "You win the game when you manage to guess all the colors in the code sequence and when they all in the right position.\n" +
                "\n" +
                "You lose the game if you use all attempts without guessing the computer code sequence.\n";
    }
}
