#include <stdio.h>
#include <stdlib.h>

int main() {
    int input[100];
    int i, j, length = 0;
    char c;

    // Read input line
    printf("Enter integers (space separated): ");
    while ((c = getchar())!= '\n') {
        if (length < 100 && c >= '0' && c <= '9') {
            input[length++] = c - '0';
        }
    }

    // Remove duplicates
    for (i = 0; i < length; i++) {
        for (j = i + 1; j < length; j++) {
            if (input[i] == input[j]) {
                // Shift elements to the left
                for (int k = j; k < length - 1; k++) {
                    input[k] = input[k + 1];
                }
                length--;
                j--;
            }
        }
    }

    // Print output
    printf("After removing duplicates: ");
    for (i = 0; i < length; i++) {
        printf("%d", input[i]);
        if (i < length - 1) {
            printf(" ");
        }
    }
    printf("\n");

    return 0;
}