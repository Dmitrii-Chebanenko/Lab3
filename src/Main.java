//Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
// Не успел Винни-Пух спросить: "Почему по четвергам?"-- как Кристофер Робин начал рассказывать грустную историю пропавшего дома Иа.
// Пух и Пятачок слушали, и глаза у них становились все больше и больше.
public class Main {
    public static void main(String[] args) {
        // //Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
        Marge marge = new Marge ("роща вокруг опушки");
        WinnieThePooh winnieThePooh = new WinnieThePooh ("Пух");
        ChristopherRobin christopherRobin = new ChristopherRobin ("Кристофер Робин");
        Piglet piglet = new Piglet ("Пяточек");
        They they = new They ("Они", winnieThePooh, piglet, christopherRobin);
        Whoop whoop = new Whoop ("возгласы");
        Road road = new Road ("дорога");
        they.rush(marge);
        whoop.addStatus(Status.приветственные);
        winnieThePooh.publish(road, whoop);

        //Не успел Винни-Пух спросить: "Почему по четвергам?"-- как Кристофер Робин начал рассказывать грустную историю пропавшего дома Иа.
        winnieThePooh.setName("Винни-Пух");
        Question question = new Question("Почему");
        winnieThePooh.ask(question, DaysOfTheWeek.THURSDAY);
        Tell tell = new Tell("рассказывать");
        Story story = new Story ("историю");
        story.addStatus(Status.грустную);
        tell.addAddition(story);
        christopherRobin.setLocation(marge);
        IA iA = new IA("Иа", true);
        House house = new House("дома", iA);
        house.addStatus(Status.пропавшего);
        story.setStoryThing(house);
        christopherRobin.StartTell(tell , story);
        // Пух и Пятачок слушали, и глаза у них становились все больше и больше.
        winnieThePooh.setName("Пух");
        winnieThePooh.hear(piglet, story);
        Eyes winnieEyes = new Eyes("глаза Винни-Пуха");
        Eyes pigletEyes = new Eyes("глаза Пяточка");
        winnieThePooh.addPartOfEntities(winnieEyes);
        piglet.addPartOfEntities(pigletEyes);
        winnieEyes.expand();
        pigletEyes.expand();
    }
}