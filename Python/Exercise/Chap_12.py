import random

## 12. 1

def sumall(*args) :
    return sum(args)

## 12. 2  ------- clever 

def sort_by_length(words) :
    """ Given a list of words, sort by
         length in decreasing order,
         solve ties by random order.
    """

    t = []
    for word in words :
        t.append((len(word), random.random(), word))

    t.sort(reverse = True)

    res = []
    for (length, rand, word) in t :
        res.append(word)
    return res


## 12. 3

def histogram(s) :
    """ Given a string, return the times
          each word appeared in it.
    """
    d = dict()
    for c in s :
        d[c] = d.get(c, 0) + 1
    return d


def most_frequent(s) :
    hist = histogram(s)

    t = []
    for (char, freq) in hist.iteritems() :
        t.append((freq, char))

    t.sort(reverse = True)

    res = []
    for (freq, char) in t :
        res.append(char)

    return res
        

## 12. 4

def words_read() :
    words = []
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        words.append(word)

    return words

        
def anagrams(words) :

    d = dict()
    for word in words :
        l = list(word)
        l.sort()
        t = tuple(l)
        
        if t in d :
            d[t].append(word)
        else :
            d[t] = [word]

    res = []
    for t in d :
        if len(d[t]) > 1 :
            res.append((len(d[t]), d[t]))
                       
    res.sort(reverse = True)

    return res


## 12. 5

def word_distance(word1, word2) :         #------- that's clever !
    count = 0
    for (c1, c2) in zip(word1, word2) :
        if c1 != c2 :
            count += 1

    return count


def metathesis(words) :
    ana = anagrams(words)

    res = []
    for (length, l) in ana :
        for word1 in l :
            for word2 in l :
                if word1 < word2 and word_distance(word1, word2) == 2 :
                    res.append((word1, word2))

    return res
                


## 12. 6   ------------  My version is too slow, but it works although not accurately

cache = dict()

def check_reduce(word, res) :
    if word in cache :
        return cache[word]
    
    children = []
    flag = False
    
    for i in range(len(word)) :
        sub_word = word[ : i] + word[ i+1 : ]
        if sub_word not in children :
            children.append(sub_word)
        
    if children == [] or 'i' in children or 'a' in children :
        flag = True
        res.append('one word')
        return res
    else :
        for w in children :
            if w in words :
                res.append(w)
                return check_reduce(w, res)
            
    if flag == False :
        return []


def puzzler(words) :
    d = dict()
    
    for word in words :
        res = []
        check = check_reduce(word, res)

        if word not in cache :
            cache[word] = check
        
        if check != [] :
            d[word] = check

    return d
                

##### ----------------- The Anwser -----------------

"""This module contains code from
Think Python by Allen B. Downey
http://thinkpython.com

Copyright 2012 Allen B. Downey
License: GNU GPLv3 http://www.gnu.org/licenses/gpl.html

"""

def make_word_dict():
    """Reads the words in words.txt and returns a dictionary
    that contains the words as keys."""
    d = dict()
    fin = open('words.txt')
    for line in fin:
        word = line.strip().lower()
        d[word] = word

    # have to add single letter words to the word list;
    # also, the empty string is considered a word.
    for letter in ['a', 'i', '']:
        d[letter] = letter
    return d


"""memo is a dictionary that maps from each word that is known
to be reducible to a list of its reducible children.  It starts
with the empty string."""

memo = {}
memo[''] = ['']


def is_reducible(word, word_dict):
    """If word is reducible, returns a list of its reducible children.

    Also adds an entry to the memo dictionary.

    A string is reducible if it has at least one child that is 
    reducible.  The empty string is also reducible.

    word: string
    word_dict: dictionary with words as keys
    """
     # if have already checked this word, return the answer
    if word in memo:
        return memo[word]

    # check each of the children and make a list of the reducible ones
    res = []
    for child in children(word, word_dict):
        t = is_reducible(child, word_dict)
        if t:
            res.append(child)

    # memoize and return the result
    memo[word] = res
    return res


def children(word, word_dict):
    """Returns a list of all words that can be formed by removing one letter.

    word: string

    Returns: list of strings
    """
    res = []
    for i in range(len(word)):
        child = word[:i] + word[i+1:]
        if child in word_dict:
            res.append(child)
    return res


def all_reducible(word_dict):
    """Checks all words in the word_dict; returns a list reducible ones.

    word_dict: dictionary with words as keys
    """
    res = []
    for word in word_dict:
        t = is_reducible(word, word_dict)
        if t != []:
            res.append(word)
    return res


def print_trail(word):
    """Prints the sequence of words that reduces this word to the empty string.

    If there is more than one choice, it chooses the first.

    word: string
    """
    if len(word) == 0:
        return
    print word,
    t = is_reducible(word, word_dict)
    print_trail(t[0])


def print_longest_words(word_dict):
    words = all_reducible(word_dict)

    # use DSU to sort by word length
    t = []
    for word in words:
        t.append((len(word), word))
    t.sort(reverse=True)

    # print the longest 5 words
    for length, word in t[0:5]:
        print_trail(word)
        print '\n'


if __name__ == '__main__':
    word_dict = make_word_dict()
    print_longest_words(word_dict)













