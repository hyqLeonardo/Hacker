from random import randint
import time

## 10. 1

def nested_sum(L) :
    s = 0
    for i in range(len(L)) :
        if type(L[i]) == type([]) :
            temp = sum(L[i])
        else :
            temp = L[i]
        s += temp
    return s


## 10. 2

def capitalize_all(L) :
    res = []
    for s in L :
        res.append(s.capitalize())
    return res

def capitalize_nested(L) :
    res = []
    for i in range(len(L)) :
        if type(L[i]) == type([]) :
            L[i] = capitalize_all(L[i])
        else :
            L[i] = L[i].capitalize()
    return L

## 10. 3

def cumulative_sum(L) :
    res = []
    s = 0
    for t in L :
        s += t
        res.append(s)
    return res

## 10. 4

def middle(L) :
    L.pop()
    del L[0]
    return L

## 10.5

def chop(L) :
    L.pop()
    del L[0]
    return None


## 10. 6

def is_sorted(L) :
    if sorted(L) == L :
        return True
    else :
        return False


## 10. 7

def is_anagram(L1, L2) :
    if sorted(L1) == sorted(L2) :
        return True
    else :
        return False


## 10. 8

def has_duplicates(L) :
        for i in range(len(L)) :
            if L[i] in L[i+1 : ] :
                return True
        return False

def generate_birth() :   
    Birth = list()
    for i in range(23) :
        month = randint(1, 12)
        day = randint(1, 30)
        birth = [month, day]       # oh, it's stupid , hah -- hah
        Birth.append(birth)
    return Birth

def prob_same_birth(t) :
    """ t : how many times the test run
    """
    s = 0.0
    for i in range(t) :
        Birth = generate_birth()
        if has_duplicates(Birth) :
            s += 1
    return s/t


## 10. 9

def remove_duplicates(L) :      # well, the word "remove" is a trap ~
    unique = []
    for i in range(len(L)-1) :
        if L[i] not in unique :
            unique.append(L[i])
    return unique
        


## 10. 10

def words_list1() :
    words = []
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        words.append(word)
    return words

def words_list2() :
    words = []
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        words = words + [word]
    return words

### ------------------------------------------  anwser ---------------------------------------------

def make_word_list1():
    """Reads lines from a file and builds a list using append."""
    t = []
    fin = open('words.txt')
    for line in fin:
        word = line.strip()
        t.append(word)
    return t

def make_word_list2():
    """Reads lines from a file and builds a list using list +."""
    t = []
    fin = open('words.txt')
    for line in fin:
        word = line.strip()
        t = t + [word]
    return t

# If want to test the speed of two approch, use codes below.
# First method uses 0.047 seconds, while the second
# uses 92 seconds

"""
start_time = time.time()
t = make_word_list1()
elapsed_time = time.time() - start_time

print len(t)
print elapsed_time, ' seconds'

start_time = time.time()
t = make_word_list2()
elapsed_time = time.time() - start_time

print len(t)
print elapsed_time, ' seconds'
"""


## 10. 11

# Holy crap, almost  two hours dealing with some bugs, 
# and in the end seems okay for multiple inputs, yet I can't be
# sure this is completely right.

# Ps : I don't understand the anwser given by author

def bisect(word, L) :               
    """ Find the word in sorted list. 
         The words in list must be sorted
         L : sorted list
    """

    for i in range(len(word)) :
        n = len(L)
        if n == 1 :
            return L[0] == word
        
        half = n/2
        flag = False

        while n > 1 and flag == False:
            #print n
            
            if n % 2 != 0 :
                n = n + 1
                
            n = n / 2
            L_word = L[half]
            #print L_word

            if word[0 :  i+1] > L_word[0 :  i+1] :
                half = half + n/2

            elif word[0 :  i+1] < L_word[0 : i+1] :
                half = half - n/2

            elif word[0 : i+1] == L_word[0 : i+1] :
                L = L[half - n + 1 : half + n]
                #if n <= 223 :
                    #print L
                flag = True
            #print " "

        if flag == False :
            return False

    return True
    

## 10. 12

def reverse_pair(L) :
    """ Given a list L, find reversed
         pairs in it
    """
    reverse = []
    while len(L) > 0 :
        word = L[0]
        if word[: : -1] not in reverse :
            if bisect(word[: : -1], L) :
                reverse.append(word)

        L.remove(word)
        print L
    return reverse


## 10. 13

def interlock(L) :
    """ Given a list L, find interlocked
         pairs in it
    """
    Interlock = []

    for word_1 in L :
        n = len(word_1)
        for word_2 in L :
            new_word = []
            
            if len(word_2) ==n :
                for i in range(n) :
                    new_word.append(word_1[i])
                    new_word.append(word_2[i])
                new_word = ''.join(new_word)

                if bisect(new_word, L) :
                    Interlock.append([word_1, word_2, new_word])
                
    return Interlock
                
        
## 11. 1

def words_key() :
    """ Use words in words.txt as key value
          to build a dictionary
    """
    d = dict()
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        d[word] = 0
    return d


l = words_list1()
d = words_key()

start_time = time.time()
w_l = bisect('perfect', l)
elapsed_time  = time.time() - start_time
print elapsed_time, " seconds"

start_time = time.time()
w_d = d['perfect']
elapsed_time = time.time() - start_time
print elapsed_time, " seconds"
    



    
