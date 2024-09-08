package tribe_classes;

public class TribeNode
{
    Tribe tribeObject;
    TribeNode next;
    public TribeNode(Tribe obj)
    {
        this.tribeObject = obj;
    }
    public TribeNode(Tribe obj, TribeNode next)
    {
        this.tribeObject = obj;
        this.next = next;
    }
}

