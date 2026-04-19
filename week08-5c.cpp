// week08-5c.cpp SOIT107_Base_013
#include <stdio.h>
int main()
{
    int N;
    scanf("%d", &N);

    // 1號是星期日(0)，所以 (N-1) 除以 7 的餘數就是答案
    printf("%d", (N - 1) % 7);

    return 0;
}