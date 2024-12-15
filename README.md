# Round Robin Algorithm

This project implements the Round Robin scheduling algorithm in Javva without relying on external libraries like ``java.util``. It includes a simple custom queue implementation and simulates the execution of processes with random execution times.

## How it works

Round Robin is a CPU scheduling algorithm where each process gets an equal share of the CPU in cyclic order. Processes are executed for a fixed time slice (quantum). If a process is not completed within its allocated quantum, it is added back to the queue for further execution in the next cycle.

## Execution

### Input:

```
Enter the number of processes: 4
Enter the quantum (in time units): 5
```

### Output:

```
Created Process 1 with runtime of 97ms
Created Process 2 with runtime of 89ms
Created Process 3 with runtime of 94ms
Created Process 4 with runtime of 5ms

Executing: Process 1, time: 0ms
Executing: Process 2, time: 5ms
Executing: Process 3, time: 10ms
Executing: Process 4, time: 15ms

...

Executing: Process 1, time: 283ms
Finished: Process 1, time: 285ms
```