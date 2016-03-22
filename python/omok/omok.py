import copy
import random

def intToChar(input):
	if input == 0:
		return ' '
	elif input == 1:
		return 'O'
	elif input == -1:
		return 'X'
	else:
		return '?'

def printBoard(size, board):
	print("-------------\n", end="")
	print("  |a|b|c|d|e|\n", end="")
	for i in range(0, size):
		print("-------------\n", end="")
		print(" " + str(i+1) + "|", end="")
		for j in range(0, size):
			print(intToChar(board[i][j]) + "|", end="")
		print("")
	print("-------------\n", end="")

def addOne(size, board, bw):
	checkFull = 1
	for i in range(0, size):
		for j in range(0, size):
			checkFull *= board[i][j]
	if not checkFull:
		iRand = random.randint(0, size-1)
		jRand = random.randint(0, size-1)
		while board[iRand][jRand] != 0:
			iRand = random.randint(0, size-1)
			jRand = random.randint(0, size-1)
		board[iRand][jRand] = bw
	return board

size = 5
bw = -1
checkNotFin = True
board = [[0, 0, 0, 0, 0],
		 [0, 0, 0, 0, 0],
		 [0, 0, 0, 0, 0],
		 [0, 0, 0, 0, 0],
		 [0, 0, 0, 0, 0]]

while(checkNotFin):
	printBoard(size, board)
	prevBoard = copy.deepcopy(board)
	addOne(size, board, bw)
	if prevBoard == board:
		checkNotFin = False
	bw *= -1
