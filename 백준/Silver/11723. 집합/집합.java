import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int m=Integer.parseInt(br.readLine());
		int [] arr= new int[21];
		StringTokenizer st= null;
		int num=0;
		String act="";
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine()," ");
			act=st.nextToken();
			if(act.equals("add")) {
				num=Integer.parseInt(st.nextToken());
				if(arr[num]!=0) continue; //안에 값이 있으면 지나간다.
				else arr[num]++;
			}
			else if(act.equals("remove")) {
				num=Integer.parseInt(st.nextToken());
				if(arr[num]!=0) arr[num]=0; //안에 값이 있다면 0으로 초기화
				else continue;
			}
			else if(act.equals("check")) {
				num=Integer.parseInt(st.nextToken());
				if(arr[num]!=0) bw.write("1\n");
				else bw.write("0\n");
			}
			else if(act.equals("toggle")) {
				num=Integer.parseInt(st.nextToken());
				if(arr[num]!=0) arr[num]=0;
				else arr[num]++;
			}
			else if(act.equals("all")) {
				arr=new int[21];
				for(int j=1; j<=20; j++) {
					arr[j]=1;
				}
			}
			else {
				arr= new int[21];
			}
		}
		bw.flush();

	}

}