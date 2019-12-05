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
    func maxDepth(_ t: TreeNode?) -> Int {
        func treeDFS(_ n: TreeNode?, _ depth: Int) -> Int {
            guard let n = n else {
                return depth
            }
            if n.left == nil, n.right == nil { return depth + 1 }
            return max(treeDFS(n.left, depth + 1), treeDFS(n.right, depth + 1))
        }

        return treeDFS(t, 0)
    }
}
