package idv.blake;

public interface Product extends Cloneable {
    public abstract void used(String s);
    public abstract Product createClone();
}
