# coding: utf-8

def shortenword(n, word):
    if len(word) <= 10:
        return word
    else:
        abbreviation = word[0] + str(len(word[1:-1])) + word[-1]
        return abbreviation

if __name__=="__main__":
    n = int(raw_input())
    i = 0
    wordsbuffer = []
    for i in range(1,n+1):
        word = raw_input()
        wordsbuffer.append(word)
    for word in wordsbuffer:
        abb = shortenword(n, word)
        print(abb)
