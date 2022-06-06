package org.sofka.dieciocho;

public interface IEntregable {
    public void entregar();
    public void devolver();
    public boolean isEntregado();
    public int compareTo(Object a);
}
