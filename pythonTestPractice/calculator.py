def add(num1, num2):
    return num1 + num2
    
def palindrome(num):

    copy = num
    reverse = 0
    while num > 0:
        eachdigit = num % 10
        reverse = (reverse * 10) + eachdigit
        num //= 10
    
    if copy == reverse:
        return reverse
    else: 
        return 0
    
    
