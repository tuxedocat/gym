# coding: utf-8

def solve(word):
    solved = ""
    if word.isupper():
        return word.lower()
    elif len(word)==1 and word.islower():
        return word.upper()
    elif word[0].islower() and word[1:].isupper():
        solved = word[0].upper() + word[1:].lower()
        return solved
    else:
        return word

def main():
    word = input()
    solved = solve(word)
    print(solved)



if __name__=="__main__":
    main()
