package task9;

public class Main {

    public static class Node {
        int    key;
        String value;
        Node   leftChild;
        Node   rightChild;
        Node(int key, String name) {
            this.key = key;
            this.value = name;
        }
        @Override
        public String toString() {
            return "Key: " + key + " Value:" + value;
        }
    }

    private Node root;

    public void addNode(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        }
        else {
            Node currentNode = root;
            Node parent;
            while (true) {
                parent = currentNode;
                if (key < currentNode.key) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void traverseTree(Node currentNode) {
        if (currentNode != null) {
            traverseTree(currentNode.leftChild);
            System.out.println(currentNode);
            traverseTree(currentNode.rightChild);
        }
    }

    public void traverseTree() {
        traverseTree(root);
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            }
            else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public Node min(Node root){
        if (root == null){
            return null;
        }
        if (root.leftChild == null){
            return root;
        }
        return min(root.leftChild);
    }
    public void deleteNode(int key) {
        root = delete(root, key);
    }
    private Node delete(Node root, int key){
        if(root ==null){ return root;}
        else if(root.key < key)
            root.rightChild = delete(root.rightChild, key);

        else if(root.key > key)
            root.leftChild = delete(root.leftChild, key);
        else{
            if(root.leftChild ==null)
                return root.rightChild;
            else if(root.rightChild == null)
                return root.leftChild;
            root.key = min(root.rightChild).key;
            root.value = min(root.rightChild).value;
            root.rightChild= delete(root.rightChild, root.key);
        }
        return root;
    }

    public static void main(String[] args) {
        Main continents = new Main();
        continents.addNode(1, "Європа");
        continents.addNode(3, "Африка");
        continents.addNode(5, "Австралія");
        continents.addNode(4, "Америка");
        continents.addNode(2, "Азія");
        continents.addNode(6, "Антарктида");
        continents.traverseTree();
        System.out.println("\nКонтинент з ключем 4:");
        System.out.println(continents.findNode(4));
        continents.deleteNode(1);
        continents.deleteNode(6);
        System.out.println("\nВидалення останнього вузла:");
        continents.traverseTree();
    }
}
