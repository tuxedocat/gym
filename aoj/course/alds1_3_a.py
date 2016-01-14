def solve(eq=None):
    if not eq:
        eq = map(str, input().strip().split())
    stack = []
    ops = {"+": lambda a, b: a + b,
           "-": lambda a, b: a - b,
           "*": lambda a, b: a * b}
    for symbol in eq:
        if symbol in ops:
            op = ops[symbol]
            b = stack.pop()
            a = stack.pop()
            stack.append(op(a, b))
        else:
            stack.append(int(symbol))
    result = stack.pop()
    return result


def test():
    eq1 = "1 2 +".split()
    eq2 = "1 2 + 3 4 - *".split()
    print(solve(eq1))
    print(solve(eq2))

if __name__ == '__main__':
    print(solve(None))
