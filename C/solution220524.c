#include <stdio.h>

int main(void) {
    int a;
    int b;
    scanf("%d %d", &a, &b);
    int i, j;
    for (j = 0; j < b; j++) {
        for (i = 0; i < a; i++) {
            printf("*");
        }printf("\n");
    }
    return 0;
}