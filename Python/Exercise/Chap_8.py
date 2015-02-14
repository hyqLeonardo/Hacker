## 8. 1

def back_disp(s) :
    """Take a string as input, then
         print it out backward
    """
    index = len(s) - 1
    while index >= 0 :
        letter = s[index]
        print letter
        index = index - 1


## 8. 2

def ducklings() :
    prefixes = 'JKLMNOPQ'
    suffix_1 = 'ack'
    suffix_2 = 'uack'

    for letter in prefixes :
        if letter == 'O' or letter == 'Q' :
            print letter + suffix_2
        else :
            print letter + suffix_1

## 8. 4

def find(word, letter, start) :
    index = start
    while index < len(word) :
        if word[index] == letter :
            return index
        index = index + 1
    return -1

## 8. 5

def count(word, letter) :
    t = 0
    for item in word :
        if item == letter :
            t = t + 1
    print t

## 8. 11

def any_lowercase1(s) :
    for c in s :
        if c.islower() :
            return True
        else :
            return False

def any_lowercase2(s) :
    for c in s :
        if 'c'.islower() :
            return 'True'
        else :
            return 'False'

def any_lowercase3(s) :
    for c in s:
        flag = c.islower()
    return flag

def any_lowercase4(s) :
    flag = False
    for c in s :
        flag = flag or c.islower()
    return flag

def any_lowercase5(s) :
    for c in s :
        if not c.islower() :
            return False
    return True


## 8. 12

def rotate_word(s, n) :
    """Given a string s and rotate each
        letter by the given amount n.
    """
    s_new = ''
    for c in s :
        if ord(c) + n > 122 :
            temp = ord('a') + (ord(c)+n-123)
            s_new = s_new + chr(temp)
        else :
            s_new = s_new + chr(ord(c) + n)
    return s_new

    


            
