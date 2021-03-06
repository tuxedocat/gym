# coding: utf-8

def solve(word):
    vowels = ["A", "E", "I", "O", "U", "Y",
              "a", "e", "i", "o", "u", "y"]
    solved = ""
    for i, alphabet in enumerate(word):
        if alphabet in vowels:
            pass
        elif not alphabet in vowels:
            solved += "." + alphabet.lower()
    return solved

def main():
    word = raw_input()
    solved = solve(word)
    print(solved)



if __name__=="__main__":
    main()
