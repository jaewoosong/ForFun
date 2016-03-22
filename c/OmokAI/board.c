#include <stdio.h>
#define SIZE 5

char intToChar(int input)
{
    if(input == 0) { return ' '; }
    else if(input == 1) { return 'O'; }
    else if(input == -1) { return 'X'; }
    else { return '?'; }
}

int main(void)
{
    int board[SIZE][SIZE] = {{0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0}};
    int i;
    int j;

    for(i=0; i<SIZE; ++i)
    {
        printf("-----------\n|");
        for(j=0; j<SIZE; ++j)
        {
            printf("%c|", intToChar(board[i][j]));
        }
        printf("\n");
    }
    printf("-----------\n|");

    return 0;
}
