package step1;

public class Array {

	public Array() {
		//arrayInit();
		//rDimensionsArray();
		//irrDimensionsArray();
		arrayCopy();
	}
	
	//初始化实例
	private void arrayInit(){
		//静态初始化
		//String[] myArray=new String[]{"1","2","3"};
		//String[] myArray={"1","2","3"};
		//showLoop(myArray);
		
		
		//动态遍历初始化
		String[] myArray1=new String[100];
		for(int i=0;i<myArray1.length;i++){
			myArray1[i]=Integer.toString(i+1);
		}
		showLoop(myArray1);
		
	}
	
	private void showLoop(String[] myArray1){
		for(int i=0;i<myArray1.length;i++) 
			System.out.println("myArray1["+i+"]="+myArray1[i]);
	}
	
	//规则多维数组
	private void rDimensionsArray(){
		int[][] myArray=new int[3][3];
		int num=10;
		for(int i=0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){
				num++;
				myArray[i][j]=num;
				
			}
		}
		for(int i=0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){
				System.out.print(myArray[i][j]+" ");
				if(j==myArray[i].length-1) System.out.println();
			}
		}
	}
	
	//不规则多维数组
	private void irrDimensionsArray(){
		int[][]myArray=new int[3][];
		myArray[0]=new int[1];
		myArray[0][0]=1;
		myArray[1]=new int[2];
		myArray[1][0]=2;
		myArray[1][1]=3;
		myArray[2]=new int[3];
		myArray[2][0]=4;
		myArray[2][1]=5;
		myArray[2][2]=6;
		for(int i=0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){
				System.out.print(myArray[i][j]+" ");
				if(j==myArray[i].length-1) System.out.println();
			}
		}
	}

	private void arrayCopy(){
		int[] myArray=new int[]{1,2,3,4,5,6,7,8,9};
		int[] myArray1=new int[]{7,7,7,7,7,7,7,7,7,7,7,7,7,7,7};
		System.arraycopy(myArray, 3, myArray1, 2, 6);
		for(int i=0;i<myArray1.length;i++) 
			System.out.print(myArray1[i]);
	}

	public static void main(String[] args) {
		new Array();
	}
}