import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); // 유저의 수
		int m=sc.nextInt(); // 친구관계의 수
		//플로이드 마샬 법칙 사용 
		int[][] dist= new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				dist[i][j]=987654321;//큰값으로 설정
			}
		}
		//친구관계 맵 만들기+무향
		for(int i=1; i<=m; i++) {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			dist[n1][n2]=1;
			dist[n2][n1]=1;
		}
		//k=거쳐가는 노드
		for(int k=1; k<=n; k++) {
			//i=출발 노드
			for(int i=1; i<=n; i++) {
				//j=도착 노드
				for(int j=1; j<=n; j++) {
					if(dist[k][i]+dist[k][j]<dist[i][j]) {
						dist[i][j]=dist[k][i]+dist[k][j];
					}
				}
			}
		}
		int ans=Integer.MAX_VALUE;
		int idx=0;
		for(int i=1; i<=n; i++) {
			int sum=0;
			for(int j=1; j<=n; j++) {
				sum+=dist[i][j];
			}
			if(sum<ans) {
				ans=Math.min(ans, sum);
				idx=i;
			}
		}
		System.out.println(idx);
		
	}

}