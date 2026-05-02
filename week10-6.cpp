// week10-6.cpp SOIT108_Advance_008
#include <stdio.h>
int main()
{
    int a[10];
    // (1) 輸入：讓使用者輸入 10 個整數
    for (int i=0; i<10; i++) {
        scanf("%d", &a[i] );
    }

    // (2) 處理：泡泡排序法 (完整兩層迴圈)
    for (int k=0; k<10-1; k++) {     // 外層：跑 n-1 次
        for (int i=0; i<10-1; i++) { // 內層：相鄰兩兩比較
            if ( a[i] < a[i+1] ) {   // 如果左邊小於右邊，就交換 (做大到小)
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }

    // (3) 輸出：印出排序後的結果
    for (int i=0; i<10; i++) {
        printf("%d ", a[i] );
    }
}