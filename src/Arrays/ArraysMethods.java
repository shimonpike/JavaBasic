
public class ArraysMethods {
public static void sortBubble(int[] ar)
{
	boolean res = true;
	do {
		res = maxToEnd(ar);
	}while(res != false);
}
public static boolean maxToEnd(int[] ar)
{
	int temp = 0;
	boolean flag = false;
	for(int i = 0;i < ar.length-1;i++)
	{
		if(ar[i] > ar[i+1])
		{
			temp = ar[i+1];
			ar[i+1] = ar[i];
			ar[i] = temp;
			flag = true;
		}
	}
	return flag;
}
/*
 *                      i i+1
 *       0  1  2  3  4  5  6    sorting  bubble sort
 *  ar->[1][2][3][4][6][8][9] 
 *    temp[1]
 * 
 * 
 * 
 */
public static void reverseArray(int[] ar)
{
	int temp =0;
for(int i = 0,j = ar.length-1;i < j;i++,j--)
{
	temp = ar[j];
	ar[j] = ar[i];
	ar[i] = temp;
}
}
/*                ij           ar.length-1 
 *       0  1  2  3  4  5  6   ar.length = 7
 *  ar->[1][2][4][5][7][8][9]
 *          temp[4]    
 *  
 *  
 *       [9][8][7][5][4][2]  
 *        0  1  2  3  4  5 
 * 
 * 
 */
}
