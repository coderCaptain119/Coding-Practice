package Data_Structure.Tree;

import java.util.*;

public class Binary_Tree {

    //Method for create a binary tree for practice
    /* Exm :- Returning Tree
                1
               / \
              2   3
             / \ / \
            4  5 6  7
           / \
          8   9
     */
    public Binary_Tree_Node creteTree(){
        Binary_Tree_Node node1 = new Binary_Tree_Node(1);

        Binary_Tree_Node node2 = new Binary_Tree_Node(2);
        Binary_Tree_Node node3 = new Binary_Tree_Node(3);
        node1.left = node2;
        node1.right = node3;

        Binary_Tree_Node node4 = new Binary_Tree_Node(4);
        Binary_Tree_Node node5 = new Binary_Tree_Node(5);
        node2.left = node4;
        node2.right = node5;

        Binary_Tree_Node node6 = new Binary_Tree_Node(6);
        Binary_Tree_Node node7 = new Binary_Tree_Node(7);
        node3.left = node6;
        node3.right = node7;

        Binary_Tree_Node node8 = new Binary_Tree_Node(8);
        Binary_Tree_Node node9 = new Binary_Tree_Node(9);
        node4.left = node8;
        node4.right = node9;

        return node1;
    }

    // Method for Travers Given tree using NLR technique
    public void preOrderTraversal(Binary_Tree_Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // Method for Travers Given tree using LNR technique
    public void inOrderTraversal(Binary_Tree_Node root){
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // Method for Travers Given tree using LRN technique
    public void postOrderTraversal(Binary_Tree_Node root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // Method for Travers Given tree by Level Order
    public void levelOrderTraversal(Binary_Tree_Node root){
        if (root == null){
            return;
        }
        Queue<Binary_Tree_Node> level = new LinkedList<>();
        level.add(root);

        while (!level.isEmpty()){
            Binary_Tree_Node temp = level.remove();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                level.add(temp.left);
            if (temp.right != null)
                level.add(temp.right);
        }
    }

    // Method for find the height of given tree
    public int height(Binary_Tree_Node root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // Method for find Diameter of given tree
    public int getDiameter(Binary_Tree_Node root){
        if(root == null){
            return  0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = getDiameter(root.left);
        int rightDiameter = getDiameter(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    // Method for find Diameter and Height of given tree(Optimal way)
    public Result getDiameterAndHeight(Binary_Tree_Node root){
        if(root == null){
            return  new Result(0,0);
        }

        Result leftResult = getDiameterAndHeight(root.left);
        Result rightResult = getDiameterAndHeight(root.right);

        int currDiameter = Math.max(Math.max(leftResult.diameter, rightResult.diameter), leftResult.height + rightResult.height + 1);
        int currHeight = Math.max(leftResult.height, rightResult.height) + 1;

        return new Result(currDiameter, currHeight);
    }

    public class Result{
        public int diameter;
        public int height;
        public Result(int x, int y){
            this.diameter = x;
            this.height = y;
        }
    }

    // Method for Count Leaf Binary_Tree_Node in given tree
    public int countLeafNode(Binary_Tree_Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        return countLeafNode(root.left) + countLeafNode(root.right);
    }

    // Method for find count of all nodes in given tree
    public int countNodes(Binary_Tree_Node root){
        if(root == null){
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    // Wrapped Methods for find all Leaf nodes of given tree
    public List<Integer> findLeafNode(Binary_Tree_Node root){
        List<Integer> allLeaf = new ArrayList<>();
        findLeafNode(root, allLeaf);
        return allLeaf;
    }
    public void findLeafNode(Binary_Tree_Node root, List<Integer> leaf){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            leaf.add(root.data);
            return;
        }

        findLeafNode(root.left, leaf);
        findLeafNode(root.right, leaf);
    }

    // Wrapped Methods for print Path from root to every leaf Binary_Tree_Node
    public void pathToLeaf(Binary_Tree_Node root){
        List<Integer> path = new ArrayList<>();
        pathToLeaf(root, path);
        System.out.println();
    }
    public void pathToLeaf(Binary_Tree_Node root, List<Integer> path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            for (Integer a : path){
                System.out.print(a + " -> ");
            }
            System.out.println(root.data);
            return;
        }

        path.add(root.data);
        pathToLeaf(root.left, path);
        pathToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // Wrapped Method for find the cost(sum of path) to reach leaf Binary_Tree_Node
    public void costLeaf(Binary_Tree_Node root){
        costLeaf(root, 0);
    }
    public void costLeaf(Binary_Tree_Node root, int currSum){
        if(root == null){
            return;
        }
        currSum += root.data;
        if(root.left == null && root.right == null){
            System.out.println(root.data + " -> " + currSum);
        }
        costLeaf(root.left, currSum);
        costLeaf(root.right, currSum);
    }

    // Wrapped Methods for print Path from root to every leaf Binary_Tree_Node
    // and sum of whole path
    public void pathAndSum(Binary_Tree_Node root){
        List<Integer> path = new ArrayList<>();
        pathAndSum(root, path, 0);
    }
    public  void pathAndSum(Binary_Tree_Node root, List<Integer> path, int currSum){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            for (Integer a : path){
                System.out.print(a + " -> ");
            }
            System.out.print(root.data + " = ");
            System.out.println(currSum + root.data);
            return;
        }

        currSum += root.data;
        path.add(root.data);
        pathAndSum(root.left, path, currSum);
        pathAndSum(root.right, path, currSum);
        path.remove(path.size() - 1);
    }

    // Wrapped Methods for find count off odd and even sum of path
    // from root Binary_Tree_Node to leaf Binary_Tree_Node
    public void countOddEvenSum(Binary_Tree_Node root){
        Result_Count res = new Result_Count(0,0);
        countOddEvenSum(root, 0, res);
        System.out.println("Odd Sum Count : " + res.oddCount);
        System.out.println("Even Sum Count : " + res.evenCount);
    }
    public  void countOddEvenSum(Binary_Tree_Node root, int currSum, Result_Count result){
        if(root == null){
            return;
        }

        currSum += root.data;
        if(root.left == null && root.right == null){
            if(currSum%2 == 0)
                result.evenCount++;
            else
                result.oddCount++;
        }

        countOddEvenSum(root.left, currSum, result);
        countOddEvenSum(root.right, currSum, result);
    }
    class Result_Count{
        public int oddCount;
        public int evenCount;
        public Result_Count(int x, int y){
            this.oddCount = x;
            this.evenCount = y;
        }
    }

}
