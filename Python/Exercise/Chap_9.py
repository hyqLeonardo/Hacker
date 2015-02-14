## 9. 1

def words_read() :
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        if len(word) > 20 :
            print word


## 9. 2

def has_no_e(word) :
    for letter in word :
        if letter == 'e' :
            return False
    return True

## 9. 3

def avoids(word, string) :
    for letter in word :
        if letter in string :
            return False
    return True
    
def num_avoids() :
    s = 0
    fin = open('words.txt')
    string = raw_input('String to avoid : ')
    for line in fin :
        word = line.strip()
        if avoids(word, string) == True :
            s += 1
    print s


## 9. 4

def uses_only(word, string) :
    word = word.lower()
    for letter in word :
        if letter not in string :
            return False
    return True


## 9. 5

def uses_all(word, string) :
    for letter in string :
        if letter not in word :
            return False
    return True


def num_all() :
    s = 0
    fin = open('words.txt')
    string = raw_input('string to check ')
    for line in fin :
        word = line.strip()
        if uses_all(word, string) == True :
            s += 1
    print s


## 9. 6

def is_abeceedarian(word) :
    for i in range(len(word) - 1) :
        if word[i] < word[i+1] :
            return False
    return True


def num_abe() :
    s = 0
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        if is_abeceedarian(word) == True :
            s += 1
    return s


## 9. 7   (seems my method is too redundant, shit)

def three_consec(word) :
    i = 0
    while i <= 4 :
        if word[i] != word[i + 1] :
            return False
        i = i + 2
    return True

def word_consec(word) :
    if len(word) < 6 :
        return False
    if three_consec(word):
        return True
    return word_consec(word[1 : ])

def find_consec() :
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        if word_consec(word) :
            return word
    return 'No word satisfied'


## 9. 8

def is_palindrome(word) :
    i = 0
    j = len(word) - 1

    while i < j :
        if word[i] != word[j] :
            return False
        i = i + 1
        j = j - 1

    return True


def tell_odometer(num) :
    if not is_palindrome(num[2 : ]) :
        return False

    new = int(num) + 1
    num = str(new)
    if not is_palindrome(num[1 : ]) :
        return False

    new = int(num) + 1
    num = str(new)
    if not is_palindrome(num[1 : 5]) :
        return False

    new = int(num) + 1
    num = str(new)
    if not is_palindrome(num) :
        return False

    return True


def find_odometer() :
    i = 100000
    while i < 999999 :
        if tell_odometer(str(i)) :
            print i
        i += 1
    

## 9. 9
#  despite a few difficulties in reading my code, I think my function is kind of BETTER than given answer

def reverse(a, b) :
    """ For two integers a, b,
         tell if they are reversed
         
         a : age of son
         b : age of mother
         b should bigger than a 
    """
    if len(str(a)) != len(str(b)) :
        a = str(a).zfill(len(str(b)))
    else :
        a = str(a)

    b = str(b)

    return a == b[: : -1]


def find_age(b) :
    """ Find the age of both son
         and mother

         b : age of mother when son
              is 1 year old
    """
    
    if b >= 100 :
        print 'no such age'
        return False

    mother = b
    son = 1
    count = 0
    
    while mother <= 100 :
        if reverse(son, mother) :
            count += 1
            print str(son) + '  ' +  str(mother)
            '''print out son's current age'''
            if count == 6 :
                age = son
                print ('my age now is ' + str(son))
            
        son += 1
        mother += 1

    print 'count is ' + str(count)
    if count != 8 :
        find_age(b + 1)
    else :
        print 'that is the right anwser'
        return age
        

##  Answer given by author

"""This module contains code from
Think Python by Allen B. Downey
http://thinkpython.com

Copyright 2012 Allen B. Downey
License: GNU GPLv3 http://www.gnu.org/licenses/gpl.html

http://www.cartalk.com/content/flipping-ages
"""

def str_fill(i, len):
    """return the integer (i) written as a string with at least
    (len) digits"""
    return str(i).zfill(len)


def are_reversed(i, j):
    """ return True if the integers i and j, written as strings,
    are the reverse of each other"""
    return str_fill(i,2) == str_fill(j,2)[::-1]


def num_instances(diff, flag=False):
    """returns the number of times the mother and daughter have
    pallindromic ages in their lives, given the difference in age.
    If flag==True, prints the details."""
    daughter = 0
    count = 0
    while True:
        mother = daughter + diff
        if are_reversed(daughter, mother) or are_reversed(daughter, mother+1):
            count = count + 1
            if flag:
                print daughter, mother
        if mother > 120:
            break
        daughter = daughter + 1
    return count
    

def check_diffs():
    """enumerate the possible differences in age between mother
    and daughter, and for each difference, count the number of times
    over their lives they will have ages that are the reverse of
    each other."""
    diff = 10
    while diff < 70:
        n = num_instances(diff)
        if n > 0:
            print diff, n
        diff = diff + 1

print 'diff  #instances'
check_diffs()

print
print 'daughter  mother'
num_instances(18, True)
 
    








            
            
