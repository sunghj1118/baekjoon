#Problem 1

print("Hello World!")
print("My name is HyunJoon Sung!")

#Problem 2
print("*** *** *** ***")
print("  * *   * *   *")
print("  * *** *** ***")
print("  *   *   *   *")
print("  * *** *** ***")

class Palindrome:
    
    def __init__(self, s):
        self.s = s
    
    def isPalindrome(self) -> bool:
        strs = []
        
        for char in self.s:
            if char.isalnum():
                strs.append(char.lower())
                
        while len(strs) > 1:
            if strs.pop(0) != strs.pop():
                return False
        
        return True

p1 = Palindrome("tacocat")
p2 = Palindrome("cat")

print(p1.isPalindrome())
print(p2.isPalindrome())
