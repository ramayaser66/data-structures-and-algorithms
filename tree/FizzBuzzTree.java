package tree;

public class FizzBuzzTree {


    public BinaryTree FizzBuzzTree(BinaryTree tree, Node root){
        if (root !=null){
            if (((int)root.value % 3)==0 && ((int)root.value % 5)==0 ){
                root.value = "FizzBuzz";
            }
            else if (((int)root.value % 5)==0){
                root.value = "Buzz";
            }
            else if (((int)root.value % 3)==0){
                root.value = "Fizz";
            }
            if (tree.root.left!= null){
                FizzBuzzTree(tree, root.left);
            }
            if (tree.root.right!= null){
                FizzBuzzTree(tree, root.right);
            }
        }
        return tree;
    }

}
