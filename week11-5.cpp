// week11-5.cpp YEH021_sort_100
#include <stdio.h>
int main()
{
    int a[100];
    // (1) 輸入階段：讀取 100 個數字
    for (int i=0; i<100; i++) {
        scanf("%d", &a[i] );
    }

    // (2) 處理階段：選擇排序法 (從小到大)
    for (int i=0; i<100; i++) {
        for (int j=i+1; j<100; j++) {
            if (a[i] > a[j]) { // 如果左邊比右邊大
                int temp = a[i]; // 進行交換
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    // (3) 輸出階段：印出排序後的 100 個數字
    for (int i=0; i<100; i++) {
        printf("%d ", a[i] );
    }
}