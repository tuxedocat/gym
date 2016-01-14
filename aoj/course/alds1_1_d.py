def max_profit(rates):
    _min = rates[0]
    _max = rates[1] - rates[0]
    for j in range(1, len(rates)):
        _currdiff = rates[j] - _min
        _max = _currdiff if _currdiff > _max else _max
        _min = rates[j] if rates[j] < _min else _min
    return _max


def main():
    N = int(input().strip())
    rs = [int(input().strip()) for i in range(N)]
    print(max_profit(rs))


if __name__ == '__main__':
    main()
