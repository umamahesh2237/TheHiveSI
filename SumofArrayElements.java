#include <stdio.h>
#include <stdlib.h>

int main() {
    long T; scanf("%ld",&T);
    while(T--){
        long N;
        scanf("%ld",&N);
        long a[N];
        for(long i=0;i<N;i++){
            scanf("%ld",&a[i]);
        }
        long s=0;
        for(long i=0;i<N;i++){
            s += a[i];
        }
        printf("%ld\n",s);
    }
    return 0;
}
