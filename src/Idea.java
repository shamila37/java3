public class Idea {

    void quote(int x, int y){
        System.out.println("I think " + x + " plus " + y + " = " + (x + y));
    }


    void quote(String x){
        System.out.println("I think " + x + " is the best investment");
    }

    public static void main(String [] args){
        Idea idea = new Idea();
        idea.quote(50, 100);
        idea.quote("EDUCATION");
    }
}
