public interface ICanPublish {
    String getName();

    void publish(Place place,ICanBeUsedByActions obj);
}