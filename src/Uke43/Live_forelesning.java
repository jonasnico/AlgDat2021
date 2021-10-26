package Uke43;

public class Live_forelesning {

    public static void main(String[] args) {
        System.out.println("Hello world");

        BST tree = new BST();

        int values[] = {9,7,1,3,5,11,13,10,8};

        for (int i = 0; i < values.length; i++) {
            tree.insert(values[i]);
            tree.print();
            System.out.println(" ");
        }

        System.out.println(tree.search(11));
        System.out.println(tree.search(4));



    }

    /**
     * Nodeklasse som har alt vi trenger for det Binære Søketreet
     */

    public static class Node {
        int value;
        Node right_child;
        Node left_child;
        Node parent;

        /**
         * Lager en node med null og barne-pekere og forelder
         * @param value
         */
        Node(int value) {
            this.value = value;
            this.right_child = null;
            this.left_child = null;
            this.parent = null;
        }

        Node(int value, Node parent) {
            this.value = value;
            this.parent = parent;
            this.left_child = null;
            this.right_child = null;
        }

        Node(int value, Node parent, Node left_child, Node right_child) {
            this.value = value;
            this.parent = parent;
            this.left_child = left_child;
            this.right_child = right_child;
        }

        void printPreOrderRecursive() {
            System.out.print(this.value + ", ");
            if (left_child != null) {
                left_child.printPreOrderRecursive();
            }
            if (right_child != null) {
                right_child.printPreOrderRecursive();
            }
        }
    }

    /**
     * Binary search tree klasse som har rot-noden og annen info om vårt søketre. Har også metoden for
     * innlegging, fjerning, søking, etc
     */

    public static class BST {
        Node root;

        /**
         * Denne funksjonen søker etter verdien i søketreet, men returnerer
         * null om verdien ikke finnes.
         * @param value
         * @return
         */

        //Kompleksitet: O(log(n))
        Node search(int value) {
            Node p = root;

            while (p != null && p.value == value) {
                //Verdien er større enn p -- gå til høyre
                if (value > p.value) {
                    p = p.right_child;
                }
                //Verdien er mindre --- gå til venstre
                else if (value < p.value) {
                    p = p.left_child;
                }
                else {
                    break;
                }
            }
            return p;
        }

        void insert(int value) {
            //Sjekker om det finnes noder fra før
            if (root == null) {
                root = new Node(value);
                return;
            }
            //Treet er ikke tomt - vi må legge inn verdi på riktig plass
            else {
                //Initialiser og sett rot noden til p
                Node p = root;
                Node q = null; //Parent til p

                while(p != null) {
                    q = p; //oppdaterer at nåværende p blir nye
                    if (value >= p.value) {
                        //Flytt p et hakk nedover
                        p = p.right_child;
                    } else {
                        //Flytt p et hakk nedover.
                        p = p.left_child;
                    }
                }

                //Nå har vi funnet hvor den nye noden skal ligge
                //Den nye noden skal være høyre eller venstre barn
                if (value >= q.value) {
                    q.right_child = new Node(value,q);
                }
                else {
                    q.left_child = new Node(value,q);
                }
            }
        }

        public void print() {
            this.root.printPreOrderRecursive();
        }
    }
}
