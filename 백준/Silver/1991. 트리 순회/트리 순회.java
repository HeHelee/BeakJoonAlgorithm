import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	char value; //루트
	Node left; //왼쪽
	Node right; //오른쪽
	
	public Node(char value) {
		this.value = value; //루트
		this.left = null; //왼쪽
		this.right = null; //오른쪽
		
	}
	
}

public class Main {
	static Node Tree[];
	
	public static void main(String[] args) throws IOException  {
	  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  	int N = Integer.parseInt(br.readLine()); //노드 개수
	    Node Tree[] = new Node[N+1]; //배열 생성
	    
	    for (int i = 0; i < N; i++) { //입력 받기
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	char value = st.nextToken().charAt(0);
	    	char left = st.nextToken().charAt(0);
	    	char right = st.nextToken().charAt(0); 
	    
	    //노드들 입력
	    //부모 노드 생성
	    if (Tree[value-'A'] == null) {
	    	Tree[value - 'A'] = new Node(value);
	    }
	    //왼쪽 자식 노드 생성
	    if (left != '.') {
	    	Tree[left - 'A'] = new Node(left); //자식 노드 생성
	    	Tree[value - 'A'].left = Tree[left-'A'];
	    	
	    }
	    //오른쪽 자식 노드 생성
	    if (right != '.') {
	    	Tree[right - 'A'] = new Node(right); //자식 노드 생성
	    	Tree[value-'A'].right = Tree[right-'A'];
	    }
	    }
	    //전위 순회
	    postOrder(Tree[0]);
	    System.out.println();
	    //중위 순회
	    InOrder(Tree[0]);
	    System.out.println();
	    //후위 순회
	    preOrder(Tree[0]);
	    System.out.println();
	}

	private static void postOrder(Node node) {
		//전위
		if (node == null)
			return;
		System.out.print(node.value);
		postOrder(node.left);
		postOrder(node.right);
		
	}

	private static void InOrder(Node node) {
		//중위
		if (node == null)
			return;
		InOrder(node.left);
		System.out.print(node.value);
		InOrder(node.right);
		
		
	}

	private static void preOrder(Node node) {
		//후위
		if(node == null)
			return;
		preOrder(node.left);
		preOrder(node.right);
		System.out.print(node.value);

		
	}

}
