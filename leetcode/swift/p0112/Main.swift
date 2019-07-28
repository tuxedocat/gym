public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?
    public init(_ val: Int) {
        self.val = val
        left = nil
        right = nil
    }
}

class Solution {
    func hasPathSum(_ root: TreeNode?, _ sum: Int) -> Bool {
        return treeSumDFS(root, sum)
    }

    func treeSumDFS(_ node: TreeNode?, _ sum: Int) -> Bool {
        guard let node = node else {
            return false
        }

        if node.left == nil, node.right == nil { return sum == node.val }

        return treeSumDFS(node.left, sum - node.val) || treeSumDFS(node.right, sum - node.val)
    }
}
