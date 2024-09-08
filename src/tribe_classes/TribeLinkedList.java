package tribe_classes;

import design_classes.Design;
import design_classes.Message;

public class TribeLinkedList
{
    private TribeNode head;
    public TribeLinkedList()
    {
        this.head = null;
    }
    public void addTribeNode(TribeNode node)
    {
        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            TribeNode current = this.head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = node;
        }
    }
    public TribeNode getTribeNodeHead()
    {
        return this.head;
    }
    public void doTaskOfLab()
    {
        int totalPopulation = 0;
        int countTribeWithFire = 0;
        int countAllTribes = 0;
        TribeNode current = this.head;
        while (current != null)
        {
            if (current.getTribe().getFire().equals("ДА"))
            {
                countTribeWithFire++;
            }
            if (current.getTribe().getPopulation().matches("\\d+"))
            {
                totalPopulation = totalPopulation + Integer.parseInt(current.getTribe().getPopulation());
            }
            current = current.next;
            countAllTribes++;
        }
        Message.printMessage("Общая численность всех известных племен - " + totalPopulation, Design.GREEN, Design.YELLOW);
        Message.printMessage("Количество племен, владеющих огнем - " + countTribeWithFire + " из общего количества - " + countAllTribes, Design.GREEN, Design.YELLOW);
    }
}
