Tasks: The project is composed of the following implementation tasks.
1. Search Infrastructure
    1a. Search Node Representation: represent the state of the wumpus world (i.e., the size of the grid, if you have gold, and contents of each location), the f-value, parent pointer, and child pointers.
    1b. Successor Function: Given a state and operator, compute the next state.
    1c. Node Expansion: Given a node and set of operators, generate all successor nodes (compute all relevant information about the node, including the state from 1b., the g-value, h-value, and f-value).
    1d. Goal Check: create a function to determine if a search node satisfies the goal (i.e., have gold).
2. Search Algorithms
    2a. Breadth First Search: expand nodes in depth order
    2b. Depth First Search: expand nodes in generation order
    2c. Iterative Deepening Depth First Search: depth first search with increasing depth bound
    2d. Uniform Cost Search: Use g-values to prioritize search
    2e. Best First and A* Search: Prioritize search using heuristics
        2ei. Straight line Distance Heuristic: Compute the straight line distance to the gold (ignoring turning, the wumpus, and pits).
        2eii. Manhattan Distance Heuristic:  Compute number of moves on the grid to get to the gold (ignoring turning, the wumpus, and the pits).
        2eiii. Homegrown Heuristic: Design your own heuristic that augments one of the prior heuristics to account for the the cost of killing wumpus's and routing around pits.  Make sure you describe your heuristic in detail in the report.
3. Algorithm Enhancements
    3a. Duplicate Detection (i.e., use closed list)
    3b. Cycle Checking (i.e., instead of closed list, do not generate children of node that are identical to the parent of the node).
4. Experiments
    4a. Run all algorithms on the seeds from the first homework, but use grids of dimension 4, 8, 16, and 32 (use the "-d <dimension>" option to the simulator).  You must run each algorithm with only cycle checking, only duplicate detection, both cycle checking and duplicate detection, and neither.  Also, run both A* and Best First with each heuristic and each of these options.
    4b. Compute Statistics:
        4bi. Number of Nodes Expanded
        4bii. Per Node Cost (avg. time to expand a node)
        4biii. Total CPU time in milliseconds
Deliverables: The deliverables for the project include the source code and a written report. The report should summarize all of the implemented algorithms and any design choices. The report will also organize and present the results of the algorithms, using tables/figures that average each statistic over the seeds for the same problem dimension, and describe interesting features of the results, including:
    1. What are the tradeoffs between uninformed search techniques (BFS, DFS, IDDFS, and UCS)?
    2. What are the tradeoffs between informed search techniques (Best First Search and A*)?
    3. What are the tradeoffs between uninformed and informed search?
    4. How does the difference in the heuristics effect the search?
    5. Which has more impact: duplicate detection, cycle checking, or both?
Grading:
    - 20 pts: Report contains answers to questions and discussion of empirical results (referencing data collected and displayed in report)
    - 5 pts: Correct Search Infrastructure
    - 3 pts: each for BFS, DFS, IDDFS, UCS, A*/BestFirst
    - 2 pts: each for 3 heuristics, cycle checking, and duplicate detection

-r  -469813547  -a false  -d 4   -u true  -s 100000
-r   763255110  -a false  -d 4   -u true  -s 100000
-r -2006133410  -a false  -d 4   -u true  -s 100000

-r   62158108   -a false  -d 8   -u true  -s 100000
-r -594531478   -a false  -d 8   -u true  -s 100000
-r -106371908   -a false  -d 8   -u true  -s 100000

-r -1087684115  -a false  -d 16  -u true  -s 100000
-r  1986121006  -a false  -d 16  -u true  -s 100000
-r -1236093885  -a false  -d 16  -u true  -s 100000

-r 1067770741   -a false  -d 32  -u true  -s 100000
-r -817825615   -a false  -d 32  -u true  -s 100000
-r  -71790404   -a false  -d 32  -u true  -s 100000

Count expanded nodes. Expanded ones are those which you generate the children. Generated nodes are those that are created by expansion, plus one for the root node.

The cycle detection in the successor function (i.e., parent checking) is not mandatory, but a good idea. The project requirement for cycle checking is checking the grandparent, not the parent (as Chris notes).

you can assume that the wumpus will die "only if" it is shot from the adjacent square. 

To me an unsolvable maze is revealing. For a BFS, only a closed list can show there is no solution. That is important.
| 
| However, any seed that produces an "infinity" busts any averaging of statistics over seeds.
| 
| I intend to produce that average for worlds where the alg produced a result (no solution or solution). I will also state the number of seeds for which I got a memory heap error. Etc.
| 
| Further, in the stats, it is useful to know the score for any solution. The BFS produces shortest paths, but their cost is higher (score is lower) than a cost-based search.

- action cost: 10 shoot, 1 all others
- successor function: don't return successors that are equivalent to parent state (eg., no state change after bumping a wall, or anything after dying)

-duplicate detection means using a closed list, which means using the graph search algo. 

- you can ignore bool in search but if there is no solution then return a list of noops

- the state doesn't need a bool for dead. Just don't generate dead succsessors. 

This is expected. Everything is in closed, but the cycle check allows you to reduce the cost of checking. That is, unless you have O(1) access to the closed list.

Dr.Bryce

| The closed list does all the work that a cycle check does plus more. That is, it is a complete duplicate check, where the cycle check is only a partial duplicate check (of gparent).
| 
| Thus, the number of expanded nodes is the same when I run the closed list & cycle check both compared to running the closed list alone.
| 
| Just would like confirmation of this fact.

IDDFS should only store the path from the root to the current node, plus any siblings of nodes along the way. If you are keeping a closed list, it might get big. Otherwise, the point of doing IDDFS is to not use much memory and avoid loops (because of the depth bound).

Some of you have voiced some concerns about submitting just your AgentFunction and search code because you changed the main() to pass in arguments to switch between algorithms. I will accept all of your code, but please ensure that you include a README that describes its use and use Alan's change to allow infinite arrows.