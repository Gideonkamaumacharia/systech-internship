package javaSECertPrep.generalExercises.Udemy.Question1;

public class Test {
    public static void main(String[] args)throws Exception {
        Game g = new Soccer();
        //1
        g.play();
        Soccer a = (Soccer) g;
        //2
        a.play();
        //Which of the given options can be inserted at 1 & 2?
        //ANSWERS g.play() at 1 & a.play("cosco")      g.play() & a.play()
        // In the second choice,Soccer is implictly overriding play() from Game(Parent)
    }
}
