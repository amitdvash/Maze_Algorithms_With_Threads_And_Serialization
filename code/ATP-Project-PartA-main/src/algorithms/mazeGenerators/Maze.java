package algorithms.mazeGenerators;

/**
 * Class to represent a maze.
 */
public class Maze {
    private int col;
    private int row;
    private int[][] maze;

    /**
     * Constructor to initialize a maze with specified number of rows and columns.
     *
     * @param row the number of rows in the maze.
     * @param col the number of columns in the maze.
     */
    public Maze(int row, int col) {
        maze = new int[row][col];
        this.row = row;
        this.col = col;
    }

    /**
     * A function to put values in the maze at a specific index.
     *
     * @param row the row index.
     * @param col the column index.
     * @param value the value to be placed in the maze (0 or 1).
     */
    public void changePositionValue(int row, int col, int value) {
        // Check input
        if (!this.indexValidation(row, col) || (value != 0 && value != 1)) {
            System.out.println("Invalid input:" + " row- " + row + ", col- " + col);
        }
        // Set the value in the maze
        maze[row][col] = value;
    }

    /**
     * A function that returns if the given index is in the maze or not.
     *
     * @param row the row index.
     * @param col the column index.
     * @return true if the index is valid, else false.
     */
    public boolean indexValidation(int row, int col) {
        if (row >= this.row || col >= this.col || row < 0 || col < 0) {
            return false;
        }
        return true;
    }

    /**
     * Check if a position in the maze is a wall.
     *
     * @param row the row index.
     * @param col the column index.
     * @return true if the position is a wall, else false.
     */
    public boolean isPositionWall(int row, int col) {
        if (!this.indexValidation(row, col)) {
            return false;
        }
        // Returns if there is a wall or not
        return this.maze[row][col] == 1;
    }

    /**
     * Check if a position in the maze is a wall or out of bounds.
     *
     * @param row the row index.
     * @param col the column index.
     * @return true if the position is a wall or out of bounds, else false.
     */
    public boolean isPositionWallOrEmpty(int row, int col) {
        if (!this.indexValidation(row, col)) {
            return true;
        }
        return this.maze[row][col] == 1;
    }

    /**
     * Get the start position of the maze.
     *
     * @return the start position as a Position object.
     */
    public Position getStartPosition() {
        return new Position(0, 0);
    }

    /**
     * Get the goal position of the maze.
     *
     * @return the goal position as a Position object.
     */
    public Position getGoalPosition() {
        return new Position(row - 1, col - 1);
    }

    /**
     * Get the number of columns in the maze.
     *
     * @return the number of columns.
     */
    public int getColumns() {
        return col;
    }

    /**
     * Get the number of rows in the maze.
     *
     * @return the number of rows.
     */
    public int getRows() {
        return row;
    }

    /**
     * Get the 2D array that represents the maze.
     *
     * @return the maze as a 2D array.
     */
    public int[][] getMaze() {
        return maze;
    }

    /**
     * Print the maze to the console.
     * The start position is marked with 'S' and the goal position is marked with 'E'.
     * All other positions are printed as their respective values in the maze array.
     */
    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Mark the start with S
                if (i == 0 && j == 0) {
                    System.out.print("S ");
                }
                // Mark the goal with E
                else if (i == this.row - 1 && j == this.col - 1) {
                    System.out.print("E ");
                }
                // Just print the value
                else {
                    System.out.print(maze[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
