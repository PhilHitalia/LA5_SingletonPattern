public class QueueSystem {
    private static final QueueSystem INSTANCE = new QueueSystem();
    private int activeTicketNumber;
    private QueueSystem() {
        this.activeTicketNumber = 0;
    }

    public static QueueSystem getInstance() {
        return INSTANCE;
    }

    public synchronized int getNext(int deskId) {
        activeTicketNumber++;
        System.out.println("Help Desk " + deskId + " is currently serving Ticket #" + activeTicketNumber);
        return activeTicketNumber;
    }

    public synchronized int getCurrentQueue() {
        return activeTicketNumber;
    }

    public synchronized void resetQueueTo(int deskId, int startNumber) {
        if (startNumber < 0) {
            System.out.println("(Error) Cannot reset to a negative ticket number.");
            return;
        }
        this.activeTicketNumber = startNumber;
        System.out.println("Queue Reset: Desk " + deskId + " reset the queue to Ticket #" + startNumber);
    }
}