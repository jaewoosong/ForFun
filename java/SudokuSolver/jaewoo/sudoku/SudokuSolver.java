package jaewoo.forfun;

import java.util.ArrayList;

public class SudokuSolver {
	//private int[][] gridOrig = new int[9][9];
	private int[][] grid = new int[9][9];
	
	public void setGrid(int[][] gridData) throws Exception {
		if(gridData.length != 9) {
			throw new Exception("Grid should be 9*9.");
		}
		
		for(int i=0; i<9; i++) {
			if(gridData[i].length != 9) {
				throw new Exception("Grid should be 9*9.");
			}
			else {
				this.grid[i] = gridData[i].clone();
			}
		}
		//this.gridOrig = this.grid.clone();
	}
	
	public int[][] getGrid() {
		return this.grid;
	}
	
	public void printGrid() {
		for(int i=0; i<9; i++) {
			System.out.println(" --- --- --- --- --- --- --- --- --- ");
			for(int j=0; j<9; j++) {
				System.out.print("| ");
				if(this.grid[i][j] == 0) { System.out.print(" " ); }
				else { System.out.print(this.grid[i][j]); }
			    System.out.print(" ");
			}
			System.out.println("|");
		}
		System.out.println(" --- --- --- --- --- --- --- --- --- ");
	}
	
	private int[] arraylistToArray (ArrayList<Integer> list) {
		  int[] result = new int[list.size()];
		  for(int i=0; i<result.length; i++) { result[i] = list.get(i); }
		  return result;
		}
	
	public int[] getBlock(int row, int column) {
		ArrayList<Integer> block = new ArrayList<Integer>();
		if(row<3) {
			if(column<3) {
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
			else if(column<6) {
				for(int i=0; i<3; i++) {
					for(int j=3; j<6; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
			else {
				for(int i=0; i<3; i++) {
					for(int j=6; j<9; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
		}
		else if(row<6) {
			if(column<3) {
				for(int i=3; i<6; i++) {
					for(int j=0; j<3; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
			else if(column<6) {
				for(int i=3; i<6; i++) {
					for(int j=3; j<6; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
			else {
				for(int i=3; i<6; i++) {
					for(int j=6; j<9; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
		}
		else {
			if(column<3) {
				for(int i=6; i<9; i++) {
					for(int j=0; j<3; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
			else if(column<6) {
				for(int i=6; i<9; i++) {
					for(int j=3; j<6; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
			else {
				for(int i=6; i<9; i++) {
					for(int j=6; j<9; j++) {
						block.add(this.grid[i][j]);
					}
				}
			}
		}
		
		return this.arraylistToArray(block);
	}
	
	public void solveOneRound() {
		ArrayList<Integer> candidate = new ArrayList<Integer>();
		for(int i=0; i<9; i++) { // row
			for(int j=0; j<9; j++) { // column
				if(this.grid[i][j] == 0) {
					candidate.clear();
					candidate.add(1);
					candidate.add(2);
					candidate.add(3);
					candidate.add(4);
					candidate.add(5);
					candidate.add(6);
					candidate.add(7);
					candidate.add(8);
					candidate.add(9);
					
					int[] block3x3 = new int[9];
					block3x3 = getBlock(i, j).clone();
					
					for(int k=0; k<9; k++) {
						// search through the row
						candidate.remove(Integer.valueOf(this.grid[i][k]));
						
						// search through the column						
						candidate.remove(Integer.valueOf(this.grid[k][j]));
						
						// search through the block
						candidate.remove(Integer.valueOf(block3x3[k]));
					}
					
					if(candidate.size() == 1) {
						this.grid[i][j] = candidate.get(0);
					}
				}
			}
		}
	}
	
	public boolean isFinished() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(this.grid[i][j] == 0) { return false; }
			}
		}
		return true;
	}
	
	public static void main(String args[]) throws Exception {
		int[][] gridData = new int[9][9]; // nine rows, nine columns
		int round = 0;

		// sample problem
		gridData[0] = new int[] {0, 4, 5, 8, 0, 3, 7, 1, 0};
		gridData[1] = new int[] {8, 1, 0, 0, 0, 0, 0, 2, 4};
		gridData[2] = new int[] {7, 0, 9, 0, 0, 0, 5, 0, 8};
		gridData[3] = new int[] {0, 0, 0, 9, 0, 7, 0, 0, 0};
		gridData[4] = new int[] {0, 0, 0, 0, 6, 0, 0, 0, 0};
		gridData[5] = new int[] {0, 0, 0, 4, 0, 2, 0, 0, 0};
		gridData[6] = new int[] {6, 0, 4, 0, 0, 0, 3, 0, 5};
		gridData[7] = new int[] {3, 2, 0, 0, 0, 0, 0, 8, 7};
		gridData[8] = new int[] {0, 5, 7, 3, 0, 8, 2, 6, 0};
		
		SudokuSolver ss = new SudokuSolver();
		ss.setGrid(gridData);
		System.out.println("Round " + round);
		ss.printGrid();
		while(!ss.isFinished()) {
			ss.solveOneRound();
			System.out.println("Round " + ++round);
			ss.printGrid();
		}
	}
}
