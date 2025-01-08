# Maze Algorithms with Threads and Serialization

## Overview
This project implements advanced algorithms for solving and generating mazes in both 2D and 3D, with a focus on:
- Multi-threaded operations to optimize performance.
- Data transfer between classes using **Serializable**.
- Extensible algorithms for maze generation and solving, including extensions to 3D.

## Features
- **Multi-Threading**:
  - Efficient use of threads to handle maze operations concurrently.
- **Serialization**:
  - Seamless data transfer between classes using Java's Serializable interface.
- **Maze Algorithms**:
  - A variety of solving algorithms, including:
    - Depth-First Search (DFS).
    - Breadth-First Search (BFS).
    - Best-First Search.
  - Extensions of these algorithms to 3D mazes.
- **Maze Generators**:
  - Includes multiple strategies for generating mazes:
    - Simple Maze Generator.
    - Empty Maze Generator.
    - Complex Maze Generator for both 2D and 3D.

## Code Structure
- **algorithms**: Contains solving algorithms for 2D and 3D mazes.
- **mazes**: Contains maze generation logic for 2D and 3D.
- **tests**: JUnit tests for algorithms and maze generators.

## How to Run
1. **Compile the project** using your favorite Java IDE or the command line.
2. **Run the tests**:
   - Navigate to the `tests` directory and execute JUnit tests for validation.
3. For the main algorithms, execute:
   - `RunMazeGenerator`: To test maze generation.
   - `RunSearchOnMaze`: To test solving algorithms.

## Key Files
- `Maze.java`, `Maze3D.java`: Representations of 2D and 3D mazes.
- `BestFirstSearch.java`, `BreadthFirstSearch.java`: Solving algorithms.
- `MyMazeGenerator.java`, `MyMaze3DGenerator.java`: Custom maze generators.
- `Solution.java`: Represents the solution path of a maze.

## Technologies
- **Java**: Programming language.
- **JUnit**: For testing algorithms and functionality.

## Acknowledgements
This project was developed as part of the course "Advanced Programming Topics," with a focus on backend development and advanced algorithm implementation.
