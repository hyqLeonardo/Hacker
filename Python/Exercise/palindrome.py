def first(word) :
    return word[0]

def last(word) :
    return word[-1]

def middle(word) :
    return word[1 : -1]

def is_palindrome(word) :
    if len(word) <= 1 :
        return True
    else :
        if first(word) == last(word) :
            word = middle(word)
            return is_palindrome(word)
        else :
            return False

def one_line_version(word) :
    return  word[: : 1] == word[: : -1]
