import java.util.Scanner;
public class graph {
	int g[][];
	int n;	
	public graph(int n) {
		this.n=n;
		g=new int[n][n];
	}	
	public void displayAdjacencyMatrix() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(g[i][j]);
			}
			System.out.println();
		}
	}	
	public void addVertex() {
		n++;
		for(int i=0;i<n;i++) {
			g[i][n-1]=0;
			g[n-1][i]=0;
		}
	}	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of vertices:");
		int n= s.nextInt();
		graph gp=new graph(n);
		gp.displayAdjacencyMatrix();
		gp.addVertex();
		gp.displayAdjacencyMatrix();
	}
}