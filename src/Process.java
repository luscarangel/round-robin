public class Process {
    
    int id;
    int runtime;
    int remainingTime;

    public Process(int id, int runtime) {
        this.id = id;
        this.runtime = runtime;
        this.remainingTime = runtime;
    }

    public int run(int quantum) {
        if (this.remainingTime > quantum) {
            this.remainingTime -= quantum;
            return quantum;
        }
        
        int remaining = this.remainingTime;
        this.remainingTime = 0;
        return remaining;
    }

    public boolean finished() {
        return this.remainingTime == 0;
    }

    public int getId() {
        return this.id;
    }
}
