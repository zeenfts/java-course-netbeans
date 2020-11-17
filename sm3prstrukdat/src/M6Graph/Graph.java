package M6Graph;

class Vertex {
    public char label;// label (contoh : ‘A’)
    public boolean wasVisited;

    public Vertex(char lab){// constructor
        label = lab;
        wasVisited = false;
    }
} // akhir dari class Vertex

class TheStack {
    private final int SIZE = 20;
    private int[] st;
    private int top;

    public TheStack(){ // constructor
        st = new int[SIZE]; // buat array
        top = -1;
    }

    public void push(int j){ // taruh item di top stack
        st[++top] = j;
    }

    public int pop(){ // mengeluarkan item dari top stack
        return st[top--];
    }

    public int peek(){ // melihat isi top
        return st[top];
    }

    public boolean isEmpty(){ // true jika stack kosong
        return (top == -1);
    } 
} // akhir dari class StackDFS

class Queue {
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public Queue(){// constructor
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }

    public void insert(int j){// menambahkan item di rear queue
        if (rear == SIZE - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }
    
    public int remove(){// mengeluarkan item dari front queue
        int temp = queArray[front++];
        if (front == SIZE) {
            front = 0;
        } 
        return temp;
    }
 
    public boolean isEmpty(){// true if queue is empty
        return (rear + 1 == front || (front + SIZE - 1 == rear));
    }
}// akhir dari class Queue

public class Graph {
    private int MAX_VERTS = 20;// array vertex
    private Vertex vertexList[];// adjacency matrix
    private TheStack theStack;
    private Queue theQueue;
    private int adjMat[][];
    private int nVerts;// variabel jumlah vertex 

    public Graph(){// constructor
        vertexList = new Vertex[MAX_VERTS];// adjacency matrix - set adjacency
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++){// matrix berulang sampai 0
            for (int k = 0; k < MAX_VERTS; k++){
                adjMat[1][3] = 1;
                int weight = 5;
                adjMat [1][3] = weight;
                adjMat [3][1] = weight;
                adjMat[j][k] = 0;
            }
        }
    } // end constructor
    
    // menambahkan suatu vertex baru ke list vertex
    public void addVertex(char vertex){
        vertexList[nVerts++]=new Vertex(vertex);
    }
    
    // menghubungkan dua vertex menggunakan matrix ketetanggaan
    public void addEdge(int a, int b){
        adjMat[a][b]=1;
        adjMat[b][a]=1;
    }
    
    // memberi arah pada vertex
    public void insertEdgeDirected(int a, int b){
        adjMat[a][b]=1;
    }
    
    // memberi bobot pada edge
    public void addEdgeWeighted(int a, int b, int weight){
        adjMat[a][b]=weight;
        adjMat[b][a]=weight;
    }
    
    // mengembalikan vertex ketetanggan yang belum dikunjungi ke v
    public int getAdjUnvisitedVertex(int v){
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
                return j;
            }
        } return -1;
    } // akhir getAdjUnvisitedVertex()
    
    // depth-first search
    public void dfs(){// Mulai dari vertex
        vertexList[0].wasVisited = true;// penanda bahwa vertex sudah dilewati
        displayVertex(0);// tampilkan vertex
        theStack.push(0);// push ke stack

        while (!theStack.isEmpty()){// sampai stack kosong 
            int v = getAdjUnvisitedVertex(theStack.peek());// vertex yang belum dikunjungi akan ditaruh ke top of stack
            if (v == -1){// jika tidak ada vertex lagi
                theStack.pop();// mengeluarkan dari top stack
            }
            else{// jika masih ada vertex
                vertexList[v].wasVisited = true;// beri tanda (kalau sudah dilewati)
                displayVertex(v);// tampilkan vertex
                theStack.push(v);// push ke stack
            }
        } // while berhenti// stack sudah empty (kosong), selesai
            
        for (int j = 0; j < nVerts; j++){ // reset tanda
            vertexList[j].wasVisited = false;
        }
        
    } // akhir dari clas dfs
    
    // breadth-first search
    public void bfs(){// mulai dari vertex 0// penanda (kalau sudah di lewati)
        vertexList[0].wasVisited = true;
        displayVertex(0);// menampilkan vertex
        theQueue.insert(0);// insert pada rear queue
        
        int v2;
        while (!theQueue.isEmpty()){// ketika queue tidak empty
            int v1 = theQueue.remove();// hapus vertex pada posisi front

            while ((v2 = getAdjUnvisitedVertex(v1)) !=1){// hapus sampai tidak ada vertex yang belum di lewati
                vertexList[v2].wasVisited = true;// tandai
                displayVertex(v2);// tampilkan
                theQueue.insert(v2);// insert ke queue
            } // while berhenti (unvisited neighbors)
        } // while berhenti (queue tidak kosong)

        for (int j = 0; j < nVerts; j++){ // reset penanda
            vertexList[j].wasVisited = false;
        }
    } // akhir dari bfs()
    
    public void mst(){ // minimum spanning tree (depth first)// Dimulai dari 0
        vertexList[0].wasVisited = true; // tandai
        theStack.push(0); // push ke stack
        
        while (!theStack.isEmpty()){ // sampai stack kosong
            int currentVertex = theStack.peek(); // mengambil stack paling atas
            int v = getAdjUnvisitedVertex(currentVertex); // mengambil tetangga setelahnya yang belum dikunjungi
            
            if (v == -1){ // ketika tidak ada lagi tetangga
                theStack.pop(); // pop stack
            } 
            else{ // ada tetangga
                vertexList[v].wasVisited = true; // tandai
                theStack.push(v); // push// tampilkan edge nya :
                displayVertex(currentVertex); // dari currentV
                displayVertex(v); // sampai v
                System.out.print(" ");
            }
        } // akhir while(stack tidak kosong)// stack kosong, maka selesai
        
        for (int j = 0; j < nVerts; j++){ // mengembalikan nilai seperti semula
            vertexList[j].wasVisited = false;
        }
    } // akhir mst
        
    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }// ----------------------------------------------------------

}// akhir dari class Graph
