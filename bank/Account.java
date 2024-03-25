package bank;

public class Account<T> {
    private T id;
    private float sum;
    private boolean isBlocked;

    public Account(T id, float sum, boolean isBlocked) {
        this.id = id;
        this.sum = sum;
        this.isBlocked = isBlocked;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
