package offer;

/**
 * 
 * 
 * ��ָoffer�����
 */
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 *  ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 *  ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 *   NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 *  
 * @author ���������
 *
 */
public class Problem01 {
    public int minNumberInRotateArray(int [] array) {

    	int num = 0;
    	for(int i = 1;i < array.length;i ++){
    		if(array[i-1]>array[i]){
    			num = i;
    			break;
    		}
    	}
    	return array[num];
    }
}
