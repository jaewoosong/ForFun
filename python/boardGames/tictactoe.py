import random

tttArr = [" ", " ", " ",
          " ", " ", " ",
          " ", " ", " "]

def printBoard(tttArr):
    print('-------------')
    print('| ' + tttArr[0] + ' | ' + tttArr[1] + ' | ' + tttArr[2] + ' |')
    print('-------------')
    print('| ' + tttArr[3] + ' | ' + tttArr[4] + ' | ' + tttArr[5] + ' |')
    print('-------------')
    print('| ' + tttArr[6] + ' | ' + tttArr[7] + ' | ' + tttArr[8] + ' |')
    print('-------------')

printBoard(tttArr)

while(" " in tttArr):
    player = int(input("Your turn: "))
    while(tttArr[player] != " "):
        player = int(input("Your turn: "))
    tttArr[player] = 'O'
    if(" " not in tttArr):    
        printBoard(tttArr)
        break

    computer = player
    while(tttArr[computer] != " "):
        computer = random.randrange(0, 9)
    tttArr[int(computer)] = 'X'
    printBoard(tttArr)

