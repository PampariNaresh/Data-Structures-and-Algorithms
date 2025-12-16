import java.util.*;

class BinaryTree {
    static class Pair<K,V> {
        K height;
        V isBalanced;

        Pair(K height, V isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
    }}
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static int index = -1;

    public static TreeNode buildTree(TreeNode root, int arr[]) {
        index++;
        int data = arr[index];
        if (data == -1)
            return null;
        root = new TreeNode(data);
        root.left = buildTree(root.left, arr);
        root.right = buildTree(root.right, arr);
        return root;

    }

    public static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.peek();
            System.out.print(node.data + " ");

            q.poll();

            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }

        }

    }

    public static void levelOrderPrint(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            TreeNode node = q.peek();

            // System.out.print(node.data + " ");

            q.poll();
            if (node == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            } else {
                System.out.print(node.data + " ");

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

        }

    }

    public static TreeNode createLevelOrder(TreeNode root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Root data :");
        int data = sc.nextInt();

        root = new TreeNode(data);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.peek();
            q.poll();
            System.out.println("Enter left of data of " + node.data);
            int leftdata = sc.nextInt();
            if (leftdata != -1) {
                node.left = new TreeNode(leftdata);
                q.offer(node.left);
            }
            System.out.println("Enter right of data of " + node.data);
            int rightdata = sc.nextInt();
            if (rightdata != -1) {
                node.right = new TreeNode(rightdata);
                q.offer(node.right);
            }

        }
        sc.close();
        return root;
    }

    public static int leafnodes(TreeNode root) {
        if (root == null) {
            return 0;

        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafnodes(root.right) + leafnodes(root.left);

    }

    public static int leafnodesCount(TreeNode root) {
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.peek();
            q.poll();
            if (node.left == null && node.right == null) {
                count++;
            }
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
        return count;
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int diametermaxi = 0;

    public static void findDiameter(TreeNode root) {
        if (root == null)
            return;
        int lh = height(root.left);
        int rh = height(root.right);
        diametermaxi = Math.max(diametermaxi, lh + rh + 1);
        findDiameter(root.left);
        findDiameter(root.right);

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftsubtree = isBalanced(root.left);
        boolean rightsubtree = isBalanced(root.right);
        boolean diff = (Math.abs(height(root.left) - height(root.right))) <= 1;
        if (leftsubtree && rightsubtree && diff)
            return true;
        else
            return false;

    }

    public static Pair<Integer, Boolean> isBalanced2(TreeNode root) {
        if (root == null) {
            Pair<Integer, Boolean> p = new Pair<>(0, true);
            return p;}
        Pair<Integer, Boolean> left = isBalanced2(root.left);
        Pair<Integer, Boolean> right = isBalanced2(root.right);
        boolean leftAns = left.isBalanced;
        boolean rightAns = right.isBalanced;
        boolean diff = Math.abs(left.height - right.height) <= 1;
        Pair<Integer, Boolean> myPair = new Pair<>(1 + Math.max(left.height, right.height), leftAns && rightAns && diff);
        return myPair;

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // TreeNode root = buildTree(null, arr);
        TreeNode root = null;
        root = createLevelOrder(root);
        levelOrderPrint(root);
        int count = leafnodesCount(root);
        System.out.println(count);
        System.out.println(height(root));
        findDiameter(root);
        System.out.println(diametermaxi);
        System.out.println(isBalanced(root));

        /*
         * inorder(root);
         * System.out.println();
         * preorder(root);
         * System.out.println();
         * postorder(root);
         * System.out.println();
         * levelOrder(root);
         * System.out.println();
         * levelOrderPrint(root);
         */

    }

}