/// week11-3.cpp 老師最喜歡的 Selection Sort 選擇排序
#include <stdio.h>
int main()
{
    int a[10] = {9,8,7,6,5,4,3,2,1,0}; /// 一開始的陣列

    for (int k=0; k<10; k++) printf("%d ", a[k] );
    printf("\n"); /// 這次改成 k k k 的迴圈，比較好看

    for (int i=0; i<10; i++) { /// 左手 i 選擇 1 個 i
        for (int j=i+1; j<10; j++) { /// 右手 j j j 往右找
            if (a[i] > a[j]) { /// 如果左手 i vs. 右手 j
                int temp = a[i]; /// 大小不對，就交換
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    /// 排到一半，就印出來吧！！！
    for (int k=0; k<10; k++) printf("%d ", a[k] );
    printf("\n"); /// 這次改成 k k k 的迴圈，比較好看
}
