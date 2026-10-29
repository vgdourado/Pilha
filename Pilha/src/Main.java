public class Main {
    public static void main(String[] args) {
        Pilha pilha1 = new Pilha();

        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);
        pilha1.push(40);
        pilha1.push(50);

        while (!pilha1.isEmpty()) {
            int elementos = pilha1.pop();
            System.out.println("Desempilhei o " + elementos);
        }

        int e = pilha1.pop();
    }
}
