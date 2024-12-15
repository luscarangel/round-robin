import java.util.Random;
import java.util.Scanner;

public class RoundRobin {

    public static void roundRobin(Queue queue, int quantum) {

        int time = 0;
        
        while (!queue.isEmpty()) {
            Process currentProcess = queue.dequeue();
            
            if (currentProcess != null) {
                System.out.println("Executing: Process " + currentProcess.getId() + ", time: " + time + "ms");

                int quantumDelta = currentProcess.run(quantum);
                time += quantumDelta;
    
                if (!currentProcess.finished()) {
                    queue.enqueue(currentProcess);
                } else {
                    System.out.println("Finished: Process " + currentProcess.getId() + ", time: " + time + "ms");
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of processes: ");
        int numberOfProcesses = scanner.nextInt();

        System.out.print("Enter the quantum (in time units): ");
        int quantum = scanner.nextInt();

        Queue queue = new Queue(numberOfProcesses);

        for (int i = 1; i <= numberOfProcesses; i++) {
            int runtime = random.nextInt(100) + 1;
            Process process = new Process(i, runtime);

            System.out.println("Created Process " + i + " with runtime of " + runtime + "ms");

            queue.enqueue(process);
        }

        roundRobin(queue, quantum);

        scanner.close();
    }
}
