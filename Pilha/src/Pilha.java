public class Pilha {
  int elementos[];
  int topo;

  public Pilha() {
    elementos = new int[5];
    topo = -1;
  }

  public void push(int numero) {
    if (isFull()) {
      throw new RuntimeException("A pilha está cheia! (Stakc overflow)");
    }
    topo++;
    elementos[topo] = numero;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("A pilha já está vazia!");
    }
    int e;
    e = elementos[topo];
    topo--;

    return e;
  }

  public boolean isEmpty() {
    if (topo == -1) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if (topo == elementos.length) {
      return true;
    }
    return false;
  }

  public int top() {
    return elementos[topo];
  }

}
