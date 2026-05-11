// week12-2c.cpp
#include <stdio.h>
int main()
{
    int N;
    scanf("%d", &N);
    int ans = 0;
    int N2 = N; // 備份原始的 N 到 N2
    while ( N > 0 ) {
        ans = ans * 10 + N % 10;
        N = N / 10;
    }
    printf("%d+%d=%d\n", N2, ans, N2 + ans);
}