#include <stdio.h>
#include <stdlib.h>

int main() {

    int T; scanf("%d",&T);
    for(int t=1;t<=T;t++){
        int N; scanf("%d",&N);
        printf("Case #%d:\n",t);
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                printf(" ");
            }
            for(int j=1;j<=i;j++){
                printf("*");
            }
            printf("\n");
        }
    }
    return 0;
}
