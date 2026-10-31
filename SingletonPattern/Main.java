public class Main {
    public static void main(String[] args) {
        QueueSystem system = QueueSystem.getInstance();
        System.out.println(">>>-PAG-IBIG CENTRALIZED QUEUE STARTED-<<<");
        
        system.getNext(1);
        system.getNext(2);
        system.getNext(3);

        System.out.println("\n[Online Monitor] Currently Serving: #" + system.getCurrentQueue() + "\n");

        system.resetQueueTo(1, 50);

        system.getNext(2);
        system.getNext(3);
        
        System.out.println("\n[Online Monitor] Currently Serving: #" + system.getCurrentQueue());
    }
}